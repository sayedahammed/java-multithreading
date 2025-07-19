package com.dosomedev;
//javac -d classes src/main/java/com/dosomedev/App.java src/main/java/com/dosomedev/Sprinter.java
//java -cp classes com.dosomedev.App
public class App {
	public static void main(String[] args) throws InterruptedException {

		// Runnable r = new Runnable() {
		// 	@Override
		// 	public void run() {
		// 		for(int i=1; i<=10; i++) {
		// 			System.out.println(i);

		// 			try {
		// 				Thread.sleep(300);
		// 			} catch(InterruptedException e) {
		// 				e.printStackTrace();
		// 			}
		// 		}
		// 	}
		// };

		// Thread t1 = new Thread(r);
		// t1.start();

		Sprinter steve = new Sprinter("Steve", 250, 0);
		Sprinter chuck = new Sprinter("Chuck", 650, 3);
		Sprinter eddie = new Sprinter("Eddie", 150, 0);

		steve.start();
		steve.join();
		chuck.start();
		chuck.join();
		eddie.start();
		eddie.join();

		System.out.println("The race is done!");
	}

}