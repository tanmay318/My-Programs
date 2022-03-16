package MultiArray;

import java.util.Scanner;

public class Rev2dArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the elements in Array:");
		
		int a[][] = new int[2][2];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				a[i][j] = sc.nextInt();		
			
			}
			for (; i >= 0; i--) 
			{
				
				for (int j = a.length - 1; j >= 0; j--)
				{
					System.out.print(a[i][j]+" ");
				}
					
			}
			
		}
		
	}
}
