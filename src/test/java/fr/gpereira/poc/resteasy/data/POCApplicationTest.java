package fr.gpereira.poc.resteasy.data;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fr.gpereira.poc.resteasy.POCApplication;

public class POCApplicationTest {

	private POCApplication application;
	
	@Before
	public void before() {
		application = new POCApplication();
	}
	
	@Test
	public void testGetClasses() {
	    assertTrue(application.getClasses().isEmpty());
	}

	@Test
	public void testGetSingletons() {
		assertEquals(1, application.getSingletons().size());
	}
}