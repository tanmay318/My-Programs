package Interface;

public class three
 implements One,two {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Multiple Inheritance Example using Interface");
	}
 public static void main(String[] args) {
	three obj = new three();
	obj.method();
}
}
