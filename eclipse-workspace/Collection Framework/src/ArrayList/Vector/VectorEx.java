package ArrayList.Vector;

import java.util.Vector;

public class VectorEx {
public static void main(String[] args) {
	Vector<Integer> v =new Vector <Integer>();
	      v.add(34);
	      v.add(45);
	      v.add(89);
	      v.add(89);
	      v.add(23);
	      v.add(23);
	      for (Integer ve : v) {
			System.out.println(ve);
		}
}
}
