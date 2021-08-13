package base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseTestSuite {

  @BeforeClass
  public void beforeClass() {
	  System.out.println("\nBaseTestSuite ======> beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("\nBaseTestSuite ======> afterClass");
  }

  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("\nBaseTestSuite ======> beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("\nBaseTestSuite ======> afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("\nBaseTestSuite ======> beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("\nBaseTestSuite ======> afterSuite");
  }
  
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("\nBaseTestSuite -----> beforeMethod");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("\nBaseTestSuite -----> afterMethod");
//  }

  
  @Test
  public void testMethodBase() {
	  System.out.println("BaseTestSuite ============> testMethodBase");
  }

}
