import java.util.Scanner;
public class Armstrong {
	 public static void main(String[] args)
	    {
		 int n,z,count=0,digit,i,pro,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number:");
    	n = sc.nextInt();
    	z = n;
	while(z>0)
	{
		count++;
		z = z/10;
	}
	System.out.println("No. of Digits:" +count);
	z=n;
	while(z>0)
	{
		digit = z % 10;
		pro =1;
		for (i =1;i<=count;i++) 
			pro = pro*digit;
			sum= sum+pro;
			z=z/10;
	}
		System.out.println("Addition of Given Number:"+sum);
		if (sum==n)
			System.out.println("Given Number is Armstrong");
		else
			System.out.println("Given Number is Not Armstrong");
	}
}

