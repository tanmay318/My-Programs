package MultilevellnheritanceEX2;

public class Maruti800 extends Maruti {
public Maruti800 () {
	System.out.println("Constructor of Class Maruti800");
} 
public void Speed () {
	System.out.println("Max speed:80Kmph");
}
public static void main(String[] args) {
	Maruti800 obj = new Maruti800 ();
	obj.VehicleType();
	obj.brand();
	obj.Speed();
}
}
