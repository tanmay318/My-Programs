package HashSet.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(34);
		lhs.add(45);
		lhs.add(89);
		lhs.add(89);
		lhs.add(23);
		lhs.add(23);
		for (Integer LHS : lhs) {
			System.out.println(LHS);
		}
	}

}
