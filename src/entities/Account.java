package entities;

public class Account {
	
	private int accountNumber;
	private String accountHolder;
	private double depositValue;
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getDepositValue() {
		return depositValue;
	}

    public void deposit(double depositValue) {
    	this.depositValue += depositValue;
    }
    
    public void withdraw(double depositValue) {
    	this.depositValue -= depositValue + 5.0;
    }
	
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + accountHolder + ", Balance: " 
			   + String.format("%.2f", depositValue);
	}
	
}
