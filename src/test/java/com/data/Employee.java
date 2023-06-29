package com.data;

import java.sql.Date;

public class Employee {

	private String testCaseNo;
	private String user;
	private String pass;
	private Date doj;
	public String getTestCaseNo() {
		return testCaseNo;
	}
	public void setTestCaseNo(String testCaseNo) {
		this.testCaseNo = testCaseNo;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Employee(String testCaseNo, String user, String pass, Date doj) {
		this.testCaseNo = testCaseNo;
		this.user = user;
		this.pass = pass;
		this.doj = doj;
	}

	
}
