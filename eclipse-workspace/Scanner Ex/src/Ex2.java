import java.util.Scanner;
public class Ex2 {
public static void main(String[] args) {
	int num1,num2,sub;
	Scanner a =new Scanner(System.in);
	System.out.println("Enter First Number:");
	num1 = a.nextInt();
	System.out.println("Enter Second Number:");
	num2= a.nextInt();
	a.close();
	sub= num1 - num2;
	System.out.println("Substraction of two Number:" +sub);
}
}