package cit360.spring2017.JUnit_exemple;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestFactorial.class, TestFibonacci.class })
public class AllTests {

}
