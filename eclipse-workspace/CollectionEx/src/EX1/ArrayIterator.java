package EX1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {
public static void main(String[] args) {
	ArrayList <Integer> al = new ArrayList<>();
	al.add(23);
	al.add(12);
	al.add(234);
	al.add(45);
	Iterator<Integer> itr = al.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
}
}
