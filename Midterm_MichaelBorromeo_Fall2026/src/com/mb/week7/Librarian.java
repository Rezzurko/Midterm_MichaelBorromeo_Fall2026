package com.mb.week7;

public class Librarian extends LibraryStaff implements Reportable, Reservable {
	protected final int dailyIssueLimit, booksProcessed;
	
	public Librarian(int personId, int phoneNumber, String name, int staffId, String department, double monthlySalary, int dailyIssueLimit, int booksProcessed) {
		super(personId, phoneNumber, name, staffId, department, monthlySalary);
		
		if (dailyIssueLimit <= 0 || booksProcessed <= 0) {
			throw new IllegalArgumentException("Invalid Librarian Details");
		}
		this.dailyIssueLimit = dailyIssueLimit;
		this.booksProcessed = booksProcessed;
	}
	
	@Override
	public double calculateMonthlyCompensation() {
		return monthlySalary + (booksProcessed * 2);
	}
	
	public double calculateLateFee(int daysOverdue) {
		if (daysOverdue < 0) {
			throw new IllegalArgumentException("Overdue days cannot be negative");
		}
		
		return daysOverdue * 1;
	}
	
	public double calculateLateFee(int daysOverdue, double dailyRate) {
		if (daysOverdue < 0) {
			throw new IllegalArgumentException("Overdue days cannot be negative");
		}
		if (dailyRate < 0) {
			throw new IllegalArgumentException("Daily rate must be a valid amount");
		}
		
		return daysOverdue * dailyRate;
	}
	
	 @Override
	    public void getRoleDescription() {
	        System.out.println(name + " is a librarian.");
	    }

	  @Override
	    public void displayStaffDetails() {
	        super.displayStaffDetails();

	        System.out.println("Daily Issue Limit: " + dailyIssueLimit
	                + "\nBooks Processed: " + booksProcessed);
	    }
	  
	  @Override
	  public void generateReport() {
	      System.out.println("Library Report" +
	              "\nLibrarian: " + name +
	              "\nBooks Processed: " + booksProcessed +
	              "\nMonthly Compensation: $" + calculateMonthlyCompensation());
	  }

	  @Override
	  public void reserveBook(String bookId) {
	      if (bookId == null) {
	          System.out.println("Reservation unsuccessful: Invalid book ID.");
	      }
	      else {
		      System.out.println("Book " + bookId + " reserved successfully.");
	      }
	  }
}
