package HashSet.Treeset;

import java.util.TreeSet;

public class TreesSetEx {
public static void main(String[] args) {
	TreeSet<Integer> ts = new TreeSet <Integer>();
	ts.add(34);
	ts.add(45);
	ts.add(89);
	ts.add(89);
	ts.add(23);
	ts.add(23);
	for (Integer Ts : ts) {
		System.out.println(Ts);
	}
}
}
