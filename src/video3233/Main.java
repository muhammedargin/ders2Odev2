package video3233;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setRenk("Kırmızı");
		
		
		//System.err.println(product.name);
		
		ProductManager productManager = new ProductManager();
		
		productManager.Add(product);
		
		System.err.println(product.getKod());
		
//		productManager.Add2(1, " "," ", 2, 200); yanlis bir kullanim seklidir.
//		productManager.Add2(1, " "," ", 2, 200);
//		productManager.Add2(1, " "," ", 2, 200);
//		productManager.Add2(1, " "," ", 2, 200);
//		productManager.Add2(1, " "," ", 2, 200);

	}

}
