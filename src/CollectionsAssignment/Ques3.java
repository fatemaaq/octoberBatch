package CollectionsAssignment;

import java.util.*;
import java.util.LinkedList;


public class Ques3 {

	public static void main(String[] args) {
		LinkedList<Integer> game = new LinkedList<Integer>();
		game.add(1);
		game.add(7);
		game.add(6);
		game.add(2);
		game.add(3);
		
		System.out.println("Original List");
		System.out.println(game);
		
		System.out.println();
		
		System.out.println("Sorted List");
		Collections.sort(game);
		System.out.println(game);
		
	}

}
