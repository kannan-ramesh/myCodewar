package com.kannanrameshrk.flightapp.dto;

public class Passanger {
	private int flightNum;
	private String name;
	private int age;
	private String gender;
	private int id;
	
	
	public Passanger(int flightNum, String name, int age, String gender, int id) {
		this.flightNum = flightNum;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}
}
