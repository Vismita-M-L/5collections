package com.techlabs.comparator;

public class Employee {
	private int emailid;
	private String name;
	private int salary;
	public Employee(int emailid, String name, int salary) {
		super();
		this.emailid = emailid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmailid() {
		return emailid;
	}
	public void setEmailid(int emailid) {
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emailid=" + emailid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
