package EX3;

import java.util.ArrayList;
import java.util.List;

public class AddArrayElements {
public static void main(String[] args) {
	ArrayList<String>al = new ArrayList<>();
	al.add("hii");
	al.add("Hello");
	al.add("Java");
	System.out.println("Actual Array List"+al);
	List<String> list = new ArrayList<>();
	list.add("bye");
	list.add("tea");
	al.addAll(list);
	System.out.println("After Copy"+al);
}
}
