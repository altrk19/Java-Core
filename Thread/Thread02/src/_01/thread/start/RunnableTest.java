package _01.thread.start;

class MyRunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("This is Runnable run metot");
	}

}

public class RunnableTest {

	public static void main(String[] args) {

		MyRunnableThread myRunnable = new MyRunnableThread();
		Thread t = new Thread(myRunnable);
		t.start();

	}
}