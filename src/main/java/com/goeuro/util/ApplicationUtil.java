package com.goeuro.util;

import com.goeuro.exception.GoEuroException;

/**
 * The Class ApplicationUtil.
 */
public final class ApplicationUtil {

	/**
	 * Instantiates a new application util.
	 */
	private ApplicationUtil(){}
	
	
	/**
	 * Throw error message.
	 *
	 * @param errorMessage the error message
	 */
	public static void throwErrorMessage(String errorMessage) {
		throw new GoEuroException(errorMessage);
	}
}
