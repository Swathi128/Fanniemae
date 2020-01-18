package com.fanniemae.automation.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class CSVUtil {

	public static final Logger LOG=Logger.getLogger(CSVUtil.class.getName());
	
	private CSVUtil() {}
	
	public static boolean writeToCSV(List<String[]> data, Path path){
		boolean isWritten=false;
		if(CollectionUtils.isNotEmpty(data)) {
			try (FileWriter fileWriter = new FileWriter(path.toFile());
				 CSVWriter writer = new CSVWriter(fileWriter);){
				writer.writeAll(data);
				writer.flush();
				isWritten=true;
			}catch(IOException e) {
				LOG.error(e.getMessage(),e);
			}
		}
		return isWritten;
	}
	
	public static boolean writeToCSV(ResultSet rs, Path path, boolean includeHeaders){
		boolean isWritten=false;
		if(rs!=null) {
			try (FileWriter fileWriter = new FileWriter(path.toFile());
				CSVWriter writer = new CSVWriter(fileWriter);){
				writer.writeAll(rs, includeHeaders);
				writer.flush();
				isWritten=true;
			}catch(IOException | SQLException e) {
				LOG.error(e.getMessage(),e);
			}
		}
		return isWritten;
	}
	
	public static List<String[]> loadCSV(Path path){
		List<String[]> list=null;
		try (FileReader fileReader = new FileReader(path.toFile());
				CSVReader reader = new CSVReader(fileReader);){
				list=reader.readAll();
			}catch(IOException e) {
				LOG.error(e.getMessage(),e);
			}
		return list;
	}
}