package com.secondhand2;

public class AccountBO {
	
	public AccountBO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FixedAccount getAccoundDetail(String detail)
	{
		String value[]=detail.split(",");
		String accountNumber=value[0];
		double balance=Double.parseDouble(value[1]);
		String accountHolderName=value[2];
		double minimumBalance=Double.parseDouble(value[3]);
		int lockingPeriod=Integer.parseInt(value[4]);
		FixedAccount fa=new FixedAccount(accountNumber,balance,accountHolderName,minimumBalance,lockingPeriod);
		System.out.println("Account Details :");
		System.out.println("Account Number  Balance  Account holder name  Minimum balance  Locking period");
		System.out.println(accountNumber);
		System.out.println(balance);
		System.out.println(accountHolderName);
		System.out.println(minimumBalance);
		System.out.println(lockingPeriod);
		
		return fa;
	}
	

}
