package testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_TestParameters {
  
  @BeforeClass
  @Parameters({"browser", "platform"})
  public void setUp(@Optional String Browser, @Optional String Paltform) {
	  System.out.println("TestNG_TestParameters ==========> setUp");
	  System.out.println("1. Parameter value form XML File : " + Browser);
	  System.out.println("2. Parameter value from XML File : " + Paltform);
  }

  @Test(enabled=true)
  @Parameters({"response"})
  public void testMethod1(@Optional("nidhal") String Response) {
	  String[] responses = Response.split(",");
	  System.out.println("\nTestNG_TestParameters ==========> testMethod1");
	  for (String response : responses) {
		  System.out.println("Response from XML File : " + response);
	}
	 
  }
}
