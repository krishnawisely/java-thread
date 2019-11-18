package com.thread;

public class GameThread extends Thread {
	public void run() {
		try {
			Thread.sleep(101);// Here thread goto non-runnable state
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " thread is start!");
			System.out.println(i);
		}
	}
}
