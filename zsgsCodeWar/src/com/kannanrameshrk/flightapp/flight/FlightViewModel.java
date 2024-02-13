package com.kannanrameshrk.flightapp.flight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kannanrameshrk.flightapp.dto.Flight;
import com.kannanrameshrk.flightapp.repository.Repository;

public class FlightViewModel {
	private FlightView flightView;
	
	public FlightViewModel(FlightView flightView) {
		this.flightView = flightView;
	}

	public void addFlight(Flight flight) {
		Repository.getInstance().addFlight(flight);
		flightView.onSuccess("Register flight details successfully...");
	}

	public List<Flight> getFlights() {
		List<Flight> list=Repository.getInstance().getFlights();
		if(list.isEmpty()) {
			flightView.onErr("No data found");
		}
		return list;
	}

	public void addroutes(String routes, int flightNum) {
		List<Flight> list=Repository.getInstance().getFlights();
		
		for(Flight val:list) {
			if(val.getFlightNo()==flightNum) {
				List<String> arr=new ArrayList<>(Arrays.asList(val.getRoutes()));
				arr.addAll(Arrays.asList(routes));
				val.setRoutes(arr.toArray(new String[0]));
	            flightView.onSuccess("Routes added successfully for Flight " + flightNum);
	            break;
			}else {
				flightView.onErr("Flight Not Found");
			}
		}
	}

	
}
