package com.kannanrameshrk.taxibooking.dto;

import java.util.ArrayList;
import java.util.List;

public class Customer extends CabDriver {

	public Customer(String name, String password, int age, char gender) {
		super(name, password, age, gender);
		
	}
	private List<CustomerRides> rides = new ArrayList<>();
	
	public List<CustomerRides> getRides() {
		return rides;
	}
	public void setRides(List<CustomerRides> rides) {
		this.rides = rides;
	}
}
