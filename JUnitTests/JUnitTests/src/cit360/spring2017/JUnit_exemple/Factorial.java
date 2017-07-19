package cit360.spring2017.JUnit_exemple;

public class Factorial {
	public int factorial(int n) {
		int r = 1;
		for(int t = n; t >= 1; t --) {
			r *= t;
		}
		return r;
	}
}
