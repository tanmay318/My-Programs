package SumofNumberArray;
import java.util.Scanner;
public class Sum
{
public static void main(String[] args)	
{
	Scanner sc=new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("Enter Elements of Array");
		for (int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("Elements in Array are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
						sc.close();
			System.out.println("Sum of Elements in Array is:"+sum);
}

}
