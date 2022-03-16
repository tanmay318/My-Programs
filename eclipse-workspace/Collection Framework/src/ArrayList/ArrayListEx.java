package ArrayList;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> al = new ArrayList <Integer>();
			al.add(34);
			al.add(45);
			al.add(89);
			al.add(89);
			al.add(23);
			al.add(23);
			for (Integer a : al) {
				System.out.println(a);
			}
	}

}
