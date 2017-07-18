package cit360.spring2017.map_example;

import java.util.Map;
import java.util.TreeMap;

// In TreeMap, adding and retrieving data is the same as HashMap. 
// The difference is that the data in the TreeMap is sorted by the key 
// and only the stored values can be null, but the key does not.

public class MainTreeMap {

	public static void main(String [] args) {
		Map<Integer,String> names = new TreeMap<Integer,String>();
		names.put(5, "Eduardo");
		names.put(3, "Luiz");
		names.put(2, "Bruna");
		names.put(4, "Sonia");
		names.put(1, "Brianda");
		names.put(7, "Julia");
		names.put(6, "Carlos");

		// Output is with order data (A - Z)
		for (String name : names.values()) {
			System.out.println(name);
		}
	}
}