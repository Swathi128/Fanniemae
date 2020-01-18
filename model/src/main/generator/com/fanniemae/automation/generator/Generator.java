package com.fanniemae.automation.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.log4j.Logger;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Generator {

	static Logger log = Logger.getLogger(Generator.class.getName());

	public static void main(String[] args) throws Exception {

		File modelsFolder = new File("models");
		File[] files = modelsFolder.listFiles();

		FileOutputStream stream = new FileOutputStream(new File("D:\\Software\\sample.log"));

		stream.write(("********************************" + modelsFolder.getAbsolutePath()).getBytes());

		String basePackage = "src/main/java/com/fanniemae/automation/";
		String basePackageDot = "com.fanniemae.automation";

		File basePackageFile = new File(basePackage);
		File modelPkg =new File(basePackageDot);
		modelPkg.mkdirs();

		for(File file : files) {

			JSONObject obj = null;
			obj = (JSONObject) new JSONParser().parse(new FileReader(file));

			if (obj == null) {
				continue;
			}
			String pkg = (String) obj.get("module");
			String modulePackage = basePackageDot + "." + pkg + ".model";
			String modulePackageFolder = basePackage + "/" + pkg + "/model";
			JSONArray clses = (JSONArray) obj.get("models");
			final JavaClassSource moduleClass = Roaster.create(JavaClassSource.class);
			final String moduleClassName = (pkg.charAt(0) + "").toUpperCase() + pkg.substring(1);
			moduleClass.setPackage(modulePackage).setName(moduleClassName);

			String methodCode = "public void init(WebDriver driver) {";

			for (int i = 0; i < clses.size(); i++) {
				{
					File folder = new File(modulePackageFolder);
					folder.mkdirs();
				}
				JSONObject clssObj = (JSONObject) clses.get(i);
				String cls = (String) clssObj.get("name");
				String classFile = modulePackageFolder + "/" + cls + ".java";
				final JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
				javaClass.setPackage(modulePackage).setName(cls);

				moduleClass.addImport(modulePackage + "." + cls);

				javaClass.addImport("org.openqa.selenium.WebElement");
				javaClass.addImport("org.openqa.selenium.support.FindBy");

				JSONArray elements = (JSONArray) clssObj.get("elements");
				for (int j = 0; j < elements.size(); j++) {
					JSONObject element = (JSONObject) elements.get(j);
					String key = (String) element.get("key");
					String value = (String) element.get("value");
					String type = (String) element.get("type");

					/*
					 * javaClass.addProperty(WebElement.class,
					 * key).setAccessible(true).getField().setPublic()
					 * .setStatic(true).addAnnotation(FindBy.class).
					 * setStringValue("id", value);
					 */

					javaClass.addField().setType(WebElement.class).setName(key).setPublic().setStatic(true)
							.addAnnotation(FindBy.class).setStringValue(type.toLowerCase(), value);
				}

				String variableName = (cls.charAt(0) + "").toLowerCase() + cls.substring(1);
				moduleClass.addProperty(cls, variableName).setAccessible(true).getField().setPublic();

				methodCode = methodCode + "" + variableName + " = PageFactory.initElements(driver, " + cls + ".class);";
				
				

				Files.write(Paths.get(classFile), javaClass.toString().getBytes());
			}

			methodCode = methodCode + "}";

			moduleClass.addMethod(methodCode);

			moduleClass.addImport(PageFactory.class);
			moduleClass.addImport(WebDriver.class);

			Files.write(Paths.get(modulePackageFolder + "/" + moduleClassName + ".java"),
					moduleClass.toString().getBytes());

		}

		stream.close();

	}

}
