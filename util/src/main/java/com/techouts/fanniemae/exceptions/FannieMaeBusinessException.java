package com.techouts.fanniemae.exceptions;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class FannieMaeBusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FannieMaeBusinessException() {}

	public FannieMaeBusinessException(String message) {
		super(message);
		}

	public FannieMaeBusinessException(Throwable cause) {
		super(cause);
	}

	public FannieMaeBusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public FannieMaeBusinessException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
