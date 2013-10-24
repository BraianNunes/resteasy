package fr.gpereira.poc.resteasy.v1x.resource;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Path;

import com.google.common.base.Preconditions;

import fr.gpereira.poc.resteasy.data.TestBean;

/**
 * 
 * Test resource implementation that uses a static map to store test beans 
 * 
 * @author gpereira
 * 
 */
@Path("v1.x/test")
public class FakeTestResource implements TestResource {

	private static final Map<String, TestBean> beans = new HashMap<>();
	{
		beans.put("1", new TestBean("1", "String", 42, true, new Date()));
		beans.put("2", new TestBean("2", "String", 42, true, new Date()));
		beans.put("3", new TestBean("3", "String", 42, true, new Date()));
		beans.put("4", new TestBean("4", "String", 42, true, new Date()));
		beans.put("5", new TestBean("5", "String", 42, true, new Date()));
	}

	@Override
	public TestBean read(final String id) {
		Preconditions.checkNotNull(id);
		final TestBean bean = beans.get(id);
		Preconditions.checkNotNull(bean, "No bean found");
		return bean;
	}

	@Override
	public TestBean create(final TestBean bean) {
		Preconditions.checkNotNull(bean);
		Preconditions.checkNotNull(bean.getId());
		beans.put(bean.getId(), bean);
		return bean;
	}

	@Override
	public void delete(final String id) {
		Preconditions.checkNotNull(id);
		beans.remove(id);
	}

	@Override
	public TestBean[] list() {
		return beans.values().toArray(new TestBean[] {});
	}

}
