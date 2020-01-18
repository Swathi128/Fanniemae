package com.fanniemae.automation.dto.testcase;

import java.util.UUID;

import com.fanniemae.automation.consts.FanniemaeConstants;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public final class TestCaseResult {
	
	private String testCase;
	private boolean isPassed;
	private String id;
	private String comment;
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public TestCaseResult(String testCase, boolean isPassed) {
		super();
		this.testCase = testCase;
		this.isPassed = isPassed;
		this.id = UUID.randomUUID().toString();
	}
	
	public TestCaseResult(String testCase, boolean isPassed, String comment) {
		this(testCase, isPassed);
		this.comment = comment;
	}

	public String getTestCase() {
		return testCase;
	}
	
	public boolean isPassed() {
		return isPassed;
	}
	
	public String isPassedAsString() {
		return (isPassed) ? FanniemaeConstants.PASS : FanniemaeConstants.FAIL;
	}
	
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "TestCaseResult [testCase=" + testCase + ", isPassed="
				+ isPassed + ", id=" + id + ", comment=" + comment + "]";
	}
}
