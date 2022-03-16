package EX4;

import java.util.ArrayList;

public class ArrayClear {
public static void main(String[] args) {
	ArrayList<String>al = new ArrayList<>();
	al.add("hii");
	al.add("Hello");
	al.add("Java");
	System.out.println("Actual Array List"+al);
	al.clear();
	System.out.println(al);
}
}
