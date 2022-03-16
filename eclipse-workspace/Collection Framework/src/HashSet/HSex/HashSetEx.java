package HashSet.HSex;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> hs = new HashSet<Integer>();
		hs.add(34);
		hs.add(45);
		hs.add(89);
		hs.add(89);
		hs.add(23);
		hs.add(23);
		for (Integer Hs : hs) {
			System.out.println(Hs);
		}
	}

}
