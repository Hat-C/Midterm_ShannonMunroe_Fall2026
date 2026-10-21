package midterm;
/**
 * @author Shannon Munroe
 * @date October 21st 2026
 */
public class MainDriver {
	public static void main(String args[]) {
		Member member1;
		Member member2;
		Librarian librarian;
		SeniorLibrarian librarianS;
		LibraryAssistant libraryAssist;
		System.out.println("\nmember 1");
		try {
			System.out.println(new Member("NiASFnj32", "", 0, 45, 45));
		} catch (IllegalArgumentException e) { System.out.println("initialization failed"); }
		member1 = new Member("NiASFnj32", "Ari", 0, 45, 45);
		System.out.println("initialization success");
		System.out.println(member1);
		System.out.println("\nmember 2");
		try {
			member2 = new Member("8JdhW7o", "Beatrice", 1000000000, 7, 26);
		} catch (IllegalArgumentException e) { System.out.println("initialization failed"); }
		try {
			member2 = new Member("8JdhW7o", "Beatrice", 738738738, -30, 0);
		} catch (IllegalArgumentException e) { System.out.println("initialization failed"); }
		member2 = new Member("8JdhW7o", "Beatrice", 738738738, 45, 26);
		System.out.println("initialization success");
		System.out.println(member2);
		member2.displayBasicDetails();
		System.out.println("member2 is a "+member2.getRoleDescription());
		System.out.println("\nlibrarian");
		try {
			librarian = new Librarian("kWuFk","Colleen", 111111111, -25, "booksDepartment", 50.00, 50 );
		} catch (IllegalArgumentException e) { System.out.println("initialization failed"); }
		try {
			librarian = new Librarian("kWuFk","Colleen", 111111111, 25, "", 50.00, 50 );
		} catch (IllegalArgumentException e) { System.out.println("initialization failed"); }
		try {
			librarian = new Librarian("kWuFk","Colleen", 111111111, 25, "booksDepartment", 0.00, 2 );
		} catch (IllegalArgumentException e) { System.out.println("initialization failed"); }
		try {
			librarian = new Librarian("kWuFk","Colleen", 111111111, 25, "booksDepartment", 50.00, -2 );
		} catch (IllegalArgumentException e) { System.out.println("initialization failed"); }
		librarian = new Librarian("kWuFk","Colleen", 111111111, 25, "booksDepartment", 50.00, 2 );
		System.out.println("initialization success");
		//System.out.println(Person.getPersonCount());
		librarian.displayStaffDetails();
		System.out.println("\nsenior librarian");
		try {
			librarianS = new SeniorLibrarian("k38FN2o7","Darla", 222222222, 72, "booksDepartment", 50.00, 50, "",5.00);
		} catch (IllegalArgumentException e) {System.out.println("initialization failed"); }
		try {
			librarianS = new SeniorLibrarian("k38FN2o7","Darla", 222222222, 72, "booksDepartment", 50.00, 50, "Arithmetic", -5.00);
		} catch (IllegalArgumentException e) { System.out.println("initialization failed"); }
		librarianS = new SeniorLibrarian("k38FN2o7","Darla", 222222222, 72, "booksDepartment", 50.00, 50, "Arithmetic", 5.00);
		System.out.println("initialization success");
		librarianS.displayStaffDetails();
		System.out.println("\nlibrary assistant");
		try {
			libraryAssist = new LibraryAssistant("","Eliza",333333333, 829, "booksDepartment2", 40.00, "morning", 10.00);
		} catch (IllegalArgumentException e) {System.out.println("initialization failed"); }
		try {
			libraryAssist = new LibraryAssistant("qKie93Fy4","Eliza",333333333, 829, "booksDepartment2", 40.00, "", 10.00);
		} catch (IllegalArgumentException e) {System.out.println("initialization failed"); }
		try {
			libraryAssist = new LibraryAssistant("qKie93Fy4","Eliza",333333333, 829, "booksDepartment2", 40.00, "morning", 0.00);
		} catch (IllegalArgumentException e) {System.out.println("initialization failed"); }
		libraryAssist = new LibraryAssistant("qKie93Fy4","Eliza",333333333, 829, "booksDepartment2", 40.00, "morning", 10.00);
		System.out.println("initialization success");
		libraryAssist.displayStaffDetails();
		System.out.println("\ncurrent person count: "+Person.getPersonCount());
		System.out.println("\nregister member1");
		try {
			member1.registerMember(-3.00);
		} catch (IllegalArgumentException e) {System.out.println("registration failed"); }
		member1.registerMember(3.00);
		System.out.println("\nregister member2");
		try {
			member2.registerMember(-3.00,"monthly");
		} catch (IllegalArgumentException e) {System.out.println("registration failed"); }
		try {
			member2.registerMember(3.00,"");
		} catch (IllegalArgumentException e) {System.out.println("registration failed"); }
		member2.registerMember(3.00,"monthly");
		System.out.println("\ncheckout book");
		try {
			librarian.reserveBook("");
		} catch (IllegalArgumentException e) {}
		try {
			librarian.reserveBook("7283");
		} catch (IllegalArgumentException e) {}
		try {
			librarian.reserveBook("u8E3t");
		} catch (IllegalArgumentException e) {}
		try {
			librarian.reserveBook("9OIj3");
		} catch (IllegalArgumentException e) {}
		try {
			librarianS.reserveBook("9OIj3");
		} catch (IllegalArgumentException e) {}
		System.out.println("\nlibrarian reports");
		librarian.generateReport();
		System.out.println("pay: "+librarian.calculateMonthlyCompensation()+"\n");
		librarianS.generateReport();
		System.out.println("pay: "+librarianS.calculateMonthlyCompensation()+"\nlibrary assistant report");
		libraryAssist.generateReport();
		System.out.println("pay: "+libraryAssist.calculateMonthlyCompensation());
		System.out.println("\ngenerate late fees");
		try {
			System.out.println("late fee: "+librarian.calculateLateFee(-5));
		} catch (IllegalArgumentException e) {}
		System.out.println("late fee: "+librarianS.calculateLateFee(5));
		try {
			System.out.println("late fee: "+librarian.calculateLateFee(-5,1.5));
		} catch (IllegalArgumentException e) {}
		try {
			System.out.println("late fee: "+librarian.calculateLateFee(5,-1.5));
		} catch (IllegalArgumentException e) {}
		System.out.println("late fee: "+librarian.calculateLateFee(5,1.5));
		System.out.println("\nall initialized objects");
		System.out.println("\nmember1");
		System.out.println(member1);
		System.out.println(member1.getRoleDescription());
		member1.displayBasicDetails();
		System.out.println("membership type: "+member1.membershipType+"\noutstanding fees: "+member1.outstandingFees);
		System.out.println("\nmember2");
		System.out.println(member2);
		System.out.println(member2.getRoleDescription());
		member2.displayBasicDetails();
		System.out.println("membership type: "+member2.membershipType+"\noutstanding fees: "+member2.outstandingFees);
		System.out.println("\nlibrarian");
		System.out.println(librarian);
		System.out.println(librarian.getRoleDescription());
		librarian.displayStaffDetails();
		System.out.println("\nsenior librarian");
		System.out.println(librarianS);
		System.out.println(librarianS.getRoleDescription());
		librarianS.displayStaffDetails();
		System.out.println("\nlibrary assistant");
		System.out.println(libraryAssist);
		System.out.println(libraryAssist.getRoleDescription());
		libraryAssist.displayStaffDetails();
		
	}
	/*
	System.out.println(member1);
	System.out.println("reinitializing member1");
	member1 = new Member("NiASFnj32", "Ari", 0, 45, 45);
	System.out.println(member1);
	System.out.println("that was a demonstration to show it changes when an object is initialized, it shall now be manually set back");
	Person.personCount -= 1;
	System.out.println("person count: "+Person.getPersonCount());*/
}
