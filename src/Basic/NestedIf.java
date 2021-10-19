//Program to show Nested IF construct
package Basic;

public class NestedIf {
	
	public static void main(String[] args) {
		int age = 29;
		String gender ="Female";
		String citizenship = "Indian";
		
		if(age > 21) {
			if(gender == "male")
				System.out.println("The person is an adult Male");
			else
				System.out.println("The person is an adult but not Male");
			
			if(citizenship == "Indian")
				System.out.println("The Person also has voting right");
			else
				System.out.println("The Person does not have voting right");
		}
		System.out.println("Out of If construct");
		
	}
		
	
}