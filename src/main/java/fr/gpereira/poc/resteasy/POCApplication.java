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

	private final Set<Object> singletons = new HashSet<>();

	public POCApplication() {
		singletons.add(new FakeTestResource());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return new HashSet<Class<?>>();
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
