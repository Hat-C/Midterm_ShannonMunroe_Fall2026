package midterm;
/**
 * @author Shannon Munroe
 * @date October 21st 2026
 */
public class Librarian extends LibraryStaff implements Reservable, Reportable {
	final int dailyIssueLimit;
	String[] booksProcessed;
	public Librarian(String personID, String name, int phoneNumber, int staffId, String department, double monthlySalary, int dailyIssueLimit) {
		if(dailyIssueLimit<0) {
			System.out.println("ERROR: Librarian: daily issue limit cannot be negative");
			throw new IllegalArgumentException("daily issue limit cannot be negative");
		}
		super(personID,name,phoneNumber,staffId,department,monthlySalary);
		this.dailyIssueLimit = dailyIssueLimit;
		this.booksProcessed = new String[0];
	}
	public double calculateMonthlyCompensation() {
		return booksProcessed.length*2.00+monthlySalary;
	}
	public void reserveBook(String bookId) {
		if(bookId.length()==0) {
			System.out.println("ERROR: Librarian: no book id entered");
			throw new IllegalArgumentException("no book id entered");
		} else if(booksProcessed.length<dailyIssueLimit) {
			String[] tempList = booksProcessed;
			booksProcessed = new String[booksProcessed.length+1];
			for(int i=0; i<tempList.length; i++) {
				booksProcessed[i] = tempList[i];
			} booksProcessed[tempList.length] = bookId;
			System.out.println("checked out: "+bookId);
		} else {
			System.out.println("this librarian cannot issue any more books today");
		}
	}
	public void generateReport() {
		System.out.println(this.name+" ["+this.staffId+"] book reserve report");
		System.out.println("books processed:");
		for(String a : booksProcessed) {
			System.out.println("   - "+a);
		}
		System.out.println("total: "+booksProcessed.length);
		System.out.println("additional pay: $"+(booksProcessed.length*2.00));
	}
	public double calculateLateFee(int daysOverdue) {
		if(daysOverdue<0) {
			System.out.println("ERROR: Librarian: book cannot be negative days overdue");
			throw new IllegalArgumentException("book cannot be negative days overdue");
		}
		return daysOverdue*1.00;
	}
	public double calculateLateFee(int daysOverdue, double dailyRate) {
		if(daysOverdue<0) {
			System.out.println("ERROR: Librarian: book cannot be negative days overdue");
			throw new IllegalArgumentException("book cannot be negative days overdue");
		} else if(dailyRate<0) {
			System.out.println("ERROR: Librarian: overdue daily rate cannot be negative");
			throw new IllegalArgumentException("overdue daily rate cannot be negative");
		}
		return daysOverdue*dailyRate;
	}
}
