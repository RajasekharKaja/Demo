
import java.util.Scanner;

public class StringSample {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Eclipse.....");  
	
		String content = "Java tutorial time table";
		
		String message = new String(" Transaction is successful ");
		
		System.out.println("No of Charecters in the string: " + content.length());
		System.out.println("is given string is emtpy: " + content.isEmpty());
		
		if(message.trim().equals("Transaction is successful")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		System.out.println("Provide environmnet QA/DEV/UAT/PROD to run autoamtion tests");
		Scanner scan = new Scanner(System.in);
		String env = scan.nextLine();
		
		if(env.toLowerCase().contentEquals("qa")) {
			System.out.println("www.qa.sample.com");
		}
		
		int val = 10;
		String strVal = String.valueOf(val);
		
		System.out.println("Replace of the content: " + content.replace("a", "@") );
		System.out.println("Replace of the content: " + content.replace("Java", "Selenium") );
		
		String welcomMessage = "Welcome @@";
		System.out.println("Welcome message : " + welcomMessage.replace("@@", "RAMUN"));
		
		if(content.contains("Java")) {
			System.out.println("This is JAVA tutorial");
		}
		
		if(env.equalsIgnoreCase("qA")) {
			System.out.println("QA ENVIRONEMNT");
		}
		
		String cartAmount = "$90.00";
		 System.out.println(cartAmount.substring(1,2));
	}

}
