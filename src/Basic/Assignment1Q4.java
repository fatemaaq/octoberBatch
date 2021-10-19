package Basic;

public class Assignment1Q4 {

	public static void main(String[] args) {
		// Remove duplicate characters from a string "Hello"
	

		
				String s = new String("Hello");
				String tmp;
				char c;
				String output = new String("");
		        
		        for (int i = 0; i < s.length(); i++) 
		        {
		        	c = s.charAt(i);
		            tmp = Character.toString(c);
		            if(output.contains(tmp) == false)
		            {
		            	output = output + tmp;
		            }
		        }

		        System.out.println(output);

		    }

	}


