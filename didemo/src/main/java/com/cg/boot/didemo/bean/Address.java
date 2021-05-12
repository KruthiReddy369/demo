package com.cg.boot.didemo.bean;

import org.springframework.stereotype.Component;

//@Component
public class Address
{
	String dno; //="1-2-3";
	String city; //="hyd";
	String state; //="ts";
	public Address() {}
	public Address(String dno, String city, String state) {
		super();
		this.dno = dno;
		this.city = city;
		this.state = state;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
