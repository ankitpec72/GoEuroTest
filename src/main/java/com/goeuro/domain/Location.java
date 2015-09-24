package com.goeuro.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Location.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
	
	/** The _id. */
	private String _id;
    
    /** The key. */
    private String key;
    
    /** The name. */
    private String name;
    
    /** The full name. */
    private String fullName;
    
    /** The iata_airport_code. */
    private String iata_airport_code;
    
    /** The type. */
    private String type;
    
    /** The country. */
    private String country;
    
    /** The geo_position. */
    private Position geo_position;
    
    /** The location id. */
    private String locationId;
    
    /** The in europe. */
    private boolean inEurope;
    
    /** The country code. */
    private String countryCode;
    
    /** The core country. */
    private String coreCountry;
    
    /** The distance. */
    private String distance;
    
    /**
     * Instantiates a new location.
     */
    public Location(){}
    
	/**
	 * Gets the _id.
	 *
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	
	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the full name.
	 *
	 * @return the full name
	 */
	public String getFullName() {
		return fullName;
	}
	
	/**
	 * Gets the iata_airport_code.
	 *
	 * @return the iata_airport_code
	 */
	public String getIata_airport_code() {
		return iata_airport_code;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * Gets the geo_position.
	 *
	 * @return the geo_position
	 */
	public Position getGeo_position() {
		return geo_position;
	}
	
	/**
	 * Gets the location id.
	 *
	 * @return the location id
	 */
	public String getLocationId() {
		return locationId;
	}
	
	/**
	 * Checks if is in europe.
	 *
	 * @return true, if is in europe
	 */
	public boolean isInEurope() {
		return inEurope;
	}
	
	/**
	 * Gets the country code.
	 *
	 * @return the country code
	 */
	public String getCountryCode() {
		return countryCode;
	}
	
	/**
	 * Gets the core country.
	 *
	 * @return the core country
	 */
	public String getCoreCountry() {
		return coreCountry;
	}
	
	/**
	 * Gets the distance.
	 *
	 * @return the distance
	 */
	public String getDistance() {
		return distance;
	}
    
    

}
