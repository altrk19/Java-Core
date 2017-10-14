//setPriority metodunu kullanarak threadlere priority(oncelik) degeri verebiliriz.
//en y�ksek �ncelik : 10

package _02.priority;

public class ThreadPriorityTest implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " index:" + i);
		}
	}

	public static void main(String[] args) {
		ThreadPriorityTest sleepTest = new ThreadPriorityTest();

		Thread thread1 = new Thread(sleepTest);
		Thread thread2 = new Thread(sleepTest);
		Thread thread3 = new Thread(sleepTest);

		thread1.setName("myThread1");
		thread2.setName("myThread2");
		thread3.setName("myThread3");

		thread1.setPriority(10); //en y�ksek �ncelik
		thread2.setPriority(1);
		thread3.setPriority(5);

		thread1.start();
		thread2.start();
		thread3.start();
	}

}