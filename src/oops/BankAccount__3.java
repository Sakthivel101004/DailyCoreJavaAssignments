package oops;
/*
 * 3. Encapsulation – Bank Account
A bank wants to protect a customer's accountNumber and balance from direct modification. The balance should only be changed through deposit() and withdraw() methods.

Question: Create a BankAccount class using encapsulation with private variables, getters/setters where appropriate, and methods for deposit and withdrawal
*/

public class BankAccount__3 {
	private int accountno;
	private double balance;
	
	
	
	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	void setbalance(double balance){
		this.balance=balance;
		
	}
	 
	double getbalance() {
		return balance;
	}
	
	
	void deposit(double amt) {
	this.balance+=amt;
	System.out.println("deposit amt: "+amt);
		
	}
	void withdraw(double amt) {
		this.balance-=amt;
		
		System.out.println("withdraw amt: "+amt);
		
	}
	
	void display() {
		System.out.println("accountno: "+accountno+"balance: "+balance);
	}
	
	
	
	
	

}
