import java.util.Scanner;
public class Ex11 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Length:");
	int l = sc.nextInt();
	System.out.println("Enter Width");
	int w = sc.nextInt();
	sc.close();
	int area= l*w;
	System.out.println("Area of Rectangle is:" +area);
	int perimeter = (l * w)*2;
	System.out.println("Perimeter of Rectangle is:" +perimeter);
}
}
