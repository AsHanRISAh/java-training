import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 */

/**
 * @author asHan
 *
 */
public class HashMapDemo {

	public static void main(String args[]) {

		
		 HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		//ConcurrentHashMap<Integer, String> hmap = new ConcurrentHashMap<>();
		hmap.put(2, "mettur");
		hmap.put(3, "salem");
		hmap.put(4, "tn");

		
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			hmap.put(1, "asHan");
			Map.Entry mapentry = (Map.Entry) iterator.next();
			
			System.out.print("key is: " + mapentry.getKey() + " & Value is: ");
			System.out.println(mapentry.getValue());
		}

	}
}
