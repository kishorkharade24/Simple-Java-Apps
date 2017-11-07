/**
 * 
 */
package emailapp;

import java.util.Scanner;

/**
 * @author kishor
 *
 */
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int defaultPasswordLength = 10;
	private String departments;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "atmecs.com";
	
	// constructor to recieve firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method asking for departments: return department
		this.departments = setDepartment();
		
		// call method to return random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("You password : " + this.password);
		
		// Combine elements to generate email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.departments + "." + companySuffix;
	}
	
	// Ask for departments
	private String setDepartment() {
		System.out.print("New worker : " + firstName + ", Department Code : \n1. For Sales\n2. For Development\n3. Accounting\n0. For none \nEnter the department : ");
		Scanner sc = new Scanner(System.in);
		int departmentChoice = sc.nextInt();
		if (departmentChoice == 1) { return "Sales"; }
		else if (departmentChoice == 2) { return "dev"; }
		else if (departmentChoice == 3) { return "acc"; }
		else { return "";}
	}
	
	// Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%1234567890";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// set mainbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change password
	public void changePassword(String pwd) {
		this.password = pwd;
	}
	
	public int getMailBoxCapacity() {
		return this.mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return this.alternateEmail;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String showInfo() {
		return "Display name : " + this.firstName + " " + this.lastName +
					"\nCompany email : " + this.email + "\nMailbox capacity : " +
					this.mailboxCapacity;
	}
}
