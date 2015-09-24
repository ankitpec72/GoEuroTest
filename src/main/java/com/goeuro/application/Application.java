package com.goeuro.application;

import static com.goeuro.contants.GoEuroConstants.MISSING_COMMAND_LING_ARG;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.goeuro.service.LocationService;
import com.goeuro.util.AppConfig;
import com.goeuro.util.ApplicationUtil;

/**
 * The Class Application.
 */
public class Application {
	
	private static final String LOCATION_SERVICE_BEAN = "locationService";

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		// Throw runtime exception if No Argument is passed
		if (args.length == 0) {
			ApplicationUtil.throwErrorMessage(MISSING_COMMAND_LING_ARG);
		}

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		LocationService service = (LocationService) context.getBean(LOCATION_SERVICE_BEAN);
		service.writeResponseDatatoCsv(args[0]);
	}
}
