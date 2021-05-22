
import java.util.Scanner;

public class ArraySample {
	
	public static void main(String[] areg) {
		
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter no. of users");
		int userCount = scan1.nextInt();
		
		String[] users = new String[userCount];
		//int[] sno = new int[10];
		
//		users[0] = "Mobin";
//		users[1] = "kranthi";
//		users[2] = "Ramya";
//		users[3] = "Priyanka";
//		users[4] = "Pradeep";
		
		System.out.println("Enter "+userCount+" user name");
		Scanner scan = new Scanner(System.in);
		for(int index = 0; index < users.length; index++) {
			users[index] = scan.nextLine();
		}
		
		int userRepeat = 0;
		
		for(int index = 0; index < users.length; index++) {
				if(users[index].equals("AAA")) {
					System.out.println("User exists in the list");
					userRepeat++;
				}
		}
		
		System.out.println("AAA user record is repeated " + userRepeat);
	}

}
