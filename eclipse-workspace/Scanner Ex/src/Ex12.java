import java.util.Scanner;
public class Ex12 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Radius");
	double r = sc.nextDouble();
	//Area of circle  
	double area = 3.14 * (r * r); //(pie value is 3.14)
	System.out.println("Area of circle:" +area);
	//Circumference of circle 
	double circumference= 2 * 3.14 * r; //(pie value is 3.14
System.out.println("Circumference of a Circle is:" +circumference);
}
}
