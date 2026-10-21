package com.mb.week7;

public abstract class LibraryStaff extends Person{
	protected final int staffId;
	protected String department;
	protected double monthlySalary;
	
	protected static int staffCount = 0;
	
	public LibraryStaff (int personId, int phoneNumber, String name, int staffId, String department, double monthlySalary) {
		super(personId, phoneNumber, name);
		
		if (staffId <= 0 || department == null || monthlySalary < 0) {
            throw new IllegalArgumentException("Invalid Staff Details.");
        }
		
		this.staffId = staffId;
		this.department = department;
		this.monthlySalary = monthlySalary;
		
		staffCount++;
	}
	
	public abstract double calculateMonthlyCompensation();
	
	public void displayStaffDetails() {
		System.out.println("Staff ID: " + staffId +
                "\nName: " + name +
                "\nPerson ID: " + personId +
                "\nPhone Number: " + phoneNumber +
                "\nDepartment: " + department +
                "\nMonthly Salary: $" + monthlySalary +
                "\nMonthly Compensation: $" + calculateMonthlyCompensation());
	}
	
	public static int getStaffCount() {
		return staffCount;
	}
	
}
