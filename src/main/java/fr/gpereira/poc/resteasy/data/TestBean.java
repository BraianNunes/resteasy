package fr.gpereira.poc.resteasy.data;

import java.util.Date;

import com.google.common.base.Objects;

/**
 * Test Bean
 * 
 * @author gpereira
 * 
 */
public final class TestBean {
	private String id;
	private String stringValue;
	private Integer intValue;
	private Boolean boolValue;
	private Date dateValue;

	/**
	 * Default constructor
	 */
	public TestBean() {
	}

	/**
	 * Constructor
	 * @param id
	 * @param stringValue
	 * @param intValue
	 * @param boolValue
	 * @param dateValue
	 */
	public TestBean(String id, String stringValue, Integer intValue,
			Boolean boolValue, Date dateValue) {
		super();
		this.id = id;
		this.stringValue = stringValue;
		this.intValue = intValue;
		this.boolValue = boolValue;
		this.dateValue = (Date) dateValue.clone();
	}

	/**
	 * Returns id
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns a string value
	 * @return
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * Sets a string value
	 */
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	/**
	 * Returns an int value
	 * @return
	 */
	public Integer getIntValue() {
		return intValue;
	}

	/**
	 * Sets an int value
	 */
	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}

	/**
	 * Returns a boolean value
	 * @return
	 */
	public Boolean getBoolValue() {
		return boolValue;
	}

	/**
	 * Sets a boolean value
	 */
	public void setBoolValue(Boolean boolValue) {
		this.boolValue = boolValue;
	}

	/**
	 * Returns a date value
	 * @return
	 */
	public Date getDateValue() {
		return (Date) dateValue.clone();
	}

	/**
	 * Sets a date value
	 */
	public void setDateValue(Date dateValue) {
		this.dateValue = (Date) dateValue.clone();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TestBean other = (TestBean) obj;
		return Objects.equal(id, other.id);
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("id", id)
				.add("stringValue", stringValue).add("intValue", intValue)
				.add("dateValue", dateValue).add("boolValue", boolValue)
				.toString();
	}
}
