package JavaHackathon;

public class Q4IntArrayPalindrome {

	public static void main(String[] args) {
		
		int [] num = {1,2,2,1};
		int []rev = new int [4];
		for(int i = num.length - 1; i >= 0; i--) {
			rev[(num.length-1)-i] = num[i];
		}
		boolean palindrome = true;
		for(int i = 0; i < num.length; i++) {
			if(rev[i] != num[i]) {
				palindrome = false;
				break;
			}
		}
		if(palindrome) {
			System.out.println("Array is a Palindrome!");
			}
		else {
			System.out.println("Array is not a Palindrome!");
		}
	}
	
	
}
