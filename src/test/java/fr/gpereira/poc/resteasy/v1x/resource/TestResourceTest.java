package fr.gpereira.poc.resteasy.v1x.resource;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import fr.gpereira.poc.resteasy.data.TestBean;

public class TestResourceTest {

	private TestResource resource;
	
	@Before
	public void before() {
		resource = new FakeTestResource();
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

	@Test(expected = NullPointerException.class)
	public void createFail() {
		resource.create(null);
	}

	@Test(expected = NullPointerException.class)
	public void readFail(){
		resource.read(null);
	}
	
	@Test(expected = NullPointerException.class)
	public void readFail2(){
		resource.read("56");
	}

	@Test(expected = NullPointerException.class)
	public void deleteFail() {
		resource.delete(null);
	}

}
