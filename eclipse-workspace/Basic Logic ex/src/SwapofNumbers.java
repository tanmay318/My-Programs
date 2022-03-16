import java.util.Scanner;
public class SwapofNumbers {
	
public static void main(String[] args) {
	int a,b;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter First Number");
	a=sc.nextInt();
	System.out.println("Enter Second Number");
	b=sc.nextInt();
	System.out.println("Number Before Swaping:" +a+" "+b);
	a= a+b;
	b= a-b;
	a= a-b;
	System.out.println("Number After Swaping:" +a+" "+b);
}
}
