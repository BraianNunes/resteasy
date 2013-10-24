package fr.gpereira.poc.resteasy;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import fr.gpereira.poc.resteasy.v1x.resource.FakeTestResource;
// TODO use javax.ws.rs.Application instead

/**
 * This class is used to register REST WS resources.
 * 
 * A classpath scanner is also available using the resteasy.scan <context-param> in web.xml file. 
 * 
 * @author gpereira
 *
 */
public class POCApplication extends Application {

	private final HashSet<Object> singletons = new HashSet<Object>();

	public POCApplication() {
		singletons.add(new FakeTestResource());
	}

	@Override
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> set = new HashSet<Class<?>>();
		return set;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
