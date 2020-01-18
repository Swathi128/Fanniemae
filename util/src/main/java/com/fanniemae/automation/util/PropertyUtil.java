package com.fanniemae.automation.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class PropertyUtil {

	private static final String PROPS_FILE = "src/main/resources/config.properties";
	private static final Logger LOG = Logger.getLogger(PropertyUtil.class.getName());
	
	private PropertyUtil() {}
	
	private static Properties properties = null;
	
	
	public static Properties getProperties() {
		if(Objects.isNull(properties))
			initProperties(PROPS_FILE);
		return properties;
	}
	
	private static void initProperties(String file) {
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			properties = new Properties();
			properties.load(reader);
		} catch (FileNotFoundException e) {
			LOG.error("File["+file+"] is not available at the given location",e);
		} catch (IOException e) {
			LOG.error("Error occurred while reading the file.");
		}
	}
	
	public static String getString(String key) {
		return (StringUtils.isNotBlank(key) ) ? getProperties().getProperty(key) : null;
	}
	
	public static String getString(String key, String arg) {
		if(StringUtils.isNotBlank(key)) {
			String val = getProperties().getProperty(key);
			return (StringUtils.isNotBlank(val)) ? val : arg;
		}
		return arg;
	} 
	
	public static int getInt(String key){
		return Integer.parseInt(getString(key));
	}
	
	public static int getInt(String key, int val){
		String prop = getString(key);
		return (StringUtils.isNotBlank(prop)) ? Integer.parseInt(prop) : val;
	}
	
	public static Integer getInteger(String key){
		if(StringUtils.isNotBlank(key)){
			String val = getString(key);
			if(StringUtils.isNotBlank(val))
				return Integer.valueOf(val);
		}
		return null;
	}
	
	public static Integer getInt(String key, Integer val){
		if(StringUtils.isNotBlank(key)){
			String prop = getString(key);
			return (StringUtils.isNotBlank(prop))? Integer.valueOf(prop) : val;
		}
		return val;
	}
}