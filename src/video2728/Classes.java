package video2728;

public class Classes {

	public static void main(String[] args) {
		
		String customerName = "Ahmet";
		CustomerManager customerManager ;//= new CustomerManager();
		
		CustomerManager customerManager2 = new CustomerManager();
		
		customerManager= customerManager2;
		customerManager.Add(customerName);
		customerManager.Remove(customerName);
		customerManager.Update(customerName);
	}

}
