
public class Diagram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
				int rows = 7; // Number of Rows we want to print		
				//Printing the pattern
				for (int i = 1; i <= rows; i++)
				{
				for (int j = 1; j < i; j++)
					{
						System.out.print(" ");
					}
				for (int j = i; j <= rows; j++)
 					{
						System.out.print("* ");
					}
					System.out.println();
				}
				

			//Printing the reverse pattern
				for (int i = rows-1; i >= 1; i--)
				{
				for (int j = 1; j < i; j++)
					{
						System.out.print(" ");
					}
				for (int j = i; j <= rows; j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
			
			}
		}

	}


