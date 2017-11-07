/**
 * 
 */
package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

/**
 * @author kishor
 *
 */
public class BankAccountApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		// create CSV file then create new accounts based on that data
		// dummy file row : Kishor Kharade,123456789,Savings,2500 i.e name, SSN, accountType, initial deposit
		String file = "./src/bankaccountapp/Accounts.csv";
		
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		if (newAccountHolders == null || newAccountHolders.isEmpty()) {
			System.out.println("No records found.");
		} else {
			for (String[] accountHolder : newAccountHolders) {
				if(accountHolder != null) {
					String name = accountHolder[0];
					String sSN = accountHolder[1];
					String accountType = accountHolder[2];
					double initDeposit = Double.parseDouble(accountHolder[3]);
					
//					System.out.println("\nName : " + name +
//							"\nSSN : " + sSN +
//							"\nAccount Type : " + accountType + 
//							"\nInitial Deposite : $" + initDeposite);
					
					if (accountType.equalsIgnoreCase("savings")) {
						accounts.add(new Savings(name, sSN, initDeposit));
					} else if (accountType.equalsIgnoreCase("checking")) {
						accounts.add(new Checking(name, sSN, initDeposit));
					} else {
						System.out.println("Error reading account type.");
					}
				}
			}
			
			for (Account account: accounts) {
				account.showInfo();
			}
		}
	}
}
