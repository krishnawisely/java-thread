package com.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		GameThread threadObj = new GameThread();
		MusicThread musicObj = new MusicThread();
		PhoneCallThread phoneObj = new PhoneCallThread();
		// Thread1
		threadObj.setName("Game");// Here set thread name
		threadObj.setPriority(6);// Here set priority of the thread
		System.out.println("Priority is " + threadObj.getPriority());// Here get priority
		threadObj.start();// Here call OS to create thread
		// Tread2
		musicObj.setName("Music");
		musicObj.setPriority(5);
		System.out.println("Priority is " + threadObj.getPriority());
		musicObj.start();
		// Thread3
		phoneObj.setName("Phone Call");
		phoneObj.setPriority(9);
		System.out.println("Priority is " + phoneObj.getPriority());
		phoneObj.start();
	}

}
