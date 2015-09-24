package com.goeuro.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Position.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Position {

	/** The latitude. */
	private String latitude;
    
    /** The longitude. */
    private String longitude;
    
	/**
	 * Instantiates a new position.
	 */
	public Position() {}
	
	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	
	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
}
