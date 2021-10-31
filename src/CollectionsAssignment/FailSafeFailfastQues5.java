package CollectionsAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
  


public class FailSafeFailfastQues5 { //fail fast example

	
	public static void main(String[] args) {
		
				ArrayList<Integer> al = new ArrayList<Integer>();
		        al.add(1);
		        al.add(2);
		        al.add(3);
		        al.add(4);
		        al.add(5);
		  
		        Iterator<Integer> itr = al.iterator();
		        while (itr.hasNext()) {
		            if (itr.next() == 2) {
		                // this will throw Exception "Concurrent Modification"
		                al.add(2);
		            }
		        }
		  
		        // But if you will use CopyOnWriteArrayList it will not throw exception because Fail-safe is the method included.
                  


	}

}
