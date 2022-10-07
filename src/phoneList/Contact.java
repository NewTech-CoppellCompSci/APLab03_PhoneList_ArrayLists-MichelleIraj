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

	//instance variables
	private String name; 
	private int phoneNum; 
	
	//constructor 
	public Contact(String name, int phoneNum) {
		
		this.name = name; 
		this.phoneNum = phoneNum; 
	}
	
	//getter methods 
	public String getName() {
		return name; 
	}
	
	public int getPhoneNum() {
		return phoneNum; 
	}
	
	//setter methods
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setPhoneNum(int newPhoneNum) {
		this.phoneNum = newPhoneNum;
	}
	
	//prints out the info
	public String toString() {
		
		return "Name: " + name.toString() + "\n" + "Phone Number: " + phoneNum;
	}
}
