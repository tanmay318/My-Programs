
public class joinex2 {
	public static void main(String[] args) {
		Ex2 obj = new Ex2 ();
		double result;
		int add;
		obj.demo(10);
		obj.demo(20,30);
		result = obj.demo(5.5);
		System.out.println("O/P:" +result);
		add =obj.demo(50,40,60);
		System.out.println("O/P:"+add);
	}

}
