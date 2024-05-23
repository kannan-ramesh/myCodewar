package com.kannanrameshrk.taxibooking.view;

import java.util.Scanner;

import com.kannanrameshrk.taxibooking.dto.Customer;

public class BaseView {
	private BaseViewModel baseViewModel;
	private final Scanner input=new Scanner(System.in);
	
	public BaseView(){
		this.baseViewModel=new BaseViewModel(this);
	}
	
	public void init() {
		baseViewModel.addcabDrivers();
		baseViewModel.addCustomers();
		baseViewModel.addLocations();
		baseViewModel.addcabInitialPositions();
		showMenu();
		
	}

	private void showMenu() {
		System.out.println("Welcom to Ramesh Cab booking Application..");
		
		int choice=0;
		
		while(choice!=5) {
			System.out.println("Enter Below Options..\n"+
								"1) Cab Driver..\n"+
								"2) Customer..\n"+
								"3) Admin..\n"+
								"4) CabDriverSummary..\n"+
								"5) Exit..");
			
			choice=input.nextInt();
			input.nextLine();
			
			switch(choice) {
			case 1:{
				System.out.println("Enter user Name:");
				String name=input.nextLine();
				System.out.println("Enter Password:");
				String password=input.nextLine();
				int cabDriverId=baseViewModel.validCabDrive(name,password);
				
				if(cabDriverId !=-1) {
					System.out.println("User Valid Successfull..");
				}else {
					System.out.println("incalid driver user..");
				}
				break;
			}
			case 2:{
				customerUI();
				break;
			}
			case 3:{
				break;
			}
			case 4:{
				System.out.println("Enter a Car DriverId:");
				int cabId=input.nextInt();
				input.nextLine();
				baseViewModel.showCarDriverSummary(cabId);
				break;
			}
			default:{
				System.out.println("Enter a Valid input...");
				break;
			}
			}
		}
	}

	private void customerUI() {
		int choice=0;
		
		while(choice !=4) {
			System.out.println("Enter Below Options:\n"+
								"1) Login..\n"+
								"2) signUp..\n"+
								"3) Customer summary..\n"+
								"4) Exit..");
			choice=input.nextInt();
			input.nextLine();
			
			switch(choice) {
			case 1:{
				System.out.println("Enter UserName:");
				String userName=input.nextLine();
				System.out.println("Enter Password:");
				String password=input.nextLine();
				int customerId=baseViewModel.validCustomer(userName,password);
				
				if(customerId!=-1) {
					baseViewModel.showAvailablecabs();
					System.out.println("Enter a source:");
					String source=input.nextLine();
					System.out.println("Enter a Destination:");
					String destination =input.nextLine();
					
					String nearstCab=baseViewModel.bookNearstCab(customerId,source,destination);
					baseViewModel.confirmBooking(source,destination,customerId,nearstCab);;
				}else {
					status("Invalid Customers Data..");
				}
				break;
			}
			case 2:{
				System.out.println("Enter a Name...");
				String name = input.nextLine();
				System.out.println("Enter a PassWord...");
				String passWord = input.nextLine();
				System.out.println("Enter a Age...");
				int age = input.nextInt();
				input.nextLine();
				System.out.println("Enter a Gender...");
				char gender = input.nextLine().charAt(0);
				baseViewModel.addCurrCustomer(new Customer(name, passWord, age, gender));
				break;
			}
			case 3:{
				System.out.println("Enter a Customer Summary:");
				int customerId=input.nextInt();
				input.nextLine();
				baseViewModel.showCustomerSummary(customerId);
				break;
			}
			default:{
				System.out.println("Enter a Valid input...");
				break;
			}
			}
		}
		
	}

	public void status(String onMessage) {
		System.out.println(onMessage);
	}

	public boolean getConfirmation() {
		System.out.println("Are you willing to book cab\n1) for book2)2 cancel");
		boolean result = input.nextInt() == 1 ? true : false;
		input.nextLine();
		return result;
	}

}
