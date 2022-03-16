package ProtectedEx.jbk1;

public class Shape {
protected int sides;
	public Shape () {
	sides = 3;
}
	public int getsides() {
		return sides;
	}
	public void printsides() {
		System.out.println("This obj has" +" "+ sides +" " +"sides");
	}
}
