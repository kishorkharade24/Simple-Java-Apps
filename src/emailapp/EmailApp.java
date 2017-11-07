/**
 * 
 */
package emailapp;

/**
 * @author kishor
 *
 */
public class EmailApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Email email1 = new Email("John", "Miller");
		
		System.out.println(email1.showInfo());
	}

}
