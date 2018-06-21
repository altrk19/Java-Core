package pack;

public class WithWaitNotifyTest {

	public static void main(String[] args) {
		Calculate2 calculateThread = new Calculate2();
		calculateThread.start();

		synchronized (calculateThread) {
			try {
				System.out.println("Waiting for calculateThread to complete...");
				calculateThread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("total is: " + calculateThread.total);
			System.out.println("counter is: " + calculateThread.counter);
		}

	}
}

class Calculate2 extends Thread {
	int total;
	int counter;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100000; i++) {
				total += i;
				counter = i;
			}
			notify();
		}
	}
}