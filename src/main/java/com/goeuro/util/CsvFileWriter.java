package com.goeuro.util;

import static com.goeuro.contants.GoEuroConstants.COMMA_DELIMITER;
import static com.goeuro.contants.GoEuroConstants.FILE_HEADER;
import static com.goeuro.contants.GoEuroConstants.NEW_LINE_SEPARATOR;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.goeuro.domain.Location;

/**
 * The Class CsvFileWriter.
 */
public final class CsvFileWriter {

	private static final Log logger = LogFactory.getLog(CsvFileWriter.class);

	/**
	 * Instantiates a new csv file writer.
	 */
	private CsvFileWriter() {
	}

	/**
	 * Write csv file.
	 *
	 * @param fileName
	 *            the file name
	 * @param locations
	 *            the locations
	 */
	public static void writeCsvFile(String fileName, List<Location> locations) {

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.append(FILE_HEADER.toString());
			fileWriter.append(NEW_LINE_SEPARATOR);

			for (Location location : locations) {
				fileWriter.append(location.get_id());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(location.getName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(location.getType());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(location.getGeo_position().getLatitude());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(location.getGeo_position().getLongitude());
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			logger.info("CSV file 'Locations.csv'was created successfully !!!");

		} catch (Exception e) {
			logger.info("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				logger.info("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}
		}
	}
}
