package Banking_Transaction_System;


//Abstract class
abstract class Account {
 protected double balance;

 // Constructor
 public Account(double initialBalance) {
     this.balance = initialBalance;
 }

 // Abstract methods to be implemented by subclasses
 abstract void deposit(double amount);
 abstract void withdraw(double amount);
 abstract double getBalance();

 // Common method (can be inherited)
 public void showBalance() {
     System.out.println("Current Balance: " + balance);
 }
}

//Subclass 1: SavingsAccount
class SavingsAccount extends Account {

 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " to Savings Account.");
 }

 @Override
 void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn " + amount + " from Savings Account.");
     } else {
         System.out.println("Insufficient balance in Savings Account.");
     }
 }

 @Override
 double getBalance() {
     return balance;
 }
}

//Subclass 2: CheckingAccount
class CheckingAccount extends Account {

 public CheckingAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " to Checking Account.");
 }

 @Override
 void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn " + amount + " from Checking Account.");
     } else {
         System.out.println("Insufficient balance in Checking Account.");
     }
 }

 @Override
 double getBalance() {
     return balance;
 }
}


