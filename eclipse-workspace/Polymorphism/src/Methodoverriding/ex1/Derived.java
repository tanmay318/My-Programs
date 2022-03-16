package Methodoverriding.ex1;

public class Derived extends Base
{
	public void method () {
		System.out.println("Method of derived class");
	}
	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.method();
		Base obj1= new Base();
		obj1.method();
		Base obj2 = new Derived();
		obj2.method();
	}
}
