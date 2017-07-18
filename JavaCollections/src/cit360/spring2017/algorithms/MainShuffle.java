package cit360.spring2017.algorithms;

import java.util.Collections;
import java.util.LinkedList;

// Shuffle method

public class MainShuffle {

	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(new Integer(5));
		list.add(new Integer(3));
		list.add(new Integer(10));
		list.add(new Integer(-5));
		list.add(new Integer(6));              
		list.add(new Integer(8));
		list.add(new Integer(-2));
		list.add(new Integer(4)); 
		list.add(new Integer(12));

		Collections.shuffle(list);

		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
