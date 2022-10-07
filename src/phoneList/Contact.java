package phoneList;

/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */	

public class Contact {

	private String name; 
	private int phoneNum; 
	
	public Contact(String name, int phoneNum) {
		
		this.name = name; 
		this.phoneNum = phoneNum; 
	}
	
	public String getName() {
		return name; 
	}
	
	public int getPhoneNum() {
		return phoneNum; 
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setPhoneNum(int newPhoneNum) {
		this.phoneNum = newPhoneNum;
	}
	
	public String toString() {
		
		return "Name: " + name.toString() + "\n" + "Phone Number: " + phoneNum;
	}
}
