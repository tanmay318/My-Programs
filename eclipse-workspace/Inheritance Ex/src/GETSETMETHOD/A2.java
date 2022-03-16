package GETSETMETHOD;
public class A2 {
public static void main(String[] args) {
	A1 obj = new A1();
	obj.color = "red";
	obj.setSpeed(200);
	obj.setSize(22);
	obj.cc = 1000;
	obj.gears = 5;
	System.out.println("Color of Car:" +obj.color);
	System.out.println("Speed of Car:" +obj.getSpeed());
	System.out.println("Size of Car:" +obj.getSize());
	System.out.println("CC of Car:" +obj.cc);
	System.out.println("Gears of Car:" +obj.gears );
}
}
