package test;

public class SimpleInterest {
	//principle = int a
	//rate = int b
	// time = int c
	//SimpleInterest= (Principle*Rate*Time)/100
	int SI (int a, int b, int c) {
		int d = (a * b * c) / 100;
		return d;
	}
public static void main(String[] args) {
	SimpleInterest obj = new SimpleInterest ();
	double e= obj.SI(56,27,5);
	System.out.println("Simple Interest is"+ " " +e);
}
}
