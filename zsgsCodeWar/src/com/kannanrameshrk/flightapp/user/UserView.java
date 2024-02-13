package com.kannanrameshrk.flightapp.user;

import java.util.List;
import java.util.Scanner;

import com.kannanrameshrk.flightapp.dto.Flight;
import com.kannanrameshrk.flightapp.dto.Passanger;
import com.kannanrameshrk.flightapp.dto.Pnr;
import com.kannanrameshrk.flightapp.reservation.ReservationView;

public class UserView {
	private UserViewModel userViewModel;
	public ReservationView reservationView = new ReservationView();

	public UserView() {
		userViewModel = new UserViewModel(this);
	}

	public void bookTickets(Scanner input) {
		System.out.println("Enter From Station:");
		String fromStation = input.next();
		System.out.println("Enter To Station:");
		String toStation = input.next();

		Passanger passanger = null;
		System.out.println("Available flights:");
		System.out.println("******************");
		List<Flight> flights = userViewModel.getFlights(fromStation, toStation);
		if (flights.isEmpty()) {
			System.out.println("No flights found..");
		} else {
			for (Flight val : flights) {
				System.out.println("Flight No:" + val.getFlightNo() + "|| name:" + val.getFlightName()
						+ "|| Departure Time:" + val.getDepartureTime() + "|| Arrival Time:" + val.getArrivalTime()
						+ "|| fare:" + val.getFare() + "|| seat:" + val.getSeat());
			}

			System.out.println("Enter flight Number:");
			int flightNum = input.nextInt();
			int selectedIndex = -1;
			for (int i = 0; i < flights.size(); i++) {
				if (flights.get(i).getFlightNo() == flightNum) {
					selectedIndex = i;
					break;
				}
			}

			if (selectedIndex == -1) {
				System.out.println("Invalid flight number");
				return;
			}

			System.out.println("Enter Number Of Passanger:");
			int noOfPassanger = input.nextInt();

			for (int i = 0; i < noOfPassanger; i++) {
				System.out.println("Enter Passanger" + (i + 1) + " details..");
				System.out.println("Enter Name:");
				input.nextLine();
				String name = input.nextLine();
				System.out.println("Enter Age:");
				int age = input.nextInt();
				System.out.println("Enter Gender:");
				String gender = input.next();
				System.out.println("Enter Passeneger ID:");
				int id = input.nextInt();
				passanger = new Passanger(flightNum, name, age, gender, id);
				userViewModel.addPassanger(passanger);
			}

			int select = -1;
			for (int i = 0; i < flights.size(); i++) {
				if (flights.get(i).getFlightNo() == flightNum) {
					select = i;
					break;
				}
			}

			if (selectedIndex == -1) {
				System.out.println("Invalid flight number");
				return;
			}

			double totalFare = noOfPassanger * flights.get(selectedIndex).getFare();

			System.out.println("Total Fare:" + totalFare);
			List<Passanger> pass = userViewModel.getPassanger();
			System.out.println("pay:\n 1.Pay\n 2.Cancel\n 3.Reschedule");
			int choice = input.nextInt();

			String status = "CNF"; 

			switch (choice) {
			case 1:
				break;
			case 2:
				status = "CANCEL";
				break;
			case 3:
				status = "RESCHEDULED";
				break;
			default:
				System.out.println("Invalid choice..");
				return;
			}

			Pnr pnr = new Pnr(0, status, totalFare, flights, pass, fromStation, toStation);
			userViewModel.bookTickets(pnr);

			if (select == -1) {
				System.out.println("Invalid flight number");
				return;
			}

			int availableSeat = flights.get(select).getSeat() - noOfPassanger;
			flights.get(select).setSeat(availableSeat);

			System.out.println("\t\tTickets details");
			System.out.println("Flight Details");
			System.out.println("***************");
			Flight selectedFlight = flights.get(select);

			System.out.println("Flight No:" + selectedFlight.getFlightNo() + "|| name:" + selectedFlight.getFlightName()
					+ "|| From:" + fromStation + "|| To:" + toStation + "|| Departure Time:"
					+ selectedFlight.getDepartureTime() + "|| Arrival Time:" + selectedFlight.getArrivalTime()
					+ "|| fare:" + totalFare);

			System.out.println("Passenger Details");
			System.out.println("******************");
			
			for (Passanger passangers : pass) {
				System.out.println("Name:" + passangers.getName() + "|| age:" + passangers.getAge() + "|| gender:"
						+ passangers.getGender() + "|| ID:" + passangers.getId() + "|| status:" + pnr.getStatus());
			}
		}
	}

	public void onErr(String errMessage) {
		System.out.println(errMessage);
	}

	public void onSuccess(String successMessage) {
		System.out.println(successMessage);
	}
}