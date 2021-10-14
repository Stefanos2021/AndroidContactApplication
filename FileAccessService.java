package com.example.milestone6attempt3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


//
//import com.fasterxml.jackson.core.JsonGenerationException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

public class FileAccessService implements DataAccessService {

	public ArrayList<BaseContact> readAllData() {
		// TODO Auto-generated method stub
		return null;
	}





	public static void LoadRecords() throws IOException {

		PersonContact p1 = new PersonContact("Will Smith", "NewYork", "NewYork", "23999", "United States",
				"123-123-4444", "Stefanos@gmail.com", "Willie");

	PersonContact p2 = new PersonContact("Stefanos", "Fresno", "Ca", "93111", "UnitedStates", "559-999-3123",
			"Email@dress", "Greek Boi");
	PersonContact p3 = new PersonContact("John", "Phoenix", "AZ", "12313", "United States", "233-131-1312",
				"Email1232@adress", "Nerd");
	PersonContact[] peopletxt = new PersonContact[3];

		peopletxt[0] = p1;
		peopletxt[1] = p2;
				peopletxt[2] = p3;

		for (int i = 0; i < peopletxt.length; i++) {
			String outputText = peopletxt[i].getName() + " | " + peopletxt[i].getCity() + " | "
					+ peopletxt[i].getState() + " | " + peopletxt[i].getPostalCode() + " | " + peopletxt[i].getCountry()
					+ " | " + peopletxt[i].getPhoneNumber() + " | " + peopletxt[i].getEmail() + " | "
					+ peopletxt[i].getNickName();
			SaveRecords("in.txt", outputText, true);

		}
		BusinessContact p4 = new BusinessContact("Bob", "Jersey", "NY", "12313", "United States", "233-131-1312",
				"Email1232@adress", "AT&T");
		BusinessContact[] buis = new BusinessContact[1];
		buis[0] = p4;
		for (int i = 0; i < buis.length; i++) {
			String outputText2 = buis[i].getName() + " | " + buis[i].getCity() + " | " + buis[i].getState() + " | "
					+ buis[i].getPostalCode() + " | " + buis[i].getCountry() + " | " + buis[i].getPhoneNumber() + " | "
					+ buis[i].getEmail() + " | " + buis[i].getCompanyName();

			SaveRecords("in.txt", outputText2, true);

		}



	}
	

	public static void SaveRecords(String fileName, String text, boolean append) throws IOException {

		File fileText = new File(fileName);

		// create a file writer class
		FileWriter fw = new FileWriter(fileText, append);

		// create a printer writer class
		PrintWriter pw = new PrintWriter(fw);

		pw.println(text);
		pw.close();
		
		

	}

/
	public boolean saveAllContacts() {
		
		return false;
	}

	@Override
	public void writeAllData(BusinessService businessService) {
		// TODO Auto-generated method stub

	}

}
