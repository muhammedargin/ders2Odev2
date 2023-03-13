package video24;

public class Metods {

	public static void main(String[] args) {
		
		sayiBulmaca();
		
	}
	
	public static void mesajVer(String mesaj,int kacTane) {
		
		System.err.println(mesaj + "Adet :" + kacTane);
		
	}
	
	
	public static void sayiBulmaca() {
		
		int[] sayilar = new int[] { 1, 2, 7, 3, 4, 5, 6, 7, 7 };

		int aranacak = 7;
		int kacTane = 0;

		for (int sayi : sayilar) {

			if (aranacak == sayi) {
				kacTane = kacTane + 1;

			}
		}

		if (kacTane > 0) {
			mesajVer(aranacak + " sayısı dizide mevcut.",kacTane);
		} else {
			mesajVer(aranacak + " sayısı dizide mevcut değil.",kacTane);

		}
		
		
	}
}
