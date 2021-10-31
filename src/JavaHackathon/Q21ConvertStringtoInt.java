package JavaHackathon;

public class Q21ConvertStringtoInt {

	public static void main(String[] args) {
		String str = "36";
        try{
            Integer number = Integer.valueOf(str); //"Integer.valueOf()" will converts string to an integer.
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace(); //"printStackTrace in java is used to handle exceptions and errors
        }

	}

}
