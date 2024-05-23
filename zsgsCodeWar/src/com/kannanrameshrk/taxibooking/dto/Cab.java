package com.kannanrameshrk.taxibooking.dto;

public class Cab {
	private String position;
	private boolean isAvailable;
	
	public Cab(String position) {
		super();
		this.position=position;
		this.isAvailable=true;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
