package Basic;

import java.util.*;          //If you wanna include only scanner class then can also use import java.util.scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    	Scanner reader = new Scanner(System.in);
 		System.out.print("\nEnter your name:");
		String userName = reader.nextLine(); //Read User Input
		System.out.println("Entered Name is:"+userName);
		reader.close();
		
		
		
		Scanner abd = new Scanner(System.in);
		System.out.println("\nEnter your age:");
		int age = abd.nextInt(); //Reads users age
		System.out.println("Provided age is:"+age);
		abd.close();
		
				
				
		

	}

}
