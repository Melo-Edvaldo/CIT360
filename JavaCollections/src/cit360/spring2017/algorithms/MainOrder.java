package cit360.spring2017.algorithms;

import java.util.Collections;
import java.util.LinkedList;

import javax.swing.JOptionPane;

//Rotate method

public class MainOrder {

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

		int value = Integer.parseInt(JOptionPane.showInputDialog("Type the detachment number from the list:"));
		Collections.rotate(list, value);
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
