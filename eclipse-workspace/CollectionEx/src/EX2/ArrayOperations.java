package EX2;

import java.util.ArrayList;

public class ArrayOperations {
public static void main(String[] args) {
	ArrayList <String> al = new ArrayList<>();
	al.add("Java");
	al.add("Perl");
	al.add("C++");
	al.add("C#");
	System.out.println(al);
	System.out.println(al.get(1));
	System.out.println(al.contains("C++"));
	System.out.println(al.size());
	System.out.println(al.isEmpty());
}
}
