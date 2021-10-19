//If else If Ladder Construct demonstration
package Basic;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = reader.nextInt();
		System.out.println("Entered marks is: " +marks);
		
		if(marks<50) {
			System.out.println("FAIL");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("PASS");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("SECOND CLASS");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("FIRST CLASS");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("FIRST CLASS with Distinction");
		}
		else if(marks>=90 && marks<=100) {
			System.out.println("RANK");
		}
		else {
			System.out.println("Invalid");
		}
		
		
		reader.close();
		
		

	}

}
