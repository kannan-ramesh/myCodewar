package com.kannanrameshrk.taxibooking.repository;

import java.util.HashMap;
import java.util.Map;

import com.kannanrameshrk.taxibooking.dto.Cab;
import com.kannanrameshrk.taxibooking.dto.CabDriver;
import com.kannanrameshrk.taxibooking.dto.Customer;
import com.kannanrameshrk.taxibooking.dto.Locations;

public class Repository {
	static Repository repository=null;
	
	public static Map<Integer,Cab> cabs=new HashMap<>();
	public static Map<Integer,CabDriver> drivers=new HashMap<>();
	public static Map<Integer,Customer> customers=new HashMap<>();
	public static Map<Integer,Locations> locations=new HashMap<>();

	
	
	private Repository() {
		
	}
	
	public static Repository getInstance(){
		if(repository==null) {
			repository=new Repository();
		}
		return repository;
	}
}
