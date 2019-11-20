package com.thread.day2;

public class BankModel {

	public static void main(String[] args) {
		final Customer customer = new Customer();
		
		//Withdraw amount
		new Thread() {
			public void run()
			{
				customer.withdraw(220002F);
			}
		}.start();
		//Deposite amount
		new Thread(){
			public void run() {
				customer.deposite(1000F);
			}
		}.start();
	}

}
