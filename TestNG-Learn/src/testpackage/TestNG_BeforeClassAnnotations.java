package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_BeforeClassAnnotations {
	
	@BeforeClass
	public void setUp() {
		 System.out.println("TestNG_BeforeClassAnnotations :: setUp -----> This runs once Before Class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nTestNG_BeforeClassAnnotations :: cleanUp -----> This runs once After Class");
	}
	
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("\nRunning test TestNG_BeforeClassAnnotations -----> beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Running test TestNG_BeforeClassAnnotations -----> afterMethod");
  }

  
  @Test
  public void testMethod1() {
	  System.out.println("Running test TestNG_BeforeClassAnnotations -----> testMethod1");
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Running test TestNG_BeforeClassAnnotations -----> testMethod2");
  }
  
}
