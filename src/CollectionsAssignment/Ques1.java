package CollectionsAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ques1 {

	public static void main(String[] args) {
		// Question 1 : Print string in reverse order

		List<String> li = new ArrayList<String>();
		li.add("Orange");
		li.add("Apple");
		li.add("Banana");
		li.add("Strawberry");
		
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		
	}
}	
		
	

