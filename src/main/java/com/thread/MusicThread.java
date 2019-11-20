package com.thread;

public class MusicThread extends Thread {
	public void run() {
		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " thread is start!");// Here get thread name
			System.out.println(i);
		}
	}
}
