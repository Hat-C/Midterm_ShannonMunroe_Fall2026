package midterm;
/**
 * @author Shannon Munroe
 * @date October 21st 2026
 */
public abstract class Person {
	final String personID; //there is no specification this is a number it could be alphanumerical.
	String name;
	int phoneNumber;
	static int personCount;
	public Person(String personID, String name, int phoneNumber) {
		try {
			personID.charAt(0);
			name.charAt(0);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("ERROR: Person: strings cannot be empty");
			throw new IllegalArgumentException("strings cannot be empty");
		} if(phoneNumber<0||phoneNumber>999999999) {
			System.out.println("ERROR: Person: invalid phone number");
			throw new IllegalArgumentException("invalid phone number");
		}
		this.personID = personID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		personCount++;
	}
	public static int getPersonCount() {
		return personCount;
	}
	public void displayBasicDetails() {
		System.out.println("name: "+this.name+"\nid: "+this.personID+"\nphone: "+this.phoneNumber);
	}
	abstract protected String getRoleDescription();
	@Override public String toString() {
		return "{ personID="+this.personID+", name="+this.name+", phoneNumber="+this.phoneNumber+" } personCount="+personCount;
	}
}
