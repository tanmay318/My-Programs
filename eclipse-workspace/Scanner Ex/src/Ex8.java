import java.util.Scanner;
public class Ex8 {
double a,b,c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number");
double a = sc.nextDouble();
System.out.println("Enter Second Number");
double b = sc.nextDouble();
sc.close();
double c = (a+b)/2;
System.out.println("Average:" +c);
	}

}
