package AbstractClass.EX1;

public  class A2 extends A1 {
  public void disp2() {
	  System.out.println("I m overriding abstract method");
  }
  public static void main(String[] args) {
	A2 obj = new A2();
	obj.disp();
	obj.disp2();
	
}
}
