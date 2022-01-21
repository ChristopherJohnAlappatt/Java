package Java_Project;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int passwordLength = 10;
	private String OrgSuffix = "FCRIT.com";
	
	//Constructor to receive first and last name
		public Email(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		//Call a method to ask for department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		
		//Combine elements to generate email
		String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + OrgSuffix;
		System.out.println("Your Email is :" + email);
		
		//Call a method that returns a random password
				this.password = randomPassword(passwordLength);
				System.out.println("Your Password is :" + this.password);
	}
	
	
	//Ask for department
	private String setDepartment() {
		System.out.print("#Department Codes#\n1 for Computer \n2 for Mechanical\n3 for Electrical\n0 for none\nEnter the department :");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		in.close();
		if (depChoice == 1) { return "comps";}
		else if (depChoice == 2) { return "mech";}
		else if (depChoice == 3) { return "elect";}
		else { return "";}
	}
	
	
	
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "abcdefghijklmnopqrstuvw0123456789@#$%";
		char[] password = new char[length];
		for (int i=0; i<length; i++ ) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	
}