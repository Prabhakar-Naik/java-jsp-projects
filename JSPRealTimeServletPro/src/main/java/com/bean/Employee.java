package com.bean;

public class Employee {

	private int EMPid;
	private String EMPname,password,email,sex,country;
	private double EMPsalary;
	
	//PDC+PSM+PGM
	public Employee() {
		super();
	}
	
	public int getEMPid() {
		return EMPid;
	}

	public void setEMPid(int eMPid) {
		EMPid = eMPid;
	}

	public String getEMPname() {
		return EMPname;
	}

	public void setEMPname(String eMPname) {
		EMPname = eMPname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getEMPsalary() {
		return EMPsalary;
	}

	public void setEMPsalary(double eMPsalary) {
		EMPsalary = eMPsalary;
	}

}
