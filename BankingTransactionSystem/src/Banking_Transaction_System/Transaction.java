package Banking_Transaction_System;

//Final part implementation
class Transaction {
 // final variable: fixed fee for every transaction
 private final double transactionFee;

 // Constructor to set the fee
 public Transaction(double fee) {
     this.transactionFee = fee;
 }

 // final method: cannot be overridden in subclasses
 public final void performTransaction(String type, double amount) {
     System.out.println("Transaction Type: " + type);
     System.out.println("Transaction Amount: ₹" + amount);
     System.out.println("Transaction Fee: ₹" + transactionFee);
     System.out.println("Total Deducted: ₹" + (amount + transactionFee));
     System.out.println("Transaction Completed.\n");
 }

 // Getter to access the final variable if needed
 public double getTransactionFee() {
     return transactionFee;
 }
}
