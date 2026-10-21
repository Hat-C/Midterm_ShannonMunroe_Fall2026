package midterm;
/**
 * @author Shannon Munroe
 * @date October 21st 2026
 */
public class LibraryAssistant extends LibraryStaff implements Reportable {
	final String shiftType;
	double shiftAllowance;
	public LibraryAssistant(String personID, String name, int phoneNumber, int staffId, String department, double monthlySalary, String shiftType, double shiftAllowance) {
		if(shiftType.length()==0) {
			System.out.println("ERROR: LibraryAssistannt: shift type cannot be empty");
			throw new IllegalArgumentException("shift type cannot be empty");
		} else if(shiftAllowance<=0) {
			System.out.println("ERROR: LibraryAssistannt: shift allowance must be a positive number");
			throw new IllegalArgumentException("shift allowance must be a positive number");
		}
		super(personID,name,phoneNumber,staffId,department,monthlySalary);
		this.shiftType = shiftType;
		this.shiftAllowance = shiftAllowance;
	}
	public double calculateMonthlyCompensation() {
		return monthlySalary+shiftAllowance;
	}
	public void generateReport() {
		System.out.println(this.name+" - "+this.staffId+" payment report");
		System.out.println("$"+calculateMonthlyCompensation());
	}
	@Override public void displayStaffDetails() {
		System.out.println("name: "+this.name+"\nstaff id: "+this.staffId+"\ndepartment: "+this.department+"\nshift: "+this.shiftType+"\nsalary with allowance: "+(this.monthlySalary+this.shiftAllowance));
	}
}
