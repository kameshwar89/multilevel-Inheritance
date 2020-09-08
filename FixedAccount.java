package com.secondhand2;

public class FixedAccount extends SavingAccount {
	int lockingPeriod;

	public FixedAccount(String accountNumber, double balance, String accountHolderName, double minimumBalance,
			int lockingPeriod) {
		super(accountNumber, balance, accountHolderName, minimumBalance);
		this.lockingPeriod = lockingPeriod;
	}

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
	public void display()
	{
		System.out.println("xyz");
	}
	
	

}
