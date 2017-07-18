package cit360.spring2017.map_example;

import java.util.HashMap;
import java.util.Map;

// In HashMap, to add values to a Map, the put method is used, 
// passed as a key parameter and a value. 
// HashMap does not have a specific sort order and allows null values for both 
// the key and the stored values.

public class MainHashMap {

	public static void main(String [] args) {
		Map<Integer,String> names = new HashMap<Integer,String>();
		names.put(5, "Eduardo");
		names.put(3, "Luiz");
		names.put(2, "Bruna");
		names.put(4, "Sonia");
		names.put(1, "Brianda");
		names.put(7, "Julia");
		names.put(6, "Carlos");

		// Output order is random
		for (String name : names.values()) {
			System.out.println(name);
		}
	}
}
