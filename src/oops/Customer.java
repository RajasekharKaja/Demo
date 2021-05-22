package oops;

public class Customer {	
	public String Name;
	public int accountNumber;
	public double avlBalance = 100.00;
	
	public Customer() {
		
	}
	
	//accessspecifier <modifier> returntype methodname(<orguments.....>) {
	
    //}
	
	public void  display() {
		System.out.println("This is just a display method with no retun value and no Orguments");
	}
	
	public void showData(String content) {
		System.out.println("welcome " + content);
	}
	
	public int sum(int x, int y) {
		//int z = x+y;
		return x+y;
	}
	
	public boolean performUserLogin(String userName, String password) {
	
		if(userName.equals("AAA") && password.equals("123")) {
			return true;
		} else {
			return false;
		}
	}
}
