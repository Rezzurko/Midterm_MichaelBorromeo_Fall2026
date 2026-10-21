package com.mb.week7;

public class LibraryAssistant extends LibraryStaff {
	final String shiftType;
    final double shiftAllowance;

    public LibraryAssistant(int personId, int phoneNumber, String name, int staffId, String department, double monthlySalary, String shiftType, double shiftAllowance) {
    	super(personId, phoneNumber, name, staffId, department, monthlySalary);

        if (shiftType == null || shiftAllowance < 0) {
            throw new IllegalArgumentException("Invalid library assistant details.");
        }

        this.shiftType = shiftType;
        this.shiftAllowance = shiftAllowance;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return monthlySalary + shiftAllowance;
    }

    @Override
    public void displayStaffDetails() {
        super.displayStaffDetails();

        System.out.println("Shift Type: " + shiftType +
                "\nShift Allowance: $" + shiftAllowance);
    }

    @Override
    public void getRoleDescription() {
        System.out.println(name + " is a library assistant.");
    }
}