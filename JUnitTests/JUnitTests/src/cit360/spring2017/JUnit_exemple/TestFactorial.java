package cit360.spring2017.JUnit_exemple;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {

	@Test
	public void testFactorial() {
		Factorial c = new Factorial();
		assertEquals("Case 1",1,c.factorial(0));
		assertEquals("Case 2",1,c.factorial(1));
		assertEquals("Case 3",2,c.factorial(2));
		assertEquals("Case 4",6,c.factorial(3));
	}

}
