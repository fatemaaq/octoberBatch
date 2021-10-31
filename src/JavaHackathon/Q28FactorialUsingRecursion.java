package JavaHackathon;

public class Q28FactorialUsingRecursion {

	
		
	static int factorial(int x) {

		if (x == 1)
			return 1; // exit ticket, in recursion method we have to tell the program when to end
		else
			return x * (factorial(x - 1));
	}



	public static void main(String [] args) {
		
		int x,fact=1;  
		  int number=8;   //this is the number to calculate factorial    
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);   
	}
}