/**
 * 
 */
package bankaccountapp;

/**
 * @author kishor
 *
 */
public abstract class Account implements IBaseRate {
	// List common properties for savings and checking account
	private String name;
	private String sSN;
	private double balance;

	private static int index = 10000;
	protected String accountNumber;
	protected double rate;

	// Constructor set base properties and initialize account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;

		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		
		// Set rate
		this.setRate();
	}

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoOfSSN = this.sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = this.index;
		int randomNo = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNo;
	}

	public void compound() {
		double accruedInterest = this.balance * (this.rate / 100);
		System.out.println("Accrued Interest : $" + accruedInterest);
		this.balance += accruedInterest;
		this.printBalance();
	}
	
	// List common methods - transactions
	public void deposite(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Depositing $" + amount);
		this.printBalance();
	}
	
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		System.out.println("Withdrowing $" + amount);
		this.printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		this.balance = this.balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		this.printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now $" + this.balance);
	}
	
	public void showInfo() {
		System.out.println("*********************************** ACCOUNT INFO ********************************************");
		System.out.println(
				"Name : " + this.name + 
				"\nAccount Number : " + this.accountNumber + 
				"\nBalance : " + this.balance +
				"\nRate : " + this.rate + "%");
	}
}
