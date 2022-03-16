package Water;
import Tap.A;
public class Aa {
	public void m2 () {
		//System.out.println("method m2");
	} 
	public static void main(String[] args) {
	Tap.A obj1 = new Tap.A();// i have used the full path
	obj1.m1();// error solve this by giving fully qualified name of package
	//Aa obj2 = new Aa ();
	//obj2.m2();
	}

}
