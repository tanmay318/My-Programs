import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	int num1=0,num2=1,num3;
	System.out.println("Default Number in Fibo Series:"+num1+" "+num2);
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Number");
	int num= sc.nextInt();
	System.out.println("Fibonacci Series of:"+num);
	for (int i =2; i<num;i++)
	{
		num3=num1+num2;
		System.out.println(" "+num3);
		num1 = num2;
		num2= num3;
	}
}
}
