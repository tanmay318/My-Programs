package ex1;

public class A {
	public static void main(String[] args) {
		int a,b;
		try 
		{
			a=0;
			b=62/a;
			System.out.println("Try Block Msg");
		}catch(ArithmeticException e)
		{
			System.out.println("Error:Number is not divided by Zero");
		}
		System.out.println("I m out of Try-catch block");
	}
}
