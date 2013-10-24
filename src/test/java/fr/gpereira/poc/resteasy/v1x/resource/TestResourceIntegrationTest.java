package fr.gpereira.poc.resteasy.v1x.resource;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.Before;
import org.junit.Test;

import fr.gpereira.poc.resteasy.data.TestBean;

public class TestResourceIntegrationTest {

	private TestResource resource;
	
	@Before
	public void before() {
		Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:9999/resteasy/api/v1.x/test/");
        ResteasyWebTarget rtarget = (ResteasyWebTarget)target;

        resource = rtarget.proxy(TestResource.class);
	}
	
	@Test
	public void createRetrieveListAndDeleteTest() {
		final TestBean bean = new TestBean("15", "String", 42, false, new Date());
		
		final TestBean returned = resource.create(bean);
		
		assertEquals(bean, returned);
		
		final TestBean get = resource.read("15");
		assertEquals(bean, get);
		
		final TestBean[] beans = resource.list();
		assertEquals(beans.length, 6);
		
		resource.delete("15");
		
		final TestBean[] beans2 = resource.list();
		assertEquals(beans2.length, 5);
	}

	@Test(expected = NotFoundException.class)
	public void readFail2(){
		resource.read("56");
	}

}
