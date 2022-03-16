package test;

public class Program9 {
	int m1 (int a, int b) {
		return a+b;
	}
	double m2 (double a,double b) {
		return a*b;
	}
public static void main(String[] args) {
	Program9 obj = new Program9();
	int d = obj.m1(10, 20);
  double e = obj.m2(3.14, 22.7);	  
	System.out.println(d);
	System.out.println(e);	
}
}
