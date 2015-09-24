package com.goeuro.service;

import static com.goeuro.contants.GoEuroConstants.FILE_NAME;
import static com.goeuro.contants.GoEuroConstants.LOCATION_URL;
import static com.goeuro.contants.GoEuroConstants.NO_LOCATION_FOUND;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestOperations;

import com.goeuro.domain.Location;
import com.goeuro.util.ApplicationUtil;
import com.goeuro.util.CsvFileWriter;

/**
 * The Class LocationServiceImpl.
 */
public class LocationServiceImpl implements LocationService {

	/** The rest template. */
	@Autowired
	RestOperations restTemplate;

	/* (non-Javadoc)
	 * @see com.goeuro.service.LocationService#writeResponseDatatoCsv(java.lang.String)
	 */
	public void writeResponseDatatoCsv(String cityName) {

		// Using RestTemplate for client-side HTTP access
		StringBuilder urlAppender = new StringBuilder(LOCATION_URL);
		urlAppender.append(cityName);
		Location[] locations = restTemplate.getForObject(urlAppender.toString(),Location[].class);
		writeDataToCsvFile(Arrays.asList(locations));
	}

	/**
	 * Write data to csv file.
	 *
	 * @param listOfLocations the list of locations
	 */
	private void writeDataToCsvFile(List<Location> listOfLocations) {
		
		if (listOfLocations.size() == 0) {
			ApplicationUtil.throwErrorMessage(NO_LOCATION_FOUND);
		}

		CsvFileWriter.writeCsvFile(FILE_NAME, listOfLocations);
	}
}
