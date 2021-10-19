package Basic;

public class priject1of20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A = {1,4,7,8};
		int [] B = {4,1};
		boolean foundMatch = true;
		int i,j;
		// It is to check whether B is a subset of A
		
		for (i=0; i<2; i++)
		{
			for (j=0; j<4;j++)
			{
				if (B[i] == A[j])
				{
					break;
				}
			}
			
			if(j == 4)
			{
				System.out.print("Not a subset");
				foundMatch = false;
				break;
			}
			
		}
		
		if(foundMatch == true)
		{
			System.out.print("Is a subset");
		}
		
				
	
		


			
	
		

	}

}
