package SumofEvenNum;

public class SumofEven
{
	public static void main(String[] args) 
	 {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		System.out.println("Even Numbers in Array are:");
		for( int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				sum=sum+a[i];
				}
		}System.out.println("Sum of Even Numbers in Array is:"+sum);
	 }	
}
