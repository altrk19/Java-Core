/*Thread.sleep metodunu kodumuzda her yerde cagirabiliriz. main metodu calistiginda “main” 
 ismine sahip thread calisacaktir. Burada calisan main threadini 3 saniye sleep durumuna gecirebiliriz.*/


package _01.sleep;

public class ThreadMainTest {

	public static void main(String[] args) {
		System.out.println("Before calling sleep");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("After calling sleep");

	}

}
