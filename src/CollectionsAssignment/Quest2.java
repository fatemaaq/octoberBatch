package CollectionsAssignment;

import java.util.Iterator;
import java.util.LinkedList;

public class Quest2 {

	public static void main (String[] args) {
		
		//Question 2: Here I am demonstrating difference between Peek and Poll method.
		LinkedList<String> Shoppinglist = new LinkedList<String>();
		Shoppinglist.add("Clothes");
		Shoppinglist.add("Shoes");
		Shoppinglist.add("Bags");
		Shoppinglist.add("Jwellery");
		
		Iterator<String> sl = Shoppinglist.iterator();
		System.out.println("Contents of the Shopping List: ");
		while (sl.hasNext()) {
			System.out.println(sl.next());
		}
		
		System.out.println();
		
		
		System.out.println("The first item in my Shopping list is: " +Shoppinglist.peek());
		//This will print what is on the top of my shopping list
		
		
		
		Shoppinglist.poll();
		//This will remove the first item in my shopping list
		
		System.out.println();
		
		Iterator<String> it = Shoppinglist.iterator();
	      System.out.println("Contents of the queue after removing the first item: ");
	      while(it.hasNext()) {
	         System.out.println(it.next());
	      }
	    //So the peek will target the first object in the list and poll will remove that object/item :)
		
		
		
		
	}
}
