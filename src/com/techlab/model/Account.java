package com.techlab.model;

abstract class Account {
	private int accNo;
	private String accName;
	protected double balance;
	public boolean isWithdrawSuccess = true;
	
	public Account(int accNo, String accName, double balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public String getAccName() {
		return accName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public abstract void withdraw(double amount); 
}
