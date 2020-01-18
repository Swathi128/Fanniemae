package com.techouts.fanniemae.exceptions;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class AssertException extends FannieMaeBusinessException {

	private static final long serialVersionUID = 1L;

	public AssertException() {}

	public AssertException(String message) {
		super(message);
	}

	public AssertException(Throwable cause) {
		super(cause);
	}

	public AssertException(String message, Throwable cause) {
		super(message, cause);
	}

	public AssertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
