package JavaHackathon;

import java.util.Scanner;

public class Q24ConsecutiveNumberCombinations {

	public static void main(String[] args) {
		
		int number = 9;
		int i = 0;
		int j = 0;
		int sum = 0;

//		Scanner reader = new Scanner(System.in);
// 		System.out.print("\nEnter your number:");
//		number = reader.nextInt(); //Read User Input
//		System.out.println("Entered key is:"+number);
//		reader.close();
		
		for(i=1; i < number; i++ )
		{
			sum = 0;
			for(j=i; j < number; j++)
			{
				sum = sum + j;
				if(sum == number)
				{
					for(int k = i; k <= j; k++)
					{
						System.out.print(k);
						if(k != j) System.out.print("+");
					}
					System.out.println();
				}
			}
		}
				
	}

}
