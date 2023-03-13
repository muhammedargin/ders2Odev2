package video36;

public class Inherıtance {

	public static void main(String[] args) {
	  Employee employee= new Employee();
	  Customer customer= new Customer(); 
	  
	  employee.salary=9999;
	  employee.age=22; //age, employee clasının extends edildiği person classından çekilmekte
	  
	  EmployeeManager employeeManager = new EmployeeManager();
	  CustomerManager customerManager= new CustomerManager();
	  
	  customerManager.Add();//add operasyonu customerManager classının extends edildiği
	  //PersonManager classından çekilmekte.

	}

}
