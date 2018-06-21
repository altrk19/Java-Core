class Counter implements Runnable {

	@Override
	public void run() {
		increment();
		decrement();
	}
	
	/* 
	public void increment() {
		c++;
	}

	public void decrement() {
		c--;
	}

	 */
	
	static int c = 0;
	
	public static synchronized void increment() {
		c++;
	}

	public static synchronized void decrement() {
		c--;
	}

	public static int value() {
		return c;
	}

}

public class CounterTest {

	public static void main(String[] args) {

		Counter counter = new Counter();

		Thread t1 = new Thread(counter);
		Thread t2 = new Thread(counter);

		t1.start();
		t2.start();

		System.out.println(counter.c);

	}

}