package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_TestClass1 {
	
	@BeforeClass
	public void setUp() {
		 System.out.println("TetsNG_TestClass1 :: setUp -----> This runs once Before Class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nTetsNG_TestClass1 :: cleanUp -----> This runs once After Class");
	}
	
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("\nRunning test TetsNG_TestClass1 -----> beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Running test TetsNG_TestClass1 -----> afterMethod");
  }

  
  @Test
  public void testMethod1() {
	  System.out.println("Running test TetsNG_TestClass1 -----> testMethod1");
	  //fail();
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Running test TetsNG_TestClass1 -----> testMethod2");
  }
  
}
