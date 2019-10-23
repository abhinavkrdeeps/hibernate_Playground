package com.virtusa.HibernateDemo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private Integer doorNo;
	private String streetName;
	
	public Address() {
		super();
	}
	public Address(Integer doorNo, String streetName) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
	}
	public Integer getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(Integer doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	

}
