package com.mb.week7;

public class Main {

	public static void main(String[] args) {
		System.out.println("===== MEMBER REGISTRATION =====");
		
		Member member1 = new Member(1, 416999, "Michael Borromeo", 18, 1000, "Standard", 0);
		
		Member member2 = new Member(2, 647270, "Justin Young Pow", 18, 1010, "Premium", 10);
		
		member1.registerMember();
		System.out.println("=======================");
		member2.registerMember("Premium");
				
		System.out.println("\n===== STAFF CREATION =====");

        Librarian librarian = new Librarian(3, 416010, "Philip Bautista", 2001, "Circulation", 3500, 50, 120);

        SeniorLibrarian seniorLibrarian = new SeniorLibrarian(4, 647111, "Nick Virag", 2002, "Research", 4500, 70, 200, "Digital Archives", 500);

        LibraryAssistant assistant = new LibraryAssistant(5, 416111, "Lee Yang", 2003, "Customer Service", 2800, "Evening", 200);

        System.out.println("All three staff members created successfully.");

        System.out.println("\n===== MEMBER DETAILS =====");

        System.out.println(member1);
        System.out.println();
        System.out.println(member2);

        System.out.println("\n===== STAFF DETAILS =====");

        librarian.displayStaffDetails();
        System.out.println();

        seniorLibrarian.displayStaffDetails();
        System.out.println();

        assistant.displayStaffDetails();

        System.out.println("\n===== LATE FEES =====");

        System.out.printf("Late fee for 5 overdue days: $%.2f%n", librarian.calculateLateFee(5));

        System.out.printf("Late fee for 5 days at $1.50 per day: $%.2f%n", librarian.calculateLateFee(5, 1.50));

        System.out.println("\n===== MONTHLY COMPENSATION =====");

        System.out.printf("Librarian: $%.2f%n", librarian.calculateMonthlyCompensation());

        System.out.printf("Senior Librarian: $%.2f%n", seniorLibrarian.calculateMonthlyCompensation());

        System.out.printf("Library Assistant: $%.2f%n", assistant.calculateMonthlyCompensation());

        System.out.println("\n===== COUNTERS =====");

        int totalMembers = 2;

        System.out.println("Total People: " + Person.getPersonCount());

        System.out.println("Total Members: " + totalMembers);

        System.out.println("Total Staff: " + LibraryStaff.getStaffCount());

        System.out.println("\n===== RUNTIME POLYMORPHISM =====");

        LibraryStaff[] staffMembers = {librarian, seniorLibrarian, assistant};

        for (LibraryStaff staff : staffMembers) {
            staff.getRoleDescription();

            System.out.printf("Monthly Compensation: $%.2f%n", staff.calculateMonthlyCompensation());
        }

        System.out.println("\n===== INTERFACES =====");

        Reportable report = librarian;
        report.generateReport();

        Reservable reservation = librarian;

        reservation.reserveBook("B101");

        System.out.println("\n===== OPERATION SUMMARY =====");
        System.out.println("Member registrations attempted: 3");
        System.out.println("Staff created: 3");
        System.out.println("Book reservation examples completed.");
    }
}