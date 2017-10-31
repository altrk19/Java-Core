package _02.scanner;

public class PersonelTest {

	public static void main(String[] args) {
		MetinDosyaIslemleri metinDosyasi=new MetinDosyaIslemleri();
		metinDosyasi.dosyaAc();
		metinDosyasi.kayitEkle();
		metinDosyasi.dosyaKapat();
		
		System.out.println("------------------");
		
		MetinDosyasiOku metinOku=new MetinDosyasiOku();
		metinOku.dosyaAc();
		metinOku.kayitOku();
		metinOku.dosyaKapat();

	}

}
