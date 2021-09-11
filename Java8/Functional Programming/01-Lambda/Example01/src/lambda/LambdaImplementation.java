package lambda;

import java.util.function.Consumer;

public class LambdaImplementation {
	private int id = 1;

	public static void main(String[] args) {

		// Anonymous class, multiple instances	
		System.out.println("\nAnonymous class:");
		for (int i=0; i<5; i++) {
			Consumer<String> myPrinter1 = new Consumer<String>() {
				@Override
				public void accept(String msg) {
					System.out.println("Consuming " + msg);
				}
			};
			myPrinter1.accept(myPrinter1.toString());
		}

		
		
		// Non-capturing lambda, one instance
		System.out.println("\nNon-capturing lambda:");
		for (int i=0; i<5; i++) {
			Consumer<String> myPrinter2 =
					msg -> System.out.println("Consuming " + msg);
			
			myPrinter2.accept(myPrinter2.toString());
		}

		
		
		// Constant-capturing lambda, one instance
		System.out.println("\nConstant-capturing lambda:");
		final int secret = 42;
		for (int i=0; i<5; i++) {
			Consumer<String> myPrinter3 =
					msg -> System.out.println("Consuming " + msg + ", " + secret);
			
			myPrinter3.accept(myPrinter3.toString());
		}

		LambdaImplementation lambda02 = new LambdaImplementation();
		lambda02.foo();
	}


	public void foo() {
		System.out.println("\nInstance-capturing lambda:");
		
		for (int i=0; i<5; i++) {
			// this-capturing lambda, many instances!
			Consumer<String> myPrinter4 =
					msg -> System.out.println("Consuming " + msg + ", " + id);
			
			myPrinter4.accept(myPrinter4.toString());
		}
	}
}



/*
//Note-1:
Anonymous class:
Consuming main.Lambda02Implementation$1@4554617c
Consuming main.Lambda02Implementation$1@74a14482
Consuming main.Lambda02Implementation$1@1540e19d
Consuming main.Lambda02Implementation$1@677327b6
Consuming main.Lambda02Implementation$1@14ae5a5

anonymous class'ı new ile oluşturdugumuz için 5 farklı consumer objesi olustu.





Note-2:
Non-capturing lambda:
Consuming main.Lambda02Implementation$$Lambda$1/1747585824@448139f0
Consuming main.Lambda02Implementation$$Lambda$1/1747585824@448139f0
Consuming main.Lambda02Implementation$$Lambda$1/1747585824@448139f0
Consuming main.Lambda02Implementation$$Lambda$1/1747585824@448139f0
Consuming main.Lambda02Implementation$$Lambda$1/1747585824@448139f0

lambda kullanılarak sadece bir tane consumer objesi olusturuldu. Daha performanslı bu yüzden.





//Note-3:
Constant-capturing lambda:
Consuming main.Lambda02Implementation$$Lambda$2/2093631819@7ba4f24f, 42
Consuming main.Lambda02Implementation$$Lambda$2/2093631819@7ba4f24f, 42
Consuming main.Lambda02Implementation$$Lambda$2/2093631819@7ba4f24f, 42
Consuming main.Lambda02Implementation$$Lambda$2/2093631819@7ba4f24f, 42
Consuming main.Lambda02Implementation$$Lambda$2/2093631819@7ba4f24f, 42

lambda ile constant değere erisim saglandı.




//Note-4:
Instance-capturing lambda:
Consuming main.Lambda02Implementation$$Lambda$3/1989780873@4dd8dc3, 1
Consuming main.Lambda02Implementation$$Lambda$3/1989780873@6d03e736, 1
Consuming main.Lambda02Implementation$$Lambda$3/1989780873@568db2f2, 1
Consuming main.Lambda02Implementation$$Lambda$3/1989780873@378bf509, 1
Consuming main.Lambda02Implementation$$Lambda$3/1989780873@5fd0d5ae, 1

lambda ile instance degiskene erişim saglandı.
 */