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

	public TestBean() {
	}

	public TestBean(String id, String stringValue, Integer intValue,
			Boolean boolValue, Date dateValue) {
		super();
		this.id = id;
		this.stringValue = stringValue;
		this.intValue = intValue;
		this.boolValue = boolValue;
		this.dateValue = dateValue;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public Integer getIntValue() {
		return intValue;
	}

	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}

	public Boolean getBoolValue() {
		return boolValue;
	}

	public void setBoolValue(Boolean boolValue) {
		this.boolValue = boolValue;
	}

	public Date getDateValue() {
		return dateValue;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
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
