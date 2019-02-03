public class ForLoopSampleTri
{
	
	public static void main(String[] args)
	{

		for (int i = 0; i < 5; i++)

		{

			for (int j = 5; j > 0; j--) 



			{
			
				if((j-1)<=i)
					System.out.print("*");

				else
					System.out.print(" ");
				
			}
			System.out.println("");
			
		}
	}
}