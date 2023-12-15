package com.kannanrameshrk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person1 {
	private String name;
	private int startYear;
	private int endYear;

	public Person1(String name, int sYear, int eYear) {
		this.name = name;
		this.startYear = sYear;
		this.endYear = eYear;
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

public class FindYearPersonMap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Map<String, Person1> map = new HashMap<>();

		map.put("Sathya", new Person1("Sathya", 1997, 2018));
		map.put("Ragavan", new Person1("Ragavan", 2000, 2010));
		map.put("Mani", new Person1("Mani", 2001, 2030));
		map.put("Akilan", new Person1("Akilan", 1997, 2005));
		map.put("AK", new Person1("AK", 1995, 2015));

		System.out.println("Enter year:");
		int year = input.nextInt();

		findAlivePersonMap(map, year);
	}

	private static void findAlivePersonMap(Map<String, Person1> map, int year) {
		boolean flag = false;
		for (Map.Entry<String, Person1> val : map.entrySet()) {
			Person1 person = val.getValue();
			if (person.getStartYear() < year && person.getEndYear() > year) {
				System.out.println("Alive person: " + person.getName());
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println(" No Alive person: ");
		}
	}
}