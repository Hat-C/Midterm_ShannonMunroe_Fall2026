package midterm;
/**
 * @author Shannon Munroe
 * @date October 21st 2026
 */
public abstract class LibraryStaff extends Person {
	final int staffId;
	String department;
	double monthlySalary;
	static int staffCount;
	public LibraryStaff(String personID, String name, int phoneNumber, int staffId, String department, double monthlySalary) {
		if(staffId<0) {
			System.out.println("ERROR: LibraryStaff: staff id cannot be negative");
			throw new IllegalArgumentException("staff id cannot be negative");
		} else if (department.length()==0) {
			System.out.println("ERROR: LibraryStaff: department unspecified");
			throw new IllegalArgumentException("department unspecified");
		} else if(monthlySalary<=0) {
			System.out.println("ERROR: LibraryStaff: staff must be paid a positive salary");
			throw new IllegalArgumentException("staff must be paid a positive salary");
		}
		super(personID,name,phoneNumber);
		this.staffId = staffId;
		this.department = department;
		this.monthlySalary = monthlySalary;
		staffCount++;
	}
	public String getRoleDescription() {
		return "library worker";
	}
	public abstract double calculateMonthlyCompensation();
	protected void displayStaffDetails() {
		System.out.println("name: "+this.name+"\nstaff id: "+this.staffId+"\ndepartment: "+this.department+"\nsalary: "+this.monthlySalary);
	}
}
