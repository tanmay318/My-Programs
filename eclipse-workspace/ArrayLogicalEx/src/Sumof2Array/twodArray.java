package Sumof2Array;

import java.util.Scanner;

public class twodArray {
public static void main(String[] args) {
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int sum[][]=new int[3][3];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("\t"+b[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print("\t"+sum[i][j]);
			}
			System.out.println();
		}
	}
}

