package HashMap.TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(34, "India1");
		tm.put(78, "India2");
		tm.put(99, "India3");
		tm.put(78, "India4");
		tm.put(34, "India5");
		tm.put(34, "India6");
		tm.put(22, "India7");
		Set<Integer> keys = tm.keySet();
		for (Integer key : keys) {
			System.out.println("Keys>>" +key);
			String value = tm.get(key);
			System.out.println("Value>>"+value);
		}
		
	}

}
