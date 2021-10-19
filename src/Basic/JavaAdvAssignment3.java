package Basic;

public class JavaAdvAssignment3 {
	// Project to check a. String a = “12378” output = true b. String b = “abc123” output = false
	
	public static boolean isNumber(String str)
	{
		int i;
		
		for(i = 0; i < str.length(); i++)
		{
			char tmp = str.charAt(i);
			if(tmp >= '0' && tmp <= '9')
			{
			}
			else
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String a = "12367895";
		String b = "abc123";

		System.out.println(isNumber(a));
		System.out.println(isNumber(b));
	}
	
}

