package main.demo.bonus;

public class MultiThreadingMain {

	public static void main(String[] args) {
		Thread thread1 = new Thread1();
		Thread thread2 = new Thread2();

		thread1.start();
		thread2.start();

	}

}
