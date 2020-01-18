package com.techouts.fanniemae.exceptions;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class WebElementOperationException extends FannieMaeBusinessException {

	private static final long serialVersionUID = 1L;

	public WebElementOperationException() {}

	public WebElementOperationException(String message) {
		super(message);
	}

	public WebElementOperationException(Throwable cause) {
		super(cause);
	}

	public WebElementOperationException(String message, Throwable cause) {
		super(message, cause);
	}

	public WebElementOperationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
