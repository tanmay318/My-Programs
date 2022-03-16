package ArrayList.LinkedList;

import java.util.LinkedList;

public class LinkedListEx {
public static void main(String[] args) {
	LinkedList <Integer> ll =new LinkedList <Integer>();
	ll.add(34);
	ll.add(45);
	ll.add(89);
	ll.add(89);
	ll.add(23);
	ll.add(23);
	for (Integer Ll : ll) {
		System.out.println(Ll);
	}
}
}
