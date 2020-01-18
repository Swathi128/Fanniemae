package com.techouts.fanniemae.exceptions;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class ExcelReadWriteException extends FannieMaeBusinessException {
	private static final long serialVersionUID = 1L;

	public ExcelReadWriteException() {
		super();
	}

	public ExcelReadWriteException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ExcelReadWriteException(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcelReadWriteException(String message) {
		super(message);
	}

	public ExcelReadWriteException(Throwable cause) {
		super(cause);
	}
}
