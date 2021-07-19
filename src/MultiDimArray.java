import java.util.Scanner;

public class MultiDimArray {
	
	public static void main(String[] ars) {
		//1
		//2
		//3
		//4
		
		String[][] users = new String[3][2];
		
		users[0][0] = "RAM";
		users[0][1] = "123";
		
		users[1][0] = "SAM";
		users[1][1] = "456";
		
		users[2][0] = "SUR";
		users[2][1] = "789";
		
		System.out.println("Size of the array is: " + users.length);
		Scanner scan = new Scanner(System.in);
		
		for(int row=0; row < 3; row++) {
			for(int col=0; col < 2; col++) {
			    users[row][col] = scan.nextLine();
			}	
		}
		
		for(int row=0; row < 3; row++) {
			for(int col=0; col < 2; col++) {
			    System.out.print( "  " +users[row][col]);
			}	
			System.out.println("Program completed");
			//end of program
		}	
   }

}
