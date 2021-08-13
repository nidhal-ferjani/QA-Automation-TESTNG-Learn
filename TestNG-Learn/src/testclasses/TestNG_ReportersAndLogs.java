package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestNG_ReportersAndLogs {
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("TestNG_ReportersAndLogs ============> This runs once Before every Method ", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("TestNG_ReportersAndLogs ============> This runs once After Every Method ", true);
  }

  @BeforeClass
  public void setUp() {
	  Reporter.log("TestNG_ReportersAndLogs ============> This runs once Before Class ", true);
  }

  @AfterClass
  public void cleanUp() {
	  Reporter.log("TestNG_ReportersAndLogs ============> This runs once After Class ", true);
  }
  
  @Test
  public void testMethod1() {
	  Reporter.log("TestNG_ReportersAndLogs ============> testMethod1", true);
  }
  
  @Test
  public void testMethod2() {
	  Reporter.log("TestNG_ReportersAndLogs ============> testMethod2", true);
	  Assert.assertTrue(false);
  }
  
  @Test(dependsOnMethods= {"testMethod2"})
  public void testMethod3() {
	  Reporter.log("TestNG_ReportersAndLogs ============> testMethod3", true);
  }

}
