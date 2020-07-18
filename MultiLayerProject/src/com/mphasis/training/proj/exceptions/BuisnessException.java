package com.mphasis.training.proj.exceptions;

public class BuisnessException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BuisnessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public BuisnessException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public BuisnessException(String message) {
		super(message);
	
	}

	public BuisnessException(Throwable cause) {
		super(cause);

	}

	

}
