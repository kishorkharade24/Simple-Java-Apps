/**
 * 
 */
package bankaccountapp;

/**
 * @author kishor
 *
 */
public class Checking extends Account {
	// List properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;

	// Constructor to initialize checking properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		this.accountNumber = "2" + this.accountNumber;

		this.setDebitCard();
	}

	public void setRate() {
		this.rate = this.getBaseRate() * .15;
	}

	private void setDebitCard() {
		this.debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		this.debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}

	// List methods specific to checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features : " + 
				"\n\tDebit Card Number : " + this.debitCardNumber +
				"\n\tDebit Card Pin : " + this.debitCardPin); 
	}
}
