import java.util.Scanner;
public class Ex6 {
public static void main(String[] args) {
	int num1;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number");
	num1= sc.nextInt();
	System.out.println("Enter Message");
	String f = sc.next();
	sc.close();
	System.out.println("Output of Number:" +num1);
	System.out.println("Output of Message:" +f);
}
}