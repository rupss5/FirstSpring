package com.spring;

public class Student {
      private int stud_id;
      private String sname;
      private String address;
      
      
      
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int stud_id, String sname, String address) {
		super();
		this.stud_id = stud_id;
		this.sname = sname;
		this.address = address;
	}
	

	public int getStud_id() {
		return stud_id;
	}


	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	


	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", sname=" + sname + ", address=" + address + "]";
	}


	

}
