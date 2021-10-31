package JavaHackathon;

public class Q12Palindrome {

	public static void main(String[] args) {
		 //Check if "MalayalaM" is a Palindrome in a given string'
		  // Also in the same program use Numbers to check if it a Palindrome or not by changing MalayalaM to Numbers
		
		String S1= "MalayalaM";
		//S1.compareToIgnoreCase("Malayalam");
		String S2= "";
		for(int i = S1.length() - 1; i>=0; i--) {
			S2 += S1.charAt(i);   //getting the value of i for entire length and adding it to the S2 String in reverse order
				// System.out.println(S2);
			
		}
		
		boolean palindrome = true;
		for(int i = 0; i < S1.length(); i++) {
			if(S1.charAt(i) != S2.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
			System.out.println("It is a Palindrome!");
		}
		
		else {
			System.out.println("It is a not a Palindrome!");
		}

		
	}

}
