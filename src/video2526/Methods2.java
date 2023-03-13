package video2526;

public class Methods2 {

	public static void main(String[] args) {
	
		
		int sayi = topla(0,6);
		String yeniMesaj = sehirVer();
		
		System.err.println(yeniMesaj + " " + sayi);
		System.err.println("----------------");
		int toplam= topla2(1,2,3,4,5,6);
		System.err.println(toplam);
		System.err.println("----------------");

	}
	
	public static void ekle() { System.err.println("Eklendi");}
	public static void sil() {System.err.println("Silindi");}
	public static void guncelle () {System.err.println("Güncellendi");}
	
	public static int topla(int sayi1,int sayi2) {return sayi1+sayi2;}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			
			toplam=toplam+sayi;//toplam+=sayi;
			
		}
		return toplam;
	}
	
	
	public static String sehirVer() {
		return "Ankara";
	}

}
