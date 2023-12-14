package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person{
	private String name;
	private int startYear;
	private int endYear;
	
	
	public Person(String name, int sYear, int eYear) {
		this.name=name;
		this.startYear=sYear;
		this.endYear=eYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public int getEndYear() {
		return endYear;
	}
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
}
public class FindYearPerson {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Person> list=new ArrayList<>();
		
		list.add(new Person("Sathya",1997,2018));
		list.add(new Person("Ragavan",2000,2010));
		list.add(new Person("Mani",2001,2030));
		list.add(new Person("Akilan",1997,2005));
		list.add(new Person("AK",1995,2015));
		
		System.out.println("Enter year:");
		int year=input.nextInt();
		
		findAlivePerson(list,year);
	}

	private static void findAlivePerson(List<Person> list, int year) {
		List<String> alivePerson=new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getStartYear()< year && list.get(i).getEndYear()>year) {
				alivePerson.add(list.get(i).getName());
			}
		}
		printPerson(alivePerson);
	}

	private static void printPerson(List<String> alivePerson) {
		if(alivePerson.isEmpty()) {
			System.out.println("No Person this year Alive..");
		}
		for(int i=0;i<alivePerson.size();i++) {
			System.out.println(alivePerson.get(i));
		}
	}

	

}
