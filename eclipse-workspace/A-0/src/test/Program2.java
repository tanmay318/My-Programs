package test;

public class Program2 {
 String Calling( String a,String b) {
	 return (a+b);	
}
 String x (String a, int b) {
	 return a+b; 
 }
 public static void main(String[] args) {
	 Program2 Test = new Program2();
	 String f = Test.Calling("Hello","Guys");
	 String t = Test.Calling("My name is", "Tanmay");
	 String h = Test.Calling("i m from pune", "city");
	 String e = Test.x("Received money", 1000);
	 System.out.println(f);
     System.out.println(t);
     System.out.println(h);
     System.out.println(e);
     System.out.println(f+ "  " +t+"  "+h);
}
}
