package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_EnableTimeOut {

	@BeforeClass
	public void setUp() {
		System.out.println("TestNG_DependentTests =======> setUp");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("TestNG_DependentTests =======> cleanUp");
	}

	@Test(enabled=true)
	public void testMethod1() {
		System.out.println("TestNG_DependentTests =======> testMethod1");
	}

	@Test(timeOut=100)
	public void testMethod2() throws InterruptedException {
		System.out.println("TestNG_DependentTests =======> testMethod2");
		
		Thread.sleep(500);
	}

}
