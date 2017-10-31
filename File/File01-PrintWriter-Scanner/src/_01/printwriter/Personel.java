package _01.printwriter;

public class Personel {
	private int personelId;
	private String isim;
	private String soyisim;
	private int yas;
	public Personel() {
		personelId=0;
		isim="girilmedi";
		soyisim="girilmedi";
		yas=0;
		
	}
	public Personel(int personelId, String isim, String soyisim, int yas) {
		this.personelId = personelId;
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
	}
	/**
	 * @return the personelId
	 */
	public int getPersonelId() {
		return personelId;
	}
	/**
	 * @param personelId the personelId to set
	 */
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}
	/**
	 * @return the isim
	 */
	public String getIsim() {
		return isim;
	}
	/**
	 * @param isim the isim to set
	 */
	public void setIsim(String isim) {
		this.isim = isim;
	}
	/**
	 * @return the soyisim
	 */
	public String getSoyisim() {
		return soyisim;
	}
	/**
	 * @param soyisim the soyisim to set
	 */
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	/**
	 * @return the yas
	 */
	public int getYas() {
		return yas;
	}
	/**
	 * @param yas the yas to set
	 */
	public void setYas(int yas) {
		this.yas = yas;
	}
	

}
