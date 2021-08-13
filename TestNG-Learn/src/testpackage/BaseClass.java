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

public class BaseClass {

	@BeforeSuite
	public void testMethodBeforeSuite() {
		System.out.println("Running Test : BaseClass -----> testMethodBeforeSuite");
	}

	@BeforeTest
	public void testMethodBeforeTest() {
		System.out.println("Running Test : BaseClass -----> testMethodBeforeTest");
	}

	@BeforeClass
	public void testMethodBeforeClass() {
		System.out.println("Running Test : BaseClass -----> testMethodBeforeClass");
	}

	@BeforeMethod
	public void testMethodBeforeMethod() {
		System.out.println("Running Test : BaseClass -----> testMethodBeforeMethod");
	}

	@Test
	public void testMethodA() {
		System.out.println("Running Test : BaseClass -----> testMethodA");
	}

	@Test
	public void testMethodB() {
		System.out.println("Running Test : BaseClass -----> testMethodB");
	}

	@AfterMethod
	public void testMethodAfterMethod() {
		System.out.println("Running Test : BaseClass -----> testMethodAfterMethod");
	}

	@AfterClass
	public void testMethodAfterClass() {
		System.out.println("Running Test : BaseClass -----> testMethodAfterClass");
	}

	@AfterTest
	public void testMethodTest() {
		System.out.println("Running Test : BaseClass -----> testMethodAfterTest");
	}
	
	@AfterSuite
	public void testMethodSuite() {
		System.out.println("Running Test : BaseClass -----> testMethodAfterSuite");
	}
}
