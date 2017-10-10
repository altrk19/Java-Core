package _01.sleep;

public class ThreadSleepTest implements Runnable{
	public static void main(String[] args) {
		ThreadSleepTest sleepTest = new ThreadSleepTest();
		
		Thread thread1=new Thread(sleepTest);
		Thread thread2=new Thread(sleepTest);
		Thread thread3=new Thread(sleepTest);
		
		thread1.setName("myThread1");
		thread2.setName("myThread2");
		thread3.setName("myThread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread name :" + Thread.currentThread().getName() + " index:" + i);
			try {
				Thread.sleep(2000);
				// sleep metodu 2 saniye hali hazirda calisan thread'in
				// durumunu sleeping(timed_waiting) yapacaktir.
			} catch (InterruptedException e) {
				System.out.println("exception handled");
			}
		}
		
	}

}
