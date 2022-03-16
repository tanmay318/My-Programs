import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Length:");
		int l = sc.nextInt();
		System.out.println("Enter Breadth");
		int b = sc.nextInt();
		sc.close();
		int area= l*b;
		System.out.println("Area of Square is:" +area);
		
	}

}
