package com.kannanrameshrk.taxibooking.view;

import java.util.List;
import java.util.Set;

import com.kannanrameshrk.taxibooking.dto.Cab;
import com.kannanrameshrk.taxibooking.dto.CabDriver;
import com.kannanrameshrk.taxibooking.dto.CabDriverRide;
import com.kannanrameshrk.taxibooking.dto.Customer;
import com.kannanrameshrk.taxibooking.dto.CustomerRides;
import com.kannanrameshrk.taxibooking.dto.Locations;
import com.kannanrameshrk.taxibooking.repository.Repository;

class BaseViewModel {
	private static final String nearestCabID = null;
	private BaseView baseView;
	
	
	public BaseViewModel(BaseView baseView) {
		this.baseView=baseView;
	}


	public void addcabDrivers() {
		Repository.drivers.put(1, new CabDriver("aaa", "111", 43, 'M'));
		Repository.drivers.put(2, new CabDriver("bbb", "222", 31, 'M'));
		Repository.drivers.put(3, new CabDriver("ccc", "333", 38, 'F'));
		Repository.drivers.put(4, new CabDriver("ddd", "444", 28, 'F'));
	}


	public void addCustomers() {
		Repository.customers.put(1, new Customer("ZZ","99",25,'F'));
		Repository.customers.put(2, new Customer("yy", "88", 61, 'M'));
		Repository.customers.put(3, new Customer("xx", "77", 22, 'M'));
		Repository.customers.put(4, new Customer("ww", "66", 36, 'F'));
	}


	public void addLocations() {
		Repository.locations.put(1, new Locations("A", 0));
		Repository.locations.put(3, new Locations("C", 4));
		Repository.locations.put(4, new Locations("D", 7));
		Repository.locations.put(6, new Locations("F", 9));
		Repository.locations.put(2, new Locations("B", 15));
		Repository.locations.put(7, new Locations("G", 18));
		Repository.locations.put(8, new Locations("H", 20));
		Repository.locations.put(5, new Locations("E", 23));
		
	}


	public void addcabInitialPositions() {
		Repository.cabs.put(1, new Cab("D"));
		Repository.cabs.put(2, new Cab("G"));
		Repository.cabs.put(3, new Cab("H"));
		Repository.cabs.put(4, new Cab("A"));
	}


	public int validCabDrive(String name, String password) {
		Set<Integer> keys=Repository.drivers.keySet();
		
		for(int key:keys) {
			CabDriver cabDriver=Repository.drivers.get(key);
			
			if(cabDriver.getName().equals(name) && cabDriver.getPassword().equals(password)) {
				return key;
			}
		}
		return -1;
	}


	public int validCustomer(String userName, String password) {
		Set<Integer> keys=Repository.customers.keySet();
		
		for(int key:keys) {
			Customer customer=Repository.customers.get(key);
			
			if(customer.getName().equals(userName) && customer.getPassword().equals(password)) {
				return key;
			}
		}
		return -1;
	}


	public void showAvailablecabs() {
		System.out.println("--------------------------------------------");
		
		Set<Integer> keys=Repository.cabs.keySet();
		
		for(int key:keys) {
			Cab cabs=Repository.cabs.get(key);
			
			if(cabs.isAvailable()) {
				System.out.println("Location:"+cabs.getPosition());
				System.out.println("Car ID:"+key);
			}
			
		}
				
		System.out.println("--------------------------------------------");
	}


	public String bookNearstCab(int customerId, String source, String destination) {
		Set<Integer> keys=Repository.cabs.keySet();
		
		int getDistanceOrg=getDistance(source);
		System.out.println("GetDistanceOrg:"+getDistanceOrg);
		int nearstLocation=Integer.MAX_VALUE;
		String nearstCab="";
		
		for(int key:keys) {
			Cab curCab=Repository.cabs.get(key);
			
			if(curCab.isAvailable()) {
				int currentDistance=Math.abs(getDistance(curCab.getPosition())-getDistanceOrg);
				
				if(currentDistance<nearstLocation) {
					nearstCab=curCab.getPosition();
					nearstLocation=currentDistance;
				}
			}
		}
		System.out.println("Nearst Cab is"+nearstCab);
		
		return nearstCab;
	}


	private int getDistance(String source) {
		Set<Integer> keys=Repository.locations.keySet();
		
		for(int key:keys) {
			Locations location=Repository.locations.get(key);
			
			if(location.getName().equals(source)) {
				return location.getDistFromOrg();
			}
		}
		return -1;
	}


	public void confirmBooking(String source, String destination, int customerId, String nearstCab) {
		int km=Math.abs(getDistance(source)-getDistance(source));
		Customer customer=Repository.customers.get(customerId);
		int nearstCabId=getCabId(nearstCab);
		
		System.out.println("Your current cab is from : "+nearstCab+" To .."+destination);
		System.out.println("your fair is ..."+km*10);
		
		if(baseView.getConfirmation()) {
			customer.getRides().add(new CustomerRides(source, destination, nearstCabId, km * 10));
			  makeCabUnAvailable(nearstCab);
			  Repository.cabs.get(nearstCabId).setPosition(destination);
			addCarDriverSummary(new CabDriverRide(source,destination,customerId,km*10,(km*10)*(0.30f)),nearstCabId);
			
		}
	}


	private void addCarDriverSummary(CabDriverRide customerRides, int cabID) {
		Repository.drivers.get(cabID).getDriverSummary().add(customerRides);
	}


	private void makeCabUnAvailable(String nearstCab) {
		Set<Integer> keys = Repository.cabs.keySet();
		for(int key : keys) {
			Cab currCab = Repository.cabs.get(key);
			if(currCab.isAvailable() && currCab.getPosition().equals(nearstCab)) {
				currCab.setAvailable(false);
			}
			else {
				currCab.setAvailable(true);
			}
		}
		
	}


	private int getCabId(String nearstCab) {
		Set<Integer> key=Repository.cabs.keySet();
		int nearstCabId=Integer.MAX_VALUE;
		
		for(int keys:key) {
			Cab currentCab=Repository.cabs.get(keys);
			
			if(currentCab.getPosition().equals(nearstCab)) {
				if(Repository.drivers.get(keys).getDriverSummary().size()<nearstCabId) {
					 nearstCabId = keys;
				}
			}
		}
		return nearstCabId ;
	}


	public void addCurrCustomer(Customer customer) {
		Set<Integer> keys = Repository.customers.keySet();
        int lastId = Integer.MIN_VALUE;

        for (Integer key : keys) {
            if (key > lastId) {
                lastId = key;
            }
        }

        Repository.customers.put(lastId + 1, customer);		
	}


	public void showCustomerSummary(int customerId) {
		List<CustomerRides> rides=Repository.customers.get(customerId).getRides();
		
		for(CustomerRides ride:rides) {
			System.out.println("Source.."+ride.getSource());
			System.out.println("Destination..."+ride.getDestination());
			System.out.println("Cab Details..."+ride.getCabDetail());
			System.out.println("Total Fare..."+ride.getFare());
		}
	}


	public void showCarDriverSummary(int cabId) {
		List<CabDriverRide> cabDriver = Repository.drivers.get(cabId).getDriverSummary();
		
		if(cabDriver.size()>0) {
			for( CabDriverRide driver : cabDriver) {
				System.out.println("Source : "+driver.getSource());
				System.out.println("Destination : "+driver.getDestination());
				System.out.println("Customer Details : "+driver.getCustomerDetails());
				System.out.println("Fare..."+driver.getFare());
				System.out.println("Zula Commitions.."+driver.getZulaCommission());
			}
		}else {
			baseView.status("Cab Driver not start trips..");
		}
	}

}
