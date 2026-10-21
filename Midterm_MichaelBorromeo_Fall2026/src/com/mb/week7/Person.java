package com.mb.week7;

public abstract class Person {
	final int personId, phoneNumber;
	final String name;
	static int personCount;
	
	public Person (int personId, int phoneNumber, String name) {
		this.personId = personId;
		this.phoneNumber = phoneNumber;
		this.name = name;
		
		personCount++;
	}
	
	public static int getPersonCount() {
		return personCount;
	}
	
	public void displayBasicDetails() {
		System.out.println("Name: " + name + 
				"\nPerson ID: " + personId +
				"\nPhone Number: " + phoneNumber);
	}
	
	public abstract void getRoleDescription();
	
	@Override
	public String toString() {
		return ("Name: " + name + 
				"\nPerson ID: " + personId +
				"\nPhone Number: " + phoneNumber);
	}
	
}