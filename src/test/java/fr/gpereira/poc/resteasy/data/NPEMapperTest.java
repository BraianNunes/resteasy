package fr.gpereira.poc.resteasy.data;

import static junit.framework.Assert.assertSame;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.Before;
import org.junit.Test;

import fr.gpereira.poc.resteasy.NPEMapper;

public class NPEMapperTest {

	private NPEMapper exceptionMapper;
	
	@Before
	public void before() {
		exceptionMapper = new NPEMapper();
	}
	
	@Test
	public void testToResponse() {
		final NullPointerException npe = new NullPointerException("test");
		final Response response = exceptionMapper.toResponse(npe);
		assertSame(npe.getMessage(), response.getEntity());
		assertSame(Status.NOT_FOUND, response.getStatusInfo());
	}

}