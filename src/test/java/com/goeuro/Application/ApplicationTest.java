package com.goeuro.Application;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.client.RestOperations;

import com.goeuro.application.Application;
import com.goeuro.exception.GoEuroException;
import com.goeuro.service.LocationService;

/**
 * Unit test for Application.
 */
@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {
	@Mock
	RestOperations restTemplate;

	@Mock
	LocationService service;

	@InjectMocks
	Application application;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	
	@Test
	public void testApplication() {
		String[] args = { "FRA" };
		application.main(args);
	}
	
	@Test
	public void testLocationService() {
		String[] args = { "FRA" };
		Mockito.when(
				restTemplate.getForObject(Mockito.any(String.class),Mockito.any(Class.class), Mockito.any(Object.class)))
				.thenReturn("");

		service.writeResponseDatatoCsv(args[0]);
	}

	@Test(expected = GoEuroException.class)
	public void testArgumentsMissingException() {
		String[] args = new String[0];
		application.main(args);
	}

	@Test(expected = GoEuroException.class)
	public void testNoRecordsFoundException() {
		String[] args = { "F" };
		application.main(args);
	}
}
