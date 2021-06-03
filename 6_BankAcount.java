package BANK;

public class BankAccount {

	private String accountNum; 
	private double balance;
  
	public BankAccount() {
		super();
		this.accountNum = "";
		this.balance = 0;
	}
	public BankAccount(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
  
	public String toString() {
		String msg = "";
		msg += "帐号：" + this.accountNum + "\n";
		msg += "余额" + this.balance + "\n";
		return msg;
	}

}
