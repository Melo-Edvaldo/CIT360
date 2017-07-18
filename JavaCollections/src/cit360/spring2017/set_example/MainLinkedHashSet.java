package cit360.spring2017.set_example;

import java.util.LinkedHashSet;
import java.util.Set;

// The LinkedHashSet class is an extension of the HashSet class. 
// The difference is that in this class the data is retrieved in the order they were entered.

public class MainLinkedHashSet {

	public static void main(String [] args) {
		Set<String> names = new LinkedHashSet<String>();
		names.add("Eduardo");
		names.add("Luiz");
		names.add("Bruna");
		names.add("Sonia");
		names.add("Brianda");
		names.add("Julia");
		names.add("Carlos");

		// Output is in data insertion order
		for (String name : names) {
			System.out.println(name);
		}
	}
}