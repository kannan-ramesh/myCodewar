package com.kannanrameshrk.flightapp;

import java.util.List;
import java.util.Scanner;

import com.kannanrameshrk.flightapp.dto.Flight;
import com.kannanrameshrk.flightapp.dto.Passanger;
import com.kannanrameshrk.flightapp.dto.Pnr;
import com.kannanrameshrk.flightapp.flight.FlightView;
import com.kannanrameshrk.flightapp.reservation.ReservationView;
import com.kannanrameshrk.flightapp.user.UserView;

public class BaseView {
	
	public void isrtc(Scanner input) {
		UserView userView=new UserView();
		ReservationView reservationView=new ReservationView();
		boolean loop = false;

		do {
			System.out.println("\t\tWelcome ISRTC Application");
			System.out.println("\t\t**************************");
			System.out.println(
					" 1.Booking\n 2.Get PNR Status\n 3.Booked Tickets\n 4.Cancel Tickets\n 5.Search Passanger\n 6.Change Ticket-Status Passanger\n 7.List Flight Routes\n 8.Add Flight Routes\n 9.Back");
			System.out.println("Enter your Option:");
			int opt = input.nextInt();

			switch (opt) {
			case 1: {
				System.out.println("\t\tBooking Tickets");
				System.out.println("\t\t**************");
				userView.bookTickets(input);
				break;
			}
			case 2: {
				System.out.println("PNR Status");
				reservationView.pnrStatus(input);
				break;
			}
			case 3: {
				System.out.println("\t\tBooked Tickets");
				System.out.println("\t\t**************");
				reservationView.getTickets();
				break;
			}
			case 4: {
				System.out.println("\t\tCancel Tickets");
				System.out.println("\t\t**************");
				reservationView.cancelTickets(input);
				break;
			}
			case 5: {
				System.out.println("\t\tSearch Passanger");
				System.out.println("\t\t**************");
				reservationView.searchPassanger(input);
				break;
			}
			case 6: {
				System.out.println("Change Ticket-Status Passanger");
				break;
			}
			case 7: {
				System.out.println("List Flight Routes");
				System.out.println("**************");
				FlightView flight=new FlightView();
				flight.getRoutes();
				break;
			}
			case 8: {
				System.out.println("Add Flight Routes");
				System.out.println("**************");
				FlightView flight=new FlightView();
				flight.addRoutes(input);
				break;
			}
			case 9: {
				System.out.println("Exit IRSTC App");
				loop = false;
				break;
			}
			default: {
				System.out.println("Incalid Option..");
				break;
			}
			}
		} while (loop);
	}
	public void flightDetails(List<Pnr>data) {
		for (Pnr val : data) {
			for (Flight flights : val.getFlights()) {
				System.out.println("Flight No:" + flights.getFlightNo() + "|| name:" + flights.getFlightName()
						+ "|| From:" + val.getStartLocation() + "|| To:" + val.getEndLocation()
						+ "|| Departure Time:" + flights.getDepartureTime() + "|| Arrival Time:"
						+ flights.getArrivalTime() + "|| fare:" + val.getRotalFare()+"||PNR Number"+val.getPnrNum());
			}
		}
	}
	
	public void passangerDeails(List<Pnr>data) {
		for (Pnr val : data) {
			for (Passanger passangers : val.getPassanger()) {
				System.out.println("Name:" + passangers.getName() + "|| age:" + passangers.getAge() + "|| gender:"
						+ passangers.getGender() + "|| ID:" + passangers.getId() + "|| status:" + val.getStatus()+"|| PNR Number"+val.getPnrNum());
			}
		}
	}
}
