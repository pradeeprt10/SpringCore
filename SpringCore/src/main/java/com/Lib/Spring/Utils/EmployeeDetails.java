package com.Lib.Spring.Utils;

import java.util.*;

public class EmployeeDetails {
	
	private int empid;
	private String name;
	private List address;
	private Set contact;
	private Map payscale;
	public EmployeeDetails(int empid, String name, List address, Set contact, Map payscale) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.payscale = payscale;
	}
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getAddress() {
		return address;
	}
	public void setAddress(List address) {
		this.address = address;
	}
	public Set getContact() {
		return contact;
	}
	public void setContact(Set contact) {
		this.contact = contact;
	}
	public Map getPayscale() {
		return payscale;
	}
	public void setPayscale(Map payscale) {
		this.payscale = payscale;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [empid=" + empid + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ ", payscale=" + payscale + "]";
	}

}
