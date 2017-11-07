/**
 * 
 */
package studentdatabaseapp;

import java.util.Scanner;

/**
 * @author kishor
 *
 */
public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tutionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor prompts user to enter students
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student first name : ");
		this.firstName = sc.nextLine();
		
		System.out.print("\nEnter student last name : ");
		this.lastName = sc.nextLine();
		
		System.out.print("\n1. Freshmen\n2. Sophmore\n3. Junior\n4. Senior \nEnter student class level : ");
		this.gradeYear = sc.nextInt();
		
		setStudentID();
	}
	
	// Generate an id
	private void setStudentID() {
		// Grade level + id
		id++;
		this.studentID = this.gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if(!course.equalsIgnoreCase("Q")) {
				this.courses = this.courses + "\n  " + course;
				this.tutionBalance += this.costOfCourse;
			} else {
				break;
			}
		} while(1 != 0);
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is $" + this.tutionBalance);
	}
	
	// Pay tution
	public void payTution() {
		viewBalance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your payment : ");
		int payment = sc.nextInt();
		this.tutionBalance = this.tutionBalance - payment;
		System.out.println("Thank you for ur payment of $" + payment);
		viewBalance();
	}
	
	// Show status
	public String showInfo() {
		return "Name : " + this.firstName + " " + this.lastName + "\n" +
				"Grade level : " + this.gradeYear + "\n" +
				"Courses enrolled : " + this.courses + "\n" +
				"Tution balance : $" + this.tutionBalance;
	}
}
