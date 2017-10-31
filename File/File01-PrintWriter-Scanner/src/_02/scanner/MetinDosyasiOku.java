package _02.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MetinDosyasiOku {
	private Scanner oku;
	public void dosyaAc() {
		try {
			oku=new Scanner(new File("D:\\Eclipse Workspace\\File01-PrintWriter-Scanner\\personel.txt"));
			System.out.println("Dosya acildi");
		}
		catch(FileNotFoundException e) {
			System.err.println("Dosya bulunamadi");
		}
	}
	public void kayitOku() {
		Personel personel=new Personel();
		try {
			
			while(oku.hasNext()) {
				personel.setPersonelId(oku.nextInt());
				personel.setIsim(oku.next());
				personel.setSoyisim(oku.next());
				personel.setYas(oku.nextInt());
				System.out.println(personel);
			}
		}
		catch(NoSuchElementException e) {
			System.out.println("Dosya beklenildiði gibi tasarlanmamis");
		}
	}
	public void dosyaKapat() {
		if(oku != null) {
			oku.close();
			System.out.println("Dosya kapatildi");
		}	
	}
}
