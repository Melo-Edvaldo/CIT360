package cit360.spring2017.set_example;

import java.util.HashSet;
import java.util.Set;

// In HashSet class, set data will be stored in a hash table. 
// In this type of collection, the order in which the data will be returned is not guaranteed.

public class MainHashSet {

	public static void main(String [] args) {
		Set<String> names = new HashSet<String>();
		names.add("Eduardo");
		names.add("Luiz");
		names.add("Bruna");
		names.add("Sonia");
		names.add("Brianda");
		names.add("Julia");
		names.add("Carlos");

		// Output order is random
		for (String name : names) {
			System.out.println(name);
		}
	}
}