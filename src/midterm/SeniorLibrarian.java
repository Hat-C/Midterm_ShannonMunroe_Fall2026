package midterm;
/**
 * @author Shannon Munroe
 * @date October 21st 2026
 */
public class SeniorLibrarian extends Librarian {
	final String specialization;
	double seniorityAllowance;
	public SeniorLibrarian(String personID, String name, int phoneNumber, int staffId, String department, double monthlySalary, int dailyIssueLimit, String specialization, double seniorityAllowance) {
		if(specialization.length()==0) {
			System.out.println("ERROR: SeniorLibrarian: specialization cannot be empty");
			throw new IllegalArgumentException("specialization cannot be empty");
		} else if(seniorityAllowance<=0) {
			System.out.println("ERROR: SeniorLibrarian: seniority allowance must be a positive number");
			throw new IllegalArgumentException("seniority allowance must be a positive number");
		}
		super(personID,name,phoneNumber,staffId,department,monthlySalary,dailyIssueLimit);
		this.specialization = specialization;
		this.seniorityAllowance = seniorityAllowance;
	}
	@Override public double calculateMonthlyCompensation() {
		return booksProcessed.length*2.00+monthlySalary+seniorityAllowance;
	}
	@Override protected void displayStaffDetails() {
		System.out.println("name: "+this.name+"\nstaff id: "+this.staffId+"\ndepartment: "+this.department+"\nspecialization: "+this.specialization+"\nsalary with allowance: "+(this.monthlySalary+this.seniorityAllowance));
	}
}
