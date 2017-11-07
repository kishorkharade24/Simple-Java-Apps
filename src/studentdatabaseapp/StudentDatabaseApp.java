/**
 * 
 */
package studentdatabaseapp;

import java.util.Date;
import java.util.Scanner;

/**
 * @author kishor
 *
 */
public class StudentDatabaseApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Ask how many new students we want to add
		System.out.print("Enter number of new students to enroll : ");
		Scanner sc = new Scanner(System.in);
		int noOfStudents = sc.nextInt();
		Student[] students = new Student[noOfStudents];
		
		// Create n number of students
		for (int n = 0; n < noOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTution();
		}
		
		// print the students info
		for(Student student : students) {
			System.out.println("*****************************************************");
			System.out.println(student.showInfo());
			System.out.println("*****************************************************");
		}
	}
}
