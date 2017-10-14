package _01.thread.start;

class MyRunnableMoreThread implements Runnable {

	@Override
	public void run() {
		System.out.println("run method()");
		for (int i = 0; i < 10; i++) {
			String name = Thread.currentThread().getName();
			long id = Thread.currentThread().getId();
			System.out.println("index:" + i + " " + name + " " + id);
		}
	}

}

public class RunnableMoreThreadTest {

	public static void main(String[] args) {

		MyRunnableMoreThread myRunnable = new MyRunnableMoreThread();
		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);
		Thread t3 = new Thread(myRunnable);

		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");

		t1.start();
		t2.start();
		t3.start();

	}
}

/*
Ornegimizi incelersek t1, t2, t3 isimlerine sahip 3 tane Thread referans degiskenleri olusturduk. Bu referans degiskenleri olustururken myRunnable referans degiskenini Thread sinifinin yapilandiricisina arguman olarak verdik.

setName metodu ile threadlere isim verebiliriz. Sonrasinda start metodunu her bir referans degisken icin cagirdik.

Thread.currentThread() o an calisan Thread’i doner.
*/