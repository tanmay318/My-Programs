package AbstractClass.EX2;

public class two extends one {
	int x;
	int y;
	int z;
	@Override
	void get(int a, int b) {
		// TODO Auto-generated method stub
		x=a;
		y=b;
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
	z=x+y;	
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println(z);
	}

}
