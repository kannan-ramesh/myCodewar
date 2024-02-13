package com.kannanrameshrk.flightapp.dto;

public class Flight {
	private int flightNo;
	private String flightName;
	private double departureTime;
	private double arrivalTime;
	private String routes[];
	private int seat;
	private int fare;
	
	
	public Flight(int flightNum, String flightName, double departureTime, double arrivalTime, String[] routes,
			int seat, int fare) {
		this.flightNo = flightNum;
		this.flightName = flightName;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.routes = routes;
		this.seat = seat;
		this.fare = fare;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public double getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(double departureTime) {
		this.departureTime = departureTime;
	}
	public double getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(double arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String[] getRoutes() {
		return routes;
	}
	public void setRoutes(String[] routes) {
		this.routes = routes;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
}
