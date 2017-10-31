package _02.scanner;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MetinDosyaIslemleri {
	private PrintWriter yazici;                            //printwriter tipinden bir alan olusturduk.
	
	public void dosyaAc() {
		try{
			yazici=new PrintWriter("D:\\Eclipse Workspace\\File01-PrintWriter-Scanner\\personel.txt");
			System.out.println("Dosya acildi");
				
		}catch(FileNotFoundException e) {
			System.err.println("Dosya bulunamadi");
		}
	}
	public void kayitEkle() {
		Personel personel= new Personel(1,"ali","bey",22);
		yazici.println(personel.getPersonelId());
		yazici.println(personel.getIsim());
		yazici.println(personel.getSoyisim());
		yazici.println(personel.getYas());
		System.out.println("Kayit eklendi");
	}
	public void dosyaKapat() {
		if(yazici != null) {
			yazici.close();
			System.out.println("Dosya kapatildi.");
		}
			
	}
	
}
