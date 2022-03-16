package ReverseArray;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the elements:");
		int a[]= new int [5];
		System.out.println("Original Array:");
		for (int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Array in Reverse Order");
		for(int i=a.length-1;i>=0;i--) 
		{
			System.out.print(a[i]+" ");
		}sc.close();
	}
}
