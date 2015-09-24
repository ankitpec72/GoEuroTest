package com.goeuro.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.goeuro.service.LocationService;
import com.goeuro.service.LocationServiceImpl;

/**
 * The Class AppConfig.
 */
@Configuration
public class AppConfig {

	/**
	 * Gets the location service.
	 *
	 * @return the location service
	 */
	@Bean(name="locationService")
    public LocationService getLocationService() {
        return new LocationServiceImpl();
    }
	
	/**
	 * Gets the rest template.
	 *
	 * @return the rest template
	 */
	@Bean
	public RestOperations getRestTemplate()
	{
		return new RestTemplate();
	}
	
	
}
