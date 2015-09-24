package com.goeuro.contants;

/**
 * The Class GoEuroConstants.
 */
public final class GoEuroConstants {

	/**
	 * Instantiates a new go euro constants.
	 */
	private GoEuroConstants() {
	}

	/** The Constant LOCATION_URL. */
	public static final String LOCATION_URL = "http://api.goeuro.com/api/v2/position/suggest/en/";

	/** The Constant NO_LOCATION_FOUND. */
	public static final String NO_LOCATION_FOUND = "No Location found for this City";

	/** The Constant MISSING_COMMAND_LING_ARG. */
	public static final String MISSING_COMMAND_LING_ARG = "Command Line Argument Not Passed";
	
	/** The Constant FILE_NAME. */
	public static final String FILE_NAME = "Locations.csv";

	// CSV Writer Contants
	// Delimiter used in CSV file
	/** The Constant COMMA_DELIMITER. */
	public static final String COMMA_DELIMITER = ",";

	/** The Constant NEW_LINE_SEPARATOR. */
	public static final String NEW_LINE_SEPARATOR = "\n";

	// CSV file header
	/** The Constant FILE_HEADER. */
	public static final String FILE_HEADER = "_id, name, type, latitude, longitude";
}
