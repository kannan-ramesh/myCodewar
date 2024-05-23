package com.kannanrameshrk.taxibooking.dto;

public class Locations {
	private String name;
	private int distFromOrg;
	
	public Locations(String name, int distFromOrg) {
		this.name=name;
		this.distFromOrg=distFromOrg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDistFromOrg() {
		return distFromOrg;
	}
	public void setDistFromOrg(int distFromOrg) {
		this.distFromOrg = distFromOrg;
	}
}
