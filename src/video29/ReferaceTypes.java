package video29;

public class ReferaceTypes {

	public static void main(String[] args) {
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		
		sayi1=30;
		System.err.println(sayi1);//10 dur
		
		
		int[] sayilar1 = {1,2,3}; //yada int[] sayilar = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		
		sayilar2=sayilar1;
		
		sayilar1[0] = 10;
		
		System.err.println(sayilar2[0]);
		 //cevap 10 olacaktır çünkü bunlar referans tiplerdir.Sayiların kendisi
		//stackta tutulurken değeri heaptadır.

	}

}
