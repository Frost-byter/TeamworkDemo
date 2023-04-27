package com.skillstorm.general;

public class MyCounter extends Thread {
	
	@Override
	public void run() {
		// Sarah Malloy
		for (int i = 0; i < 58; i+=2) {
			System.out.println(i + " ");
		}
	}
}
