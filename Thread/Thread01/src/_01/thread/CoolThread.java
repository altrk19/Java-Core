package _01.thread;

public class CoolThread extends Thread {

	@Override
	public void run() {
		System.out.println("The job is starting!");
	}

	public static void main(String[] args) {
		CoolThread t = new CoolThread();
		Thread t2 = new Thread(new CoolThread()); //ekranda birþey basmaz. thread çalýþtýrýlmadý.
	}

}
