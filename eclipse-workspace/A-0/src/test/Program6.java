package test;

public class Program6 {
	boolean a= true;
	
	void display () {
		if (a==true) {
			a = false;		
			//System.out.println("the value of a :" +a);
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Program6 obj = new Program6();
        obj.display();
       System.out.println(obj.a);
	}

}
