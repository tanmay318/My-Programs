package HashMap.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapEx {
 public static void main(String[] args) {
	LinkedHashMap <Integer,String> lhm = new LinkedHashMap <Integer,String>();
	lhm.put(34, "India1");
	lhm.put(78, "India2");
	lhm.put(99, "India3");
	lhm.put(78, "India4");
	lhm.put(34, "India5");
	lhm.put(34, "India6");
	lhm.put(22, "India7");
	Set<Integer> keys = lhm.keySet();
	for (Integer key : keys) {
		System.out.println("keys>>"+key);
		String value = lhm.get(key);
		System.out.println("Value>>"+value);
	}
}
}
