package BANK;

public class CheckingAccount extends BankAccount {
	private double serviceCharge; 

	public CheckingAccount() {
		super();
		this.serviceCharge = 0;
	}
	
	public CheckingAccount(String accountNum, double balance, double serviceCharge) {
		super(accountNum, balance);
		this.serviceCharge = serviceCharge;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public void assessServiceCharge() {
		super.setBalance(super.getBalance() - this.serviceCharge);
	}

	public String toString() {
		String msg = "";
		msg += "评估服务费：" + this.serviceCharge + "\n";
//		msg += super.toString();
		msg += "帐号：" + super.getAccountNum() + "\n";
		msg += "余额：" + super.getBalance() + "\n";
		return msg;
	}
}
