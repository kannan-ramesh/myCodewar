package com.kannanrameshrk.flightapp;

import java.util.Scanner;

import com.kannanrameshrk.flightapp.flight.FlightView;

public class Main {

	public static void main(String[] args) {
		System.out.println("\t\tFlight System");
		System.out.println("\t\t--------------");
		Main main = new Main();
		main.start();
	}

	private void start() {
		boolean loop = true;
		Scanner input = new Scanner(System.in);
		FlightView flightView = new FlightView();

		while (loop) {
			System.out.println(" 1.Register Flight");
			System.out.println(" 2.Flight details");
			System.out.println(" 3.ISRTC App");
			System.out.println(" 4.exit");
			System.out.println("Enter Your Option:");
			int choice = input.nextInt();

			switch (choice) {
			case 1: {
				flightView.register(input);
				break;
			}
			case 2:{
				flightView.showFlights();
				break;
			}
			case 3:{
				BaseView baseView=new BaseView();
				baseView.isrtc(input);
				break;
			}
			case 4: {
				System.out.println("Exit Application..");
				loop = false;
				break;
			}
			default:{
				System.out.println("Invalid choice");
				break;
			}
			}
		}
	}

}
