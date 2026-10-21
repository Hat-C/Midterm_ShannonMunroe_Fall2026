package midterm;
/**
 * @author Shannon Munroe
 * @date October 21st 2026
 */
public class Member extends Person {
	final int memberNumber;
	int age;
	String membershipType;
	double outstandingFees;
	public Member(String personID, String name, int phoneNumber, int memberNumber, int age) {
		if (memberNumber<0) {
			System.out.println("ERROR: Member: member number cannot be negative");
			throw new IllegalArgumentException("member number cannot be negative");
		} else if (age<=0) {
			System.out.println("ERROR: Member: invalid age");
			throw new IllegalArgumentException("invalid age");
		}
		super(personID,name,phoneNumber);
		this.age = age;
		this.memberNumber = memberNumber;
	}
	public void registerMember(double outstandingFees) {
		if(outstandingFees<0) {
			System.out.println("ERROR: Member: outstanding fees cannot be negative");
			throw new IllegalArgumentException("outstanding fees cannot be negative");
		}
		this.outstandingFees = outstandingFees;
		this.membershipType = "unspecified";
	}
	public void registerMember(double outstandingFees, String membershipType) {
		if(outstandingFees<0) {
			System.out.println("ERROR: Member: outstanding fees cannot be negative");
			throw new IllegalArgumentException("outstanding fees cannot be negative");
		} else if(membershipType.length()==0) {
			System.out.println("ERROR: Member: membership type cannot be empty");
			throw new IllegalArgumentException("membership type cannot be empty");
		}
		this.outstandingFees = outstandingFees;
		this.membershipType = membershipType;
	}
	public String getRoleDescription() {
		return "member";
	}
	
}
