
public class B extends EX1 {
	public void methodB () {
		System.out.println("Sub class Method");
	}
public static void main(String[] args) {
	B obj = new B();
	obj.methodA();
	obj.methodB();
}
}
