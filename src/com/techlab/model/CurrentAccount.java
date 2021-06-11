package com.techlab.model;

public class CurrentAccount extends Account {
	private final int minBalance = 1000;
	public CurrentAccount(int accNo, String accName, double balance) {
		super(accNo,accName,balance);
	}

	@Override
	public void withdraw(double amount) {
		double remBal = this.balance - amount;
		if(remBal > minBalance) {
			this.isWithdrawSuccess = false;
		}else {
			this.isWithdrawSuccess = true;
			this.balance = remBal;
		}
	}
}
