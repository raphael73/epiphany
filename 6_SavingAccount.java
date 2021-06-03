package BANK;

public class SavingAccount extends BankAccount {
	private double interestRate; 

	public SavingAccount() {
		super();
		this.interestRate = 0;
	}
	
	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void payInterest() {
		super.setBalance(super.getBalance() * (1 + this.interestRate));
	}

	public String toString() {
		String msg = "";
		msg += "利率为：" + this.interestRate;
//		msg += super.toString();
		msg += "帐号：" + super.getAccountNum() + "\n";
		msg += "余额：" + super.getBalance() + "\n";
		return msg;
	}

}
