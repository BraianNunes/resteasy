package fr.gpereira.poc.resteasy.v1x.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.gpereira.poc.resteasy.data.TestBean;

/**
 * 
 * Test resource client
 * 
 * @author gpereira
 * 
 */
public interface TestResource {

	/**
	 * Returns a TestBean
	 * 
	 * @param id
	 *            the TestBean id
	 * @return
	 */
	@GET
	@Path("/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	TestBean read(@PathParam("id") final String id);

	/**
	 * Creates or updates a test bean
	 * 
	 * @param bean
	 * @return
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	TestBean create(final TestBean bean);

	/**
	 * Deletes a test bean
	 * 
	 * @param id
	 */
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	void delete(@PathParam("id") final String id);

	/**
	 * Lists all test beans
	 * 
	 * @return
	 */
	@GET
	@Path("/list")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	TestBean[] list();
}
