package test;
import java.util.Scanner;
public class CompoundInterest {
	public static void main(String[] args) {
	double P,R,T,n,CI;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Principle");
	P = sc.nextDouble();
	System.out.println("Enter Rate of Interest");
	R = sc.nextDouble();
	System.out.println("Enter Time Period");
	T = sc.nextDouble();
	System.out.println("Enter N");
	n = sc.nextDouble();
	double Amount= P*(Math.pow(1+(R/n),n*T));
    CI = Amount - P;
	sc.close();
System.out.println("Compound Interest After"+" "+T+" "+"years"+" "+CI);
System.out.println("Amount Afters"+" "+T+" "+"years"+" "+Amount );		 
	}
}