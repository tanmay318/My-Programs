import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int num=sc.nextInt();
	System.out.println("Prime Numbers upto"+" "+num+" "+"are" );
	int count;
	for (int i = 1; i<=num; i++)
	{ count =0;
	for (int j=1; j<=i; j++)
	{
		if (i % j == 0)
			count++;
	}
	if (count == 2)
		System.out.println(i+ "-");
	}
}
}
