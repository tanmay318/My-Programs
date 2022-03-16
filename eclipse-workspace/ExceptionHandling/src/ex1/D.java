package ex1;

public class D {
public static void main(String[] args) {
	try {
		try {
			System.out.println("Inside Block1");
			int b=20/0;
		}catch(ArithmeticException e1) 
		{
			System.out.println("Exception.e1");
		}
		try {
			System.out.println("Inside Block2");
			int b = 20/0;
			System.out.println(b);
		}catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Exception.e2");
		}
		System.out.println("Just other Statement");
		}
		catch(ArithmeticException e3) 
		{
			System.out.println("Arithmetic Exception.e3");
			System.out.println("Inside Parent try catch block");
		}
		catch(ArrayIndexOutOfBoundsException e4)
		{
			System.out.println("ArrayIndexOutOfBoundsException.e4");
			System.out.println("Inside Parent try catch block");
		}
		catch(Exception e)
     	{
		System.out.println("Inside Parent try catch block");	
	    } 
	     System.out.println("Net Statement");
	}
}
