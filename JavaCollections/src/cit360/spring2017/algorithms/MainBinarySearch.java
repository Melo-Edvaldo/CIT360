package cit360.spring2017.algorithms;

import java.util.Collections;
import java.util.LinkedList;
 
import javax.swing.JOptionPane;
 
// Binary search method

public class MainBinarySearch {
 
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
 
             System.out.println("list in ascending order:");
             Collections.sort(list);
             
             int value = Integer.parseInt(JOptionPane.showInputDialog("Enter the searched value:"));
             
             int index = Collections.binarySearch(list, value);
             System.out.println("The item that you are looking for is in the position:: " + index);
       
       }
} 
