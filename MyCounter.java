package com.skillstorm.homework;

public class MyCounter extends Thread{


	public static void main(String[] args) {

		MyCounter mC = new MyCounter();

		mC.run();

	}

	@Override
	public void run() { // Ernesto Higuera

		int count = 0;

		for(int i = 0; i < 7 ; i++) {
			count++;
		}
		System.out.println(count);

	}
}
