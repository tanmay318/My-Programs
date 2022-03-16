import java.util.Scanner;
public class ex1 {
public static void main(String[] args) {
	int num;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Number");
	num = sc.nextInt();
	for(int i = 1;i<=num;i++) {
		System.out.println(i);
	}
}
}
