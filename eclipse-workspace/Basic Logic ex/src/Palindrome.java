import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	int n,rev=0;
	int z;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number");
	n= sc.nextInt();
	z = n;
	while (n>0) 
	{
		rev =(rev*10)+ n % 10;
		n= n / 10;
	}
	if (rev == z)
	System.out.println("Given Number is Palindrome ");
	else
		System.out.println("Given Number is not Palindrome");
	}
}
