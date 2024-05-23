package com.kannanrameshrk.taxibooking.dto;

import java.util.ArrayList;
import java.util.List;

public class CabDriver {
	private String name;
	private String password;
	private char gender;
	private int age;
	
	
	public CabDriver(String name, String password, int age, char gender) {
		this.name=name;
		this.password=password;
		this.age=age;
		this.gender=gender;
	}
	 private List<CabDriverRide> driverSummary = new ArrayList<>();
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<CabDriverRide> getDriverSummary() {
		return driverSummary;
	}
	public void setDriverSummary(List<CabDriverRide> driverSummary) {
		this.driverSummary = driverSummary;
	}
	
}
