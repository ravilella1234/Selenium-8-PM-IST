package com.hdfc.loans.carloans;

public class Icici implements Rbi
{

	public static void main(String[] args) 
	{
		Icici i=new Icici();
		i.deposit();
		i.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("iam overiden withdrawl in ICICI");
		
	}

	@Override
	public void deposit() {
		System.out.println("iam overiden deposit in ICICI");
		
	}

}
