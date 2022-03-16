package test;

public class Program1 {

int Add(int a, int b) {
	int c= a+b;
	return c;
}
int sub(int a, int b) {
	int c= a-b;
	return c;
	}
int mul(int a, int b) {
	int c= a*b;
	return c;
	}
int divide(int a, int b) {
	int c= a/b;
	return c;
	}
String Call(String a, String b) {
	
	return (a+b);
	}

public static void main(String[] args) {
 Program1 pp = new Program1();
 int y = pp.Add(10, 20);
 int z = pp.sub(20, 15);
 int x = pp.mul(20, 15);
 int h = pp.divide(20, 2);
 String f = pp.Call("Hello","Guys");
 System.out.println(y+ "  " +z+"  "+x+ " " +h );
 System.out.println(y);
 System.out.println(z);
 System.out.println(x);
 System.out.println(h);
 System.out.println(f);
}
}