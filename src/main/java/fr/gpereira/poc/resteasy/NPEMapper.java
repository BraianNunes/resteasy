package fr.gpereira.poc.resteasy;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Used to map a NPE to a clean HTTP response
 * 
 * @author gpereira
 *
 */
public class NPEMapper implements ExceptionMapper<NullPointerException>{

	@Override
	public Response toResponse(NullPointerException e) {
		return Response.status(Status.NOT_FOUND).entity(e.getMessage()).type(MediaType.TEXT_PLAIN).build();
	}

}
