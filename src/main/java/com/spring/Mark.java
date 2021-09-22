package com.spring;

public class Mark {
	private int java;
	private int spring;
	private int jdbc;
	
	Mark(){
		
	}

	public Mark(int java, int spring, int jdbc) {
		super();
		this.java = java;
		this.spring = spring;
		this.jdbc = jdbc;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getJdbc() {
		return jdbc;
	}

	public void setJdbc(int jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public String toString() {
		return "Mark [java=" + java + ", spring=" + spring + ", jdbc=" + jdbc + "]";
	}
	

}
