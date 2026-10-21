package com.mb.week7;

public class Member extends Person {
	protected final int memberNumber, age;
	protected final String membershipType;
	protected double outstandingFees;
	
	public Member(int personId, int phoneNumber, String name, int age, int memberNumber, String membershipType, double outstandingFees) {
		super(personId, phoneNumber, name);
		
		if (age <= 0 || memberNumber <= 0 || membershipType == null || outstandingFees < 0) {
			throw new IllegalArgumentException ("Invalid Membership Details");
		}
		
		this.age = age;
		this.memberNumber = memberNumber;
		this.membershipType = membershipType;
		this.outstandingFees = outstandingFees;
	}
	
	public void registerMember () {
		System.out.println("Registering User: " + name + 
				"\nDetails of User Below" +
				"\nAge: " + age +
				"\nMembership Type: " + membershipType);
	}
	
	public void registerMember(String membershipType) {
        if (membershipType == null) {
            System.out.println("Registration unsuccessful: " +
                    "Invalid membership type.");
        }
        else {
        	System.out.println("Registering member: " + name +
                    "\nAge: " + age +
                    "\nMembership Type: " + membershipType +
                    "\nRegistration successful!");
        }
        
    }

	@Override
	public void getRoleDescription() {
		
	}
	
}
