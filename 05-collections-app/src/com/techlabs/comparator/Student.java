package com.techlabs.comparator;

public class Student {
	private String name;
	private String mailid;
	private int rollno;
	public Student(String name, String mailid, int rollno) {
		super();
		this.name = name;
		this.mailid = mailid;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	
	
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		
	}
		@Override
		public String toString() {
			return " [name=" + name + ", mailid=" + mailid + ", rollno=" + rollno + "]";
		}
	
}
	


