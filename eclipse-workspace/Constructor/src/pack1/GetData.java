package pack1;

public class GetData {
	public static void main(String[] args) {
 Data obj = new Data();
 System.out.println(obj.getName());
 System.out.println(obj.getPhnumber());
 System.out.println(obj.getAge());
 Data obj2 = new Data("micky",3743231,19);
 System.out.println(obj2.getName());
 System.out.println(obj2.getPhnumber());
	System.out.println(obj2.getAge());

	}
}
