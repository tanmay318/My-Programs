package ex1;

public class c {
public static void main(String[] args) {
	try
	{
	int a[]=new int [7];
	a[4]=30/0;
	    System.out.println("First statement in try block");
	}
	 catch(ArithmeticException e) 
	{
		System.err.println("Warning: Arithmetic Exception");
	}
     catch(ArrayIndexOutOfBoundsException  e) 
	{
		System.out.println("Warning:Array Index Out Of Bounds");
	}
	 catch(Exception e) 
	{
		System.out.println("Warning:Other Exception");
	}
	    System.out.println("Out of try Catch Block");
}
}
