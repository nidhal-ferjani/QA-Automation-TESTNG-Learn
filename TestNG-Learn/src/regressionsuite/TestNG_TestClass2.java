package regressionsuite;

import org.testng.annotations.Test;

import base.BaseTestSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_TestClass2 extends BaseTestSuite{
	
	@BeforeClass
	public void setUp() {
		 System.out.println("TestNg_TestClass2 :: setUp -----> This runs once Before Class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("TestNg_TestClass2 :: cleanUp -----> This runs once After Class");
	}
	
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Running test TestNg_TestClass2 -----> beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Running test TestNg_TestClass2 -----> afterMethod");
  }

  
  @Test
  public void testMethod1() {
	  System.out.println("Running test TestNg_TestClass2 -----> testMethod1");
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Running test TestNg_TestClass2 -----> testMethod2");
  }
  
}
