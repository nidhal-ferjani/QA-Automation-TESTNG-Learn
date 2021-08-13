package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest extends BaseClass{

	@BeforeSuite
	public void testMethodBeforeSuite() {
		System.out.println("Running Test : FirstTest -----> testMethodBeforeSuite");
	}

	@BeforeTest
	public void testMethodBeforeTest() {
		System.out.println("Running Test : FirstTest -----> testMethodBeforeTest");
	}

	@BeforeClass
	public void testMethodBeforeClass() {
		System.out.println("Running Test : FirstTest -----> testMethodBeforeClass");
	}

	@BeforeMethod
	public void testMethodBeforeMethod() {
		System.out.println("Running Test : FirstTest -----> testMethodBeforeMethod");
	}

	@Test(priority = -1)
	public void testMethodA() {
		System.out.println("Running Test : FirstTest -----> testMethodA");
	}

	@Test
	public void testMethodB() {
		System.out.println("Running Test : FirstTest -----> testMethodB");
	}
	
	@Test(priority = 5)
	public void testMethodC() {
		System.out.println("Running Test : FirstTest -----> testMethodA");
	}

	@Test
	public void testMethodAA() {
		System.out.println("Running Test : FirstTest -----> testMethodB");
	}

	@AfterMethod
	public void testMethodAfterMethod() {
		System.out.println("Running Test : FirstTest -----> testMethodAfterMethod");
	}

	@AfterClass
	public void testMethodAfterClass() {
		System.out.println("Running Test : FirstTest -----> testMethodAfterClass");
	}

	@AfterTest
	public void testMethodTest() {
		System.out.println("Running Test : FirstTest -----> testMethodAfterTest");
	}
	
	@AfterSuite
	public void testMethodSuite() {
		System.out.println("Running Test : FirstTest -----> testMethodAfterSuite");
	}
}
