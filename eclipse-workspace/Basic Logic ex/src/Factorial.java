import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Number");
	long num = sc.nextLong();
	int i;
	long fact = 1;
	for (i=1; i<=num;i++) {
		fact = fact*i;
	}
	System.out.println(fact);
}
}



