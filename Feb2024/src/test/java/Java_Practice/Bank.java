package Java_Practice;

/* Write a Java program to create a class known as "BankAccount"
 *  with methods called deposit() and withdraw(). Create a subclass
 *   called SavingsAccount that overrides the withdraw() method to 
 *   prevent withdrawals if the account balance falls below
 *    one hundred.*/

public class Bank {
	double balance;
	double amount;
	
	public Bank(double balance,double amount) {
		this.balance=balance;
		this.amount=amount;   
	}
	
public void deposit(double amount) {
	balance +=amount;
	
}

public double withdraw(double amount) {
	         balance -=amount;
	         return balance;
	      
	                     
}

}
