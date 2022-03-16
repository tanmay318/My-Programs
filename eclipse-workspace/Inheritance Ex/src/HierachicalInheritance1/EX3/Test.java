package HierachicalInheritance1.EX3;

public class Test {
public void m2 () {
	System.out.println("Method of B");
}
public static void main(String[] args) {
	B obj1 = new B();
	C obj2 = new C();
	D obj3 = new D ();
	obj1.m1();
	obj2.m1();
	obj3.m1();
	
}
}