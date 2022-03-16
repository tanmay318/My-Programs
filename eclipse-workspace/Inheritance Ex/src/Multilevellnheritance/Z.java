package Multilevellnheritance;

public class Z extends Y {
	public void MethodZ () {
		System.out.println("Class Z Method");
	}
public static void main(String[] args) {
	Z obj = new Z();
	obj.MehtodX();
	obj.MethodY();
	obj.MethodZ();
}
}
