package oops;

public class Program {
	
	public static void main(String[] args) {
		
		Customer cust1 = new Customer();   //int x = 10
		Customer cust2 = null;  //int y  //declaration
		
		Customer[] arrCustomer = new Customer[50];
		String[] arrUser = new String[10];
		
		cust1.Name = "RAJ";
		cust1.accountNumber = 13585555;
		cust1.avlBalance = 55000.00;
		
		
		cust2 = new Customer();  //initilization
		cust2.Name = "JHON";
		cust2.accountNumber = 13589647;
		cust2.avlBalance = 357000.00;
		
		arrCustomer[0] = cust1;
		arrCustomer[1] = cust2;
		
		cust1.display();
		cust1.showData("Ramu N");
		
		int output = cust1.sum(10, 20);
		System.out.println("Total of the given numbers: " + output);
		
		boolean isUserLoginSuccess =  cust1.performUserLogin("jhgjghk", "123");
		
		if(isUserLoginSuccess) {
			System.out.println("User login testcase is passed");
		} else {
			System.out.println("User login testcase is Failed");
		}
		
	}

}
