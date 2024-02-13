package com.kannanrameshrk.flightapp.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kannanrameshrk.flightapp.dto.Flight;
import com.kannanrameshrk.flightapp.dto.Passanger;
import com.kannanrameshrk.flightapp.dto.Pnr;
import com.kannanrameshrk.flightapp.repository.Repository;

public class UserViewModel {
	private UserView userView;

	public UserViewModel(UserView userView) {
		this.userView = userView;
	}

	public List<Flight> getFlights(String fromStation, String toStation) {
		 List<Flight> list = Repository.getInstance().getFlights();
		    List<Flight> filteredFlights = new ArrayList<>();

		    for (Flight flight : list) {
		        List<String> routes = Arrays.asList(flight.getRoutes());
		        if (routes.contains(fromStation) && routes.contains(toStation)) {
		            filteredFlights.add(flight);
		        }
		    }
		    return filteredFlights;
	}

	public void addPassanger(Passanger passanger) {
		 boolean add=Repository.getInstance().addPassanger(passanger);
		 
		 if(add) {
			 userView.onSuccess("Succesfully Registered Passanger Data");
		 }else {
			 userView.onErr("not Succesfully Registered Passanger Data");
		 }
	}

	public void bookTickets(Pnr pnr) {
		 boolean addTickets=Repository.getInstance().addTickets(pnr);
		 if(addTickets) {
			 userView.onSuccess("Succesfully Booked Tickets");
		 }else {
			 userView.onErr("not Succesfully Booked Tickets..");
		 }
	}

	public List<Passanger> getPassanger() {
	
		return  Repository.getInstance().getPassanger();
	}
}
