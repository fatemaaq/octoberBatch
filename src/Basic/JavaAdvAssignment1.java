package Basic;

public class JavaAdvAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Dog chases cat, Cat chases rat";
		System.out.println(s);
		String str = s.replaceAll("(?i)cat", "rat"); //I learned a regular expression (?i) will not consider case and replace them all regardless.
		System.out.println(str);
		
	}
}
