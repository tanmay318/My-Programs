import java.util.Scanner;

public class EvenandOddNumbers {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num;
		num = sc.nextInt();
		int sum = 0;
		System.out.println("Even Number upto"+" "+num+":");
		for (int i = 1;i<=num;i++)
		{
			if (i % 2 ==0)
				System.out.println(i);
		}
		System.out.println("Odd Number upto"+" "+num+":");
		for (int i = 1;i<=num;i++)
		{
			if (i % 2 !=0)
				System.out.println(i);
		}

}
}
