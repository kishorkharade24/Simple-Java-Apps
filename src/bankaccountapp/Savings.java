/**
 * 
 */
package bankaccountapp;

/**
 * @author kishor
 *
 */
public class Savings extends Account {
	// List properties specific to savings account
	private int saftyDepositBoxID;
	private int saftyDepositBoxKey;

	// Constructor to initialize savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		this.accountNumber = "1" + this.accountNumber;

		this.setSaftyDepositBox();
	}

	public void setRate() {
		this.rate = this.getBaseRate() - .25;
	}

	private void setSaftyDepositBox() {
		this.saftyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		this.saftyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	// List methods specific to savings account
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Savings Account Features : " + 
				"\n\tSafty Deposit Box ID : " + this.saftyDepositBoxID +
				"\n\tSafty Deposit Box Key : " + this.saftyDepositBoxKey); 
	}
}
