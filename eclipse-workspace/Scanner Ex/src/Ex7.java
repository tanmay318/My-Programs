import java.util.Scanner;
public class Ex7 {
public static void main(String[] args) {
	 int a;
	 int b;
	System.out.println("WELCOME");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number:");
	a = sc.nextInt();
	System.out.println("Enter Second Number:");
	b = sc.nextInt();
	sc.close();
	int sum = a+b;
	System.out.println("Sum of Two Numbers:" +sum);
	int sub = a-b;
	System.out.println("Sub of Two Numbers:" +sub);
	int mul = a*b;
	System.out.println("Product of Two Numbers:" +mul);
	double div = a/b;
	System.out.println("Division of Two Numbers:" +div);
}
}
