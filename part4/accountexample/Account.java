package part4.accountexample;

public class Account {
	String nameAccount;
	double valueAccount;
	
	@Override
	public String toString() {
		return nameAccount + ", " + valueAccount; 
	}
	
	//default constructor
	public Account() {
		this.nameAccount = "";
		this.valueAccount = 0;
	}
	
	//constructor of initialization 
	public Account(String name, double value) {
		this.nameAccount = name;
		this.valueAccount = value;
	}
	
	public void withdraw(double valueWithdraw) {
		this.valueAccount -= valueWithdraw;
	}
	 
	public void deposit(double valueDeposited) {
		this.valueAccount += valueDeposited;
	}
	
	public double balance() {
		return this.valueAccount;
	}
}

