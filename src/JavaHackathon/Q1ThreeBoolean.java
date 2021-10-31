package JavaHackathon;

public class Q1ThreeBoolean {

	public static void main(String[] args) {
		
		//Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true
		
		boolean a = true;
		boolean b = true;
		boolean c = false;
		
		if((a && b) || (b && c) || (a && c)) {
			System.out.println("Found atleast two out of three is true");
		
		}
		else {
			System.out.println("Did not find atleast two out of three is true");
		}
		
		
		

	}

}
