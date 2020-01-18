package com.fanniemae.automation.registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.log4j.Logger;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public final class Registry {

	private static Map<String, Object> vault = new HashMap<>();
	private Registry() {}
	
	private static final Logger LOG = Logger.getLogger(Registry.class.getName());
	
	public static void setAttribute(String key, Object val){
		if(Objects.nonNull(key)){
			LOG.debug("Inserting an element to Registry[Key["+key+"],["+val+"]].");
			vault.put(key, val);
		}
	}
	
	public static void setAttributes(Map<String, Object> attributes){
		vault.putAll(attributes);
	}
	
	public static Object getAttribute(String key) {
		if(Objects.nonNull(key)) {
			ensureKeyIsPresent(key);
			return vault.get(key);
		}
		else
			return key;
	}
	
	public static Object removeAttribute(String key) {
		return (Objects.nonNull(key) && vault.containsKey(key))? vault.remove(key) : key;
	}
	
	public static List<Object> removeAttributes(String... keys) {
		List<Object> removedValues = new ArrayList<>();
		for(String key : keys) {
			if(vault.containsKey(key))
				removedValues.add(vault.remove(key));
		}
		return removedValues;
	}

	public static void removeAll() {
		vault.clear();
	}
	
	private static void ensureKeyIsPresent(String key) {
		if(!vault.containsKey(key))
			vault.put(key, null);
	}
}
