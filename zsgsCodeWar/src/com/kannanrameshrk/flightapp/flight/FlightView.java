package com.kannanrameshrk.flightapp.flight;

import java.util.List;
import java.util.Scanner;

import com.kannanrameshrk.flightapp.dto.Flight;

public class FlightView {
	private FlightViewModel flightViewModel;
	
	public FlightView() {
		flightViewModel = new FlightViewModel(this);
	}

	public void register(Scanner input) {
		System.out.println("Enter flight Number:");
		int flightNum=input.nextInt();
		System.out.println("Enter Flight Name:");
		String flightName = input.next();
		System.out.println("ENter Departure Time:");
		double departureTime=input.nextDouble();
		System.out.println("Enter Arrival Time:");
		double arrivalTime=input.nextDouble();
		System.out.println("ENter no of Routes..");
		int n=input.nextInt();
		
		String[] routes=new String[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter Routes"+(i+1)+":");
			routes[i]=input.next();
		}
		System.out.println("Enter Number of seat:");
		int seat=input.nextInt();
		System.out.println("Enter Flight fare: ");
		int fare=input.nextInt();
		
		Flight flight= new Flight(flightNum,flightName,departureTime,arrivalTime,routes,seat,fare);
		
		flightViewModel.addFlight(flight);
	}

	public void onSuccess(String successMessage) {
		System.out.println(successMessage);
	}

	public void showFlights() {
		List<Flight> flight=flightViewModel.getFlights();
		
		for(Flight val:flight) {
			System.out.println("Flight No:"+val.getFlightNo()+"|| name:"+val.getFlightName()+"|| Departure Time:"+val.getDepartureTime()+"|| Arrival Time:"+val.getArrivalTime()+"|| fare:"+val.getFare()+"|| seat:"+val.getSeat());
		}
	}

	public void onErr(String errMessage) {
		System.out.println(errMessage);
	}

	public void getRoutes() {
		List<Flight> flight=flightViewModel.getFlights();
		
		for(Flight val:flight) {
			System.out.println("Flight No:"+val.getFlightNo()+"|| name:"+val.getFlightName());
			System.out.println("*******************************************");
			for(String data:val.getRoutes()) {
				System.out.print(data+"->");
			}
		}
	}

	public void addRoutes(Scanner input) {
		System.out.println("Enter your Routes:");
		String routes=input.nextLine();
		System.out.println("Enter flight Number:");
		int flightNum=input.nextInt();
		flightViewModel.addroutes(routes,flightNum);
	}
}
