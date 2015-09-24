package com.goeuro.exception;

/**
 * The Class GoEuroException.
 */
public class GoEuroException extends RuntimeException {
	
	/** The Constant serialVersionUID. */
	static final long serialVersionUID = 1L;
	
	/**
	 * Instantiates a new go euro exception.
	 *
	 * @param errorMessage the error message
	 */
	public GoEuroException(String errorMessage)
	{
		super(errorMessage);
	}

}
