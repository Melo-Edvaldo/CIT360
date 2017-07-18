package cit360.spring2017.set_example;

import java.util.Set;
import java.util.TreeSet;

// In TreeSet class, data is stored in a tree and retrieved in order. 
// This is the great advantage for this class.

public class MainTreeSet {

	public static void main(String [] args) {
		Set<String> names = new TreeSet<String>();
		names.add("Eduardo");
		names.add("Luiz");
		names.add("Bruna");
		names.add("Sonia");
		names.add("Brianda");
		names.add("Julia");
		names.add("Carlos");

		// Output is with order data (A - Z)
		for (String name : names) {
			System.out.println(name);
		}
	}
}