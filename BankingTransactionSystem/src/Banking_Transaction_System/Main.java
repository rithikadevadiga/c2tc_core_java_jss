package Banking_Transaction_System;

public class Main {
	public static void main(String[] args) {
	    Bank acc1 = new Bank();
	    Bank acc2 = new Bank();
	    Bank acc3 = new Bank();
	    Bank acc4 = new Bank();
	    System.out.println("Total Bank Accounts: " + Bank.getTotalAccount());
	    SavingsAccount sa = new SavingsAccount(1000);
	     sa.deposit(500);
	     sa.withdraw(200);
	     sa.showBalance();

	     CheckingAccount ca = new CheckingAccount(2000);
	     ca.deposit(1000);
	     ca.withdraw(2500); // Should give insufficient balance
	     ca.showBalance();
	     // Testing the Transaction class
	    
	      // All transactions will have ₹20 as fixed fee
	       Transaction t1 = new Transaction(20);
           t1.performTransaction("Withdraw", 500);
	       t1.performTransaction("Deposit", 1000);
	     

	}
}
