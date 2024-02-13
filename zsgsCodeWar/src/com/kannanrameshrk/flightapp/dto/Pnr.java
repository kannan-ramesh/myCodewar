package com.kannanrameshrk.flightapp.dto;

import java.util.List;

public class Pnr {
	static int pnrNo = 3435544;
	private int pnrNum = pnrNo++;
	private String status;
	private double totalFare;
	private int flightNum;
	private String startLocation;
	private String endLocation;
	private List<Flight> flights;
	private List<Passanger> passanger;

	public Pnr(int num, String status, double totalFare, int flightNum) {
		num = this.pnrNum;
		this.status = status;
		this.totalFare = totalFare;
	}

	public Pnr(int num, String status, double totalFare, List<Flight> flights, List<Passanger> passangers, String fromStation, String toStation) {
		this.pnrNum = num;
		this.status = status;
		this.totalFare = totalFare;
		this.flights = flights;
		this.passanger = passangers;
		this.setStartLocation(fromStation);
		this.setEndLocation(toStation);
	}

	public int getPnrNum() {
		return pnrNum;
	}

	public void setPnrNum(int pnrNum) {
		this.pnrNum = pnrNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getRotalFare() {
		return totalFare;
	}

	public void setRotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public int getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public List<Passanger> getPassanger() {
		return passanger;
	}

	public void setPassanger(List<Passanger> passanger) {
		this.passanger = passanger;
	}

	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

}
