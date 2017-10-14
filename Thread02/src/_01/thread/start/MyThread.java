package _01.thread.start;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("This is run() method!");
	}

	public static void main(String[] args) {

		MyThread thread = new MyThread();
		thread.start();

		thread.run();
		thread.run();

		// thread.start();
		// java.lang.IllegalThreadStateException
		
		/*
		 start() metodu yeni bir thread ve stack baslatir daha sonrasinda run metodunu cagirir.
		run() metodunu direkt cagirmak yeni bir thread ve stack olusturmaz fakat legal bir durumdur. Birden fazla run metodunu cagirabiliriz.
		run() metodunu cagirmak diger metotlari cagirmak gibidir, dolayisiyla diger metotlarda oldugu gibi ayni mevcut/current stack icerisinde calisir/yasar.
		 */

	}
}