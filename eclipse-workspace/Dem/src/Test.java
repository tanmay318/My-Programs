
public class Test {
	int add (int a, int b)
	{
		int c= a+b;
		return c;
				};
		int sub (int a, int b)
		{
		int c = a-b;
		return c;
				};			
	public static void main(String[] args) {
		System.out.println("hello class");
		Test aa = new Test();
		 int t = aa.add(10, 20);
		 int s = aa.sub(50,40 );
		 System.out.println(t);
		 System.out.println(s);
	}
}
