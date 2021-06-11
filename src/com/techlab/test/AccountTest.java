package com.techlab.test;

import com.techlab.model.CurrentAccount;
import com.techlab.model.SavingsAccount;

public class AccountTest {
	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount(102, "Savings", 3200);
		CurrentAccount c1 = new CurrentAccount(103, "Current", 3400);
		s1.deposit(2400);
		s1.withdraw(200);
		c1.deposit(3000);
		c1.withdraw(500);
		System.out.println("Acc No: "+s1.getAccNo());
		System.out.println("Acc Name: "+s1.getAccName());
		System.out.println("Acc Bal: "+s1.getBalance());
		System.out.println("Acc No: "+c1.getAccNo());
		System.out.println("Acc Name: "+c1.getAccName());
		System.out.println("Acc Bal: "+c1.getBalance());
	}
}
