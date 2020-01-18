package com.fanniemae.automation.dto.testcase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class SuiteResult {
	
	private List<TestCaseResult> testCaseResults;
	
	public SuiteResult() {
		testCaseResults = new ArrayList<>();
	}

	public List<TestCaseResult> getTestCaseResults() {
		return testCaseResults;
	}

	public void setTestCaseResults(List<TestCaseResult> testCaseResults) {
		this.testCaseResults = testCaseResults;
	}
	
	public void setTestCaseResult(TestCaseResult testCaseResult) {
		this.testCaseResults.add(testCaseResult);
	}
	
	public long getPassedTestCases() {
		long totalPassed = 0;
		if(isListNotNull()) {
			totalPassed = getTestCaseResults().stream().filter(this::isPassed).count();
		}
		return Long.valueOf(totalPassed);
	}
	
	public long getFailedTestCases() {
		long totalFailed = 0;
		if(isListNotNull()) {
			totalFailed = getTestCaseResults().stream().filter(this::isNotPassed).count();
		}
		return Long.valueOf(totalFailed);
	}
	
	public int getTotatlTestCasesExecuted() {
		return (isListNotNull()) ? testCaseResults.size() : 0;
	}
	
	private boolean isPassed(TestCaseResult result) {
		return result.isPassed();
	}
	
	private boolean isNotPassed(TestCaseResult result) {
		return !isPassed(result);
	}
	
	private boolean isListNotNull() {
		return (Objects.nonNull(testCaseResults) && !testCaseResults.isEmpty()) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue();
	}
}