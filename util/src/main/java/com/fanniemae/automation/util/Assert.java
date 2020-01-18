package com.fanniemae.automation.util;

import com.fanniemae.automation.util.exceptions.AssertException;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class Assert {

	private Assert() {}
	
	public static void assertTrue(boolean val, String msg) {
		if(!val)
			throw new AssertException(msg);
	}
	
	public static void assertTrue(boolean val) {
		if(!val)
			throw new AssertException();
	}
	
	public static void assertEquals(String actual, String expected, String msg) {
		if(!actual.equals(expected))
			throw new AssertException(msg);
	}
	
	public static void assertEquals(String actual, String expected) {
		if(!actual.equals(expected))
			throw new AssertException();
	}
	
}
