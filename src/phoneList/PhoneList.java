package phoneList;

import java.util.ArrayList;
import java.util.Scanner;

import notes01_basic_objects.Student;

/*
 * Phone List
 * 
 * You'll be using an ArrayList of Contact objects
 * to crate a digital address book.
 * 
 * You MUST
 *   - Use an ArrayList
 *   - Keep list in alphabetical order
 *   - Complete the 
 *   
 * You May
 *   - Add methods as you see fit
 *   - Change method parameters and return types
 *   
 * You May NOT
 *   - change the menu method
 *        unless you're changing what methods it calls
 * 
 */


public class PhoneList {

	/*
	 * Instance Variables
	 */
	
	private ArrayList<Contact> PhoneList;
	
	
	//Constructor
	public PhoneList() {
		//initialize instance variables
		
		this.PhoneList = new ArrayList<Contact>(); 
	}
	
	
	
	/*
	 * This should do the following
	 * (whatever order you feel is best)
	 *   - ask the user for contact's name and number
	 *   - create a new Contact object with that input
	 *   - add that object to the phone list
	 *        in alphabetical order
	 *        Hint: compareTo(String other)
	 *   - tell the user what the new contact is and that 
	 *        it's been added
	 */
	public void addContact() {
		
		Scanner inkey = new Scanner (System.in); //creates the keyboard
		
		System.out.println("Contact's Name: "); //prompts the user
		String contactName = inkey.next(); //stores the data into a variable
		
		System.out.println("Contact's Number: "); //prompts the user
		int contactNum = inkey.nextInt(); //stores the data into a variable 

		Contact info = new Contact(contactName, contactNum); //creates a new object
		
		PhoneList.add(info);
		
		Contact temp; 
		
		 for (int i = 0; i < PhoneList.size(); i++) {
	            for (int j = i + 1; j < PhoneList.size(); j++) {
	               
	                // to compare one string with other strings
	                if ((PhoneList.get(i).getName()).compareTo(PhoneList.get(j).getName()) > 0) {
	                    // switches the places of the elements
	                    temp = PhoneList.get(i);
	                    PhoneList.add(i, PhoneList.get(j));
	                    PhoneList.add(j, temp);
	                }
	            }
	        }
		 System.out.println(info);
		
	}
	
	
	
	/*
	 * This should do the following
	 * (whatever order you feel is best)
	 *   - ask the user for the contact's name
	 *   - search through the list for that contact
	 *   - if the contact is not found
	 *        tell the user and end the method
	 *   - if the contact is found
	 *        Remove the item from the list
	 *        Print the contact's name and number
	 *        Say that contact has been removed
	 *        Remove the item from the list
	 *        
	 */
	public void removeContact() {
		
		Scanner inkey = new Scanner (System.in); //creates the keyboard

		System.out.println("Contact's Name: "); //prompts the user
		String Name = inkey.next(); //stores the data into a variable
		
		boolean found = false; //if contact is found or not
		
		//goes through the array
		for (int i = 0; i < PhoneList.size(); i++) {
			
			//checks if that name is there or not and removes the contact if found 
			if (Name.equals(PhoneList.get(i).getName())) {
				
				System.out.println("The Contact: " + "\n" + PhoneList.get(i)); 
				PhoneList.remove(PhoneList.get(i));
				System.out.println("The contact has been removed");
				found = true; //doesn't print out the wrong message
				break; //exits so it doesn't continue checking
			}
		}
		
		//let's the user know if the contact is non-existent 
		if (found == false) {
			System.out.println("Contact " + Name + " is not found"); 
		}
		
	}
	
	
	/*
	 * This should
	 *   - Print all items in list
	 *   - Must be headers for all columns
	 *   - print in alphabetical order
	 *   - print line of something to "box" the list
	 *       Examples:
	 *          *****************
	 *          -----------------
	 *          #################
	 */
	public void printList() {
		
		//prints out the header
		System.out.println("-------My Contacts-------"); 
		
		//prints out the individual elements 
		for(int i = 0; i < PhoneList.size(); i++) {
			System.out.println(PhoneList.get(i));
		}
		
	}

	
	
	/*
	 * GET FAMILIAR WITH THIS MENU!!!!
	 * 
	 * I will be asking you to create programs with menus.
	 * You may do them however you like.  But here is an example
	 * of how to manage them.
	 * 
	 */
	public void menu() {
		
		int input = 0;
		
		String menu = "-----------------------\n"
				    + "     Contacts Menu     \n"
				    + "-----------------------\n"
				    + "  1 - Add Contact      \n"
				    + "  2 - Remove Contact   \n"
				    + "  3 - Print List       \n"
				    + "  4 - Quit             \n\n"
				    + "Enter Choice: ";
		
		while (input != 4) {  //keep looping till user want's to quit
			
			//try getting an input
			try {
				String inputString = getString("\n" + menu);  //get input
				input = Integer.valueOf(inputString);  //try converting to int
			}
			catch (Exception e) {
				//if bad input, set input to 0
				input = 0;  
			}
		
			switch (input) {
			case 1:
				//handle menu line 1: Add Contact
				addContact();
				break;
			case 2:
				//handle menu line 2: Remove Contact
				removeContact();
				break;
			case 3:
				//handle menu line 3: Print List
				printList();
				break;
			case 4:
				//handle menu line 4: Quit
				System.out.println("\nGoodbye!");
				break;
			default:
				System.out.println("\nNot a valid input.\n"
								 + "Please try again.");
			}
			
			
		
		}
		
	}
	
	public String getString(String str) {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print(str);  //notice it's NOT a print line.  This way input is next to question.
		return inKey.nextLine();
		
	}
	
	
	public static void main(String[] args) {
		PhoneList app = new PhoneList();
		app.menu();
	}
}
