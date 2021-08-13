package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Prioritiy {

	@BeforeClass
	public void setUp() {
		System.out.println("TestNG_Prioritiy =======> setUp");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("TestNG_Prioritiy =======> cleanUp");
	}

	@Test
	public void testLMethod1() {
		System.out.println("TestNG_Prioritiy =======> testMethod1");
	}

	@Test(priority=0)
	public void testLMethod2() {
		System.out.println("TestNG_Prioritiy =======> testMethod2");
	}

	@Test(priority=-1)
	public void testLMethod3() {
		System.out.println("TestNG_Prioritiy =======> testMethod3");
	}
}
