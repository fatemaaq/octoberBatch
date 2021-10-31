package JavaHackathon;

public class Q16RemoveCharFromString {

	
	private static String removeChar(String str, char c) {
		 if (str == null) {
	         return null;
	      }
	      return str.replaceAll(Character.toString(c), "");
	}
	public static void main(String[] args) {
		
		      String str = "Hello Java World";
		      System.out.println(str);
		 
		      str = removeChar(str, 'a'); //removeChar was not identified until we made a method for it.
		      System.out.println(str);
	}

}
