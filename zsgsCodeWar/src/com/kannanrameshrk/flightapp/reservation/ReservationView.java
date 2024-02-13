package com.kannanrameshrk.flightapp.reservation;

import java.util.List;
import java.util.Scanner;

import com.kannanrameshrk.flightapp.BaseView;
import com.kannanrameshrk.flightapp.dto.Pnr;

public class ReservationView {
	private ReservationViewModel reservationViewModel;
	BaseView baseView = new BaseView();
	public ReservationView() {
		reservationViewModel = new ReservationViewModel(this);
	}

	public void pnrStatus(Scanner input) {
		System.out.println("Enter your PNR Number:");
		int pnrNum = input.nextInt();
		System.out.println("Ticket Details");

		List<Pnr> data = reservationViewModel.getData(pnrNum);

		if (!data.isEmpty()) {
			System.out.println("Flight Details");
			System.out.println("***************");

			baseView.flightDetails(data);

			System.out.println("Passenger Details");
			System.out.println("***************");
			baseView.passangerDeails(data);
		}
	}

	public void onErr(String errMessage) {
		System.out.println(errMessage);
	}

	public void getTickets() {
		List<Pnr> data = reservationViewModel.getTickets();
		if (!data.isEmpty()) {
			System.out.println("Flight Details");
			System.out.println("***************");

			baseView.flightDetails(data);

			System.out.println("Passenger Details");
			System.out.println("***************");
			baseView.passangerDeails(data);
		}
	}

	public void cancelTickets(Scanner input) {
	
		System.out.println("Enter your pnr number:");
		int pnrNum = input.nextInt();
		System.out.println("Do You want to cancel tickets?(yes)");
		String flag = input.next();
		
		if(flag.equals("yes")) {
			double amount=reservationViewModel.cancelTickets(pnrNum);
			System.out.println("Tickets canceled Successfully.your refund"+amount+"will be procesd soon.");
		}else {
			return;
		}
	}

	public void searchPassanger(Scanner input) {
		System.out.println("ENter Passanger ID:");
		int id=input.nextInt();
		List<Pnr> data = reservationViewModel.getPassangerData(id);
		
		System.out.println("Passenger Details");
		System.out.println("***************");
		baseView.passangerDeails(data);
	}
}