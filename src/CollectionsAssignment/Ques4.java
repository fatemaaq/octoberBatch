package CollectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;


public class Ques4 { // Store 5 students into Array List (name, id, age) and sort ascending order of name.

	  String studentName;
	  int studentId;
	  int studentAge;
	
	public static void main(String[] args) {
			
		ArrayList<String> stu = new ArrayList<String>();
		stu.add("Mark");
		stu.add("John");
		stu.add("Andy");
		stu.add("AQ");
		stu.add("Fatema");
		
		System.out.println("Original List");
		System.out.println(stu);
		
		System.out.println();
		
		System.out.println("Sorted List");
		Collections.sort(stu);
		System.out.println(stu);
		
		
		

	}

}
