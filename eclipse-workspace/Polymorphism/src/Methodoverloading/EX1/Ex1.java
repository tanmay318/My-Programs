
public class Ex1 {
 void sum (int d, int e) 
 {
	 System.out.println("Sum is:" +(d + e));
 }
 void sum (double a, double b)
 {
	System.out.println("Sum is:"+ (a+b)); 
 }
 public static void main(String[] args) {
	Ex1 obj = new Ex1();
	obj.sum(10,20);
		obj.sum(23.2,43.2);
}
}
