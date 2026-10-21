package com.mb.week7;

public class SeniorLibrarian extends Librarian {
	final String specialization;
	final double seniorityAllowance;
	
	public SeniorLibrarian (int personId, int phoneNumber, String name, int staffId, String department, double monthlySalary, int dailyIssueLimit, int booksProcessed, String specialization, double seniorityAllowance) {
		super(personId, phoneNumber, name, staffId, department, monthlySalary, dailyIssueLimit, booksProcessed);
		
		if (specialization == null || seniorityAllowance < 0) {
			throw new IllegalArgumentException("Invalid Senior Librarian Details");
		}
		
		this.specialization = specialization;
		this.seniorityAllowance = seniorityAllowance;
	}
	
	@Override
	public double calculateMonthlyCompensation() {
		return super.calculateMonthlyCompensation() + seniorityAllowance;
	}
}
