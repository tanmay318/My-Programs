package ProtectedEx.jbk2;
import ProtectedEx.jbk1.Shape;
public class Square extends Shape {
public Square(int nsides) {
	sides = nsides; //possible
	//dont need to call super class
	//using Constructor due to protected type of variable
}
void display () {
	Shape obj =new Shape();
	System.out.println(obj.sides);
//Showing error because we are not calling wid the obj of subclass
}
}
