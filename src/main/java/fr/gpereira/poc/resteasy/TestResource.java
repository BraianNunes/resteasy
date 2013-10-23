package fr.gpereira.poc.resteasy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.common.base.Preconditions;

@Path("directory")
public class TestResource {
	
	private static final Map<String, TestBean> beans = new HashMap<>();
	{
		beans.put("1", new TestBean("1", "String", 42, true, new Date()));
		beans.put("2", new TestBean("2", "String", 42, true, new Date()));
		beans.put("3", new TestBean("3", "String", 42, true, new Date()));
		beans.put("4", new TestBean("4", "String", 42, true, new Date()));
		beans.put("5", new TestBean("5", "String", 42, true, new Date()));		
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public TestBean getTestBean(@PathParam("id") final String id) {
		Preconditions.checkNotNull(id);
		final TestBean bean = beans.get(id);
		if (bean == null){
			throw new NullPointerException("No bean found");
		}
		return bean; 
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public TestBean postTestBean(final TestBean bean) {
		Preconditions.checkNotNull(bean);
		Preconditions.checkNotNull(bean.getId());
		beans.put(bean.getId(), bean);
		return bean; 
	}


}
