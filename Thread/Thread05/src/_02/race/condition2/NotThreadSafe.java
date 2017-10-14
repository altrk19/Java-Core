package _02.race.condition2;

public class NotThreadSafe {
	StringBuilder builder = new StringBuilder();

	public static void main(String[] args) {
		NotThreadSafe sharedInstance = new NotThreadSafe();

		new Thread(new MyRunnable(sharedInstance)).start();
		new Thread(new MyRunnable(sharedInstance)).start();

	}

	public void add(String text) {
		this.builder.append(text);
	}

}

class MyRunnable implements Runnable {
	NotThreadSafe instance = null;

	public MyRunnable(NotThreadSafe instance) {
		this.instance = instance;
	}

	public void run() {
		this.instance.add("some text");
	}
}


//Yukarýdaki kodda race condition ortaya çýkar. Bunu engellemek için aþaðýdaki gibi yazýlýr.

/*....
public static void main(String[] args) {
	NotThreadSafe sharedInstance1 = new NotThreadSafe();
	NotThreadSafe sharedInstance2 = new NotThreadSafe();

	new Thread(new MyRunnable(sharedInstance1)).start();
	new Thread(new MyRunnable(sharedInstance2)).start();
}
....*/