package HashMap.Hashtable;
import java.util.Hashtable;
import java.util.Set;

public class HashTableEx {
public static void main(String[] args) {
	Hashtable<Integer , String> hm = new Hashtable<Integer , String>();
			hm.put(34, "India1");
			hm.put(78, "India2");
			hm.put(99, "India3");
			hm.put(78, "India4");
			hm.put(34, "India5");
			hm.put(34, "India6");
			hm.put(22, "India7");
			Set<Integer> keys = hm.keySet();
			for (Integer key : keys) {
				System.out.println("Keys >>"+ key);
				String value = hm.get(key);
				System.out.println("Values >>"+ value);
			}
			
}
}
