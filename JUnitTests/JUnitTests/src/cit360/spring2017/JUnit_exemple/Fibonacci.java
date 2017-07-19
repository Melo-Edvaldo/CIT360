package cit360.spring2017.JUnit_exemple;

public class Fibonacci {
	public int fibonacci(int n) {
		if(n <= 0) {
			return -1;
		}
		
		int current = 0, previous = 1, beforePrevious = 0;
		for(int i = 1; i <= n; i ++) {
			beforePrevious = previous;
			previous = current;
			current = previous + beforePrevious;
		}
		return current;
	}
}
