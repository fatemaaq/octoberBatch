

package JavaHackathon;

import java.util.Scanner;

public class Q25binarysearch {

	public static void main(String[] args) {
		int first = 0;
		int last = 10;
		int arr[] = { 1, 10, 11, 12, 17, 23, 29, 50, 51, 53 };
		int key = 0;

		Scanner reader = new Scanner(System.in);
 		System.out.print("\nEnter your key:");
		key = reader.nextInt(); //Read User Input
		System.out.println("Entered key is:"+key);
		reader.close();
		
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1; // It is shrinking the elements of array and discarding what is remaining. 
								//This time last will have the new value by almost discarding half of the items from array list
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}
}
