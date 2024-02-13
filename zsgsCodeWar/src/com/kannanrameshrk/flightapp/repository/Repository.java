package com.kannanrameshrk.flightapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.kannanrameshrk.flightapp.dto.Flight;
import com.kannanrameshrk.flightapp.dto.Passanger;
import com.kannanrameshrk.flightapp.dto.Pnr;

public class Repository {
	public static Repository repository;
	List<Flight> flights=new ArrayList<>();
	List<Passanger> passangers = new ArrayList<>();
	List<Pnr> bookedTickets=new ArrayList<>();
	private Repository() {
		
	}
	
	public static Repository getInstance() {
		if(repository==null) {
			repository=new Repository();
		}
		return repository;
	}

	public void addFlight(Flight flight) {
		flights.add(flight);
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public boolean addPassanger(Passanger passanger) {
		return passangers.add(passanger);
	}

	public boolean addTickets(Pnr pnr) {
		return bookedTickets.add(pnr);
	}

	public List<Passanger> getPassanger() {
		return passangers;
	}

	public List<Pnr> getData() {
		return bookedTickets;
	}
}
