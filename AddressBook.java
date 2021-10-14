package com.example.milestone6attempt3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import java.util.Scanner;  // Import the Scanner class
public class AddressBook extends BaseContact implements Comparable<BaseContact> {

	public List<BaseContact> theList;
	
	// default constructor creates an empty list of type baseContact

	// default constructor
	public AddressBook() {
		this.theList = new ArrayList<BaseContact>();

	}
	// add one to person contact to the list


	public <T extends BaseContact> void addOne(T contact) {
		this.theList.add(contact);
		System.out.println("Contact added! Name: " + contact.getName() + "\n");

	}

	// remove a contact from main list. return true for success false for failure
	public <T extends BaseContact> boolean deleteOne(T contact) {
		// check to see if the contact is in the list before removing it
		if (this.theList.contains(contact)) {
			this.theList.remove(contact);
			System.out.println(" Removed " + contact.getName() + " from address book");

			return true;
		} else {
			return false;
		}
	}
	
	
	// method to display contacts
	public void displayContacts() {
		System.out.println("Printing Contacts...");
		int position = 0;
		for (int i = 0; i < theList.size(); i++) {
			position = theList.indexOf(theList.get(i)) + 1;
			System.out.println("---------------------------------------------------------");
			System.out.println("Contact Position: " + position);
			System.out.println(theList.get(i).toString());
		}
	}

	
	// methods TO DISPLAY SEARCH FUNCTIONS FOR ALL MY CRITERIAS
	
	
	public void search(String name) {
		name = name.toLowerCase();
		if (searchList(name) == true) {
			for (int i = 0; i < theList.size(); i++) {
				if (theList.get(i).getName().toLowerCase().contains(name)) {
					System.out.println("-----Found Contact--------");
					System.out.println(theList.get(i).toString());
				}
			}
		} else {
			System.out.println("No Contact Matched the search!");
		}

	}

	public void searchCity(String city) {
		city = city.toLowerCase();
		if (searchListCity(city)) {
			for (int i = 0; i < theList.size(); i++) {
				if (theList.get(i).getCity().toLowerCase().contains(city)) {
					System.out.println("-----Found Contact--------");
					System.out.println(theList.get(i).toString());
				}
			}
		} else {
			System.out.println("No Contact Matched the search!");
		}

	}

	public void searchState(String state) {
		state = state.toLowerCase();
		if (searchList(state) == true) {
			for (int i = 0; i < theList.size(); i++) {
				if (theList.get(i).getState().toLowerCase().contains(state)) {
					System.out.println("-----Found Contact--------");
					System.out.println(theList.get(i).toString());
				}
			}
		} else {
			System.out.println("No Contact Matched the search!");
		}

	}
	public void searchPostalCode(String postalCode) {
		postalCode = postalCode.toLowerCase();
		if (searchList(postalCode) == true) {
			for (int i = 0; i < theList.size(); i++) {
				if (theList.get(i).getPostalCode().toLowerCase().contains(postalCode)) {
					System.out.println("-----Found Contact--------");
					System.out.println(theList.get(i).toString());
				}
			}
		} else {
			System.out.println("No Contact Matched the search!");
		}

	}
	public void searchCountry(String Country) {
		Country = Country.toLowerCase();
		if (searchList(Country) == true) {
			for (int i = 0; i < theList.size(); i++) {
				if (theList.get(i).getCountry().toLowerCase().contains(Country)) {
					System.out.println("-----Found Contact--------");
					System.out.println(theList.get(i).toString());
				}
			}
		} else {
			System.out.println("No Contact Matched the search!");
		}

	}
	
	public void searchphoneNumber(String phoneNumber) {
		phoneNumber = phoneNumber.toLowerCase();
		if (searchList(phoneNumber) == true) {
			for (int i = 0; i < theList.size(); i++) {
				if (theList.get(i).getPhoneNumber().toLowerCase().contains(phoneNumber)) {
					System.out.println("-----Found Contact--------");
					System.out.println(theList.get(i).toString());
				}
			}
		} else {
			System.out.println("No Contact Matched the search!");
		}

	}
	public void searchEmail(String email) {
		email = email.toLowerCase();
		if (searchList(email) == true) {
			for (int i = 0; i < theList.size(); i++) {
				if (theList.get(i).getEmail().toLowerCase().contains(email)) {
					System.out.println("-----Found Contact--------");
					System.out.println(theList.get(i).toString());
				}
			}
		} else {
			System.out.println("No Contact Matched the search!");
		}

	}
	public void searchStreetname(String streetName) {
		streetName = streetName.toLowerCase();
		if (searchList(streetName) == true) {
			for (int i = 0; i < theList.size(); i++) {
				if (theList.get(i).getPhoneNumber().toLowerCase().contains(streetName)) {
					System.out.println("-----Found Contact--------");
					System.out.println(theList.get(i).toString());
				}
			}
		} else {
			System.out.println("No Contact Matched the search!");
		}

	}


	// boolean search list to determine where something is and get it
	
	public boolean searchList(String name) {
		for (int i = 0; i < theList.size(); i++) {
			if (theList.get(i).getName().toLowerCase().contains(name)) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean searchListCity(String city) {
		for (int i = 0; i < theList.size(); i++) {
			if (theList.get(i).getCity().toLowerCase().contains(city)) {
				return true;
		}
	}
	return false;
}
	public boolean searchListState(String state) {
		for (int i = 0; i < theList.size(); i++) {
			if (theList.get(i).getState().toLowerCase().contains(state)) {
				return true;
			}
		}
		return false;
	}	public boolean searchListpostalCode(String postalCode) {
	for (int i = 0; i < theList.size(); i++) {
		if (theList.get(i).getPostalCode().toLowerCase().contains(postalCode)) {
			return true;
	}
}
	return false;
	}
	public boolean searchListCountry(String Country) {
	for (int i = 0; i < theList.size(); i++) {
		if (theList.get(i).getCountry().toLowerCase().contains(Country)) {
				return true;
		}
	}
	return false;
	}
	public boolean searchListphoneNumber(String phoneNumber) {
		for (int i = 0; i < theList.size(); i++) {
			if (theList.get(i).getPhoneNumber().toLowerCase().contains(phoneNumber)) {
			return true;
		}
		}
	return false;
	}	public boolean searchListEmail(String email) {
		for (int i = 0; i < theList.size(); i++) {
			if (theList.get(i).getEmail().toLowerCase().contains(email)) {
			return true;
			}
	}
		return false;
	}
	public boolean searchListNickName() {
	for (int i = 0; i < theList.size(); i++) {
		if (theList.get(i).getCity().toLowerCase().contains(city)) {
			return true;
		}
		}
	return false;
	}
//	


		public <T extends BaseContact> void UserAddList(T contact) {
			 Scanner input = new Scanner(System.in);  // Create a Scanner object
			   // Read user input
			 input.hasNext();
		}

	
	
	// compare to method
	// below are the list <baseContacts> and read all data and save all data
	public int compareTo(BaseContact o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<BaseContact> list() {
		return theList;
	}

	
	public ArrayList<BaseContact> readAllData() {
//		// TODO Auto-generated method stub
	return null;
	}

	public boolean saveAllContacts() {
		
			
		
		return false;
	}


	public void setTheList(List<PersonContact> someList) {
		// TODO Auto-generated method stub
		
	}
	

}
