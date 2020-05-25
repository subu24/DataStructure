package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {

	
	public static void main(String[] args) {
		ExecutorService excs= Executors.newFixedThreadPool(10);
		for(int i=0;i<100;i++) {
			excs.execute(new Task());
		}
		System.out.println("Main Name"+Thread.currentThread().getName());	
	}
	
	static class Task implements Runnable{

		@Override
		public void run() {
			System.out.println("Thread Name"+Thread.currentThread().getName());	
		}
		
	}
}
