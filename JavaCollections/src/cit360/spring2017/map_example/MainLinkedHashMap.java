package cit360.spring2017.map_example;

import java.util.LinkedHashMap;
import java.util.Map;

//In LinkedHashMap, data addition and retrieval is the same as HashMap and TreeMap, 
// but the difference is that the data in TreeMap is sorted by the order of addition 
// of values on the map, and just like TreeMap, only the stored values can Be null, 
// but the key is not.

public class MainLinkedHashMap {

	public static void main(String [] args) {
		Map<Integer,String> names = new LinkedHashMap<Integer,String>();
		names.put(5, "Eduardo");
		names.put(3, "Luiz");
		names.put(2, "Bruna");
		names.put(4, "Sonia");
		names.put(1, "Brianda");
		names.put(7, "Julia");
		names.put(6, "Carlos");
		
		// Output is in data insertion order
		for (String name : names.values()) {
			System.out.println(name);
		}
	}
}
