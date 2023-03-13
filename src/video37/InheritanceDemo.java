package video37;

public class InheritanceDemo {

	public static void main(String[] args) {

		KrediUI krediUI = new KrediUI();
		
		//krediUI.KrediHesapla(new OgretmenKrediManager());
		//krediUI.KrediHesapla(new AskerKrediManager());
		krediUI.KrediHesapla(new TarimKrediManager());

	}

}
