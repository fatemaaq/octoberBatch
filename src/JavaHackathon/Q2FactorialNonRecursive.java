package JavaHackathon;

public class Q2FactorialNonRecursive {
	//In order to find factorial of any number without recursive method, we have to use for loop
	
	
	public static int factorial(int numb) {
		int fact=1;
		for(int i = 1; i<=numb; i++ ) {
			fact=fact*i; //this will do multiplication of all consecutive number below given number
		}
			return	fact;
	}
	
	
	public static void main(String[] args) {

		System.out.println("The factorial of given number is: " + factorial(7));
	}

}
