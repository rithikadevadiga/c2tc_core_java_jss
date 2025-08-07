package Banking_Transaction_System;

public class Bank {
private static int totalAccounts=0;
public Bank() {
	 totalAccounts++;
}

public static int getTotalAccount() {
	return totalAccounts;
}
}
