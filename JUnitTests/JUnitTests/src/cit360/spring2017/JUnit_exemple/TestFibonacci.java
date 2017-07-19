package cit360.spring2017.JUnit_exemple;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFibonacci {

	@Test
	public void testFibonacci() {
		Fibonacci c = new Fibonacci();
		assertEquals("Case 1",1,c.fibonacci(1));
		assertEquals("Case 2",1,c.fibonacci(2));
		assertEquals("Case 3",2,c.fibonacci(3));
		assertEquals("Case 4",3,c.fibonacci(4));
		assertEquals("Case 5",5,c.fibonacci(5));
		assertEquals("Case 6",8,c.fibonacci(6));
		assertEquals("Case 7",13,c.fibonacci(7));
		assertEquals("Case 8",-1,c.fibonacci(-1));
		
		assertTrue(c.fibonacci(2) == 1);
		
		assertFalse(c.fibonacci(2) == 2);
	}
}
