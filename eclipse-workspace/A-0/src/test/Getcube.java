package test;

public class Getcube {
	int cube (int a) 
	{int b = a*a*a;
	return b;
	}
	public static void main(String[] args) {
		Getcube obj = new Getcube();
         int c=obj.cube(7);
         System.out.println(c);
	}

}
