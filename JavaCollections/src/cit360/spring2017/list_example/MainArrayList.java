package cit360.spring2017.list_example;

import java.util.ArrayList;
import java.util.List;

// The difference between ArrayList and LinkedList classes is the performance, 
// because the ArrayList is faster in data recovery, while the LinkedList 
// performs better at adding and deleting data.

public class MainArrayList {

	public static void main(String [] args) {
		List<String> names = new ArrayList<String>();
		names.add("Eduardo");
		names.add("Luiz");
		names.add("Bruna");
		names.add("Sonia");
		names.add("Brianda");
		names.add("Julia");
		names.add("Carlos");

		// Result is the same for both, because both classes work the same way.
		for (String name : names) {
			System.out.println(name);
		}
	}
}