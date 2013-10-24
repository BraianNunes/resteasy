package fr.gpereira.poc.resteasy;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertSame;

import java.util.Date;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import org.junit.Test;

import fr.gpereira.poc.resteasy.data.TestBean;

public class TestBeanTest {

	private static final String FAKE_ID = "1";
	private static final String FAKE_STRING = "Str";
	private static final Integer FAKE_INT = 1;
	private static final Boolean FAKE_BOOL = false;
	private static final Date FAKE_DATE = new Date();

	@Test
	public void testEquals() {
	    EqualsVerifier.forClass(TestBean.class).suppress(Warning.NONFINAL_FIELDS).verify();
	}

	@Test
	public void testConstructor() {
		final TestBean bean = new TestBean(FAKE_ID,FAKE_STRING,FAKE_INT,FAKE_BOOL,FAKE_DATE);
		assertEquals(FAKE_ID,bean.getId());
	}
	
	@Test
	public void testId() {
		final TestBean bean = new TestBean();
		bean.setId(FAKE_ID);
		assertEquals(FAKE_ID,bean.getId());
	}
	
	@Test
	public void testString() {
		final TestBean bean = new TestBean();
		bean.setStringValue(FAKE_STRING);
		assertEquals(FAKE_STRING,bean.getStringValue());
	}
	@Test
	public void testInt() {
		final TestBean bean = new TestBean();
		bean.setIntValue(FAKE_INT);
		assertEquals(FAKE_INT,bean.getIntValue());
	}
	
	@Test
	public void testBool() {
		final TestBean bean = new TestBean();
		bean.setBoolValue(FAKE_BOOL);
		assertSame(FAKE_BOOL,bean.getBoolValue());
	}
	
	@Test
	public void testDate() {
		final TestBean bean = new TestBean();
		bean.setDateValue(FAKE_DATE);
		assertSame(FAKE_DATE,bean.getDateValue());
	}
}