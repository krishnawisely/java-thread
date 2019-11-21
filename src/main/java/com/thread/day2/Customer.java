package com.thread.day2;

public class Customer {
	Float balance = 220001F;
	Float amount = null;
	synchronized void deposite(Float amount)
	{
		this.amount = amount;
		this.balance += amount;
		System.out.println(amount+" is credited!");
		System.out.println("Balance=>"+this.balance);
		notify();//Wakeup waiting thread
	}
	synchronized void withdraw(Float amount)
	{
		if( this.balance < amount){
			System.out.println("Less Balnce");
			try {
				wait();//Here unlock thread state
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			this.amount = amount;
			this.balance -= amount;
			System.out.println(amount+" is debited!");
			System.out.println("Balance=>"+this.balance);
		}
	}
}
