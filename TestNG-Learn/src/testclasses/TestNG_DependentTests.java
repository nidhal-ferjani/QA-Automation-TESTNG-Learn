package testclasses;

import static org.testng.Assert.fail;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_DependentTests {

	@BeforeClass
	public void setUp() {
		System.out.println("TestNG_DependentTests =======> setUp");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("TestNG_DependentTests =======> cleanUp");
	}

	@Test(dependsOnMethods= {"testMethod2"})
	public void testMethod1() {
		System.out.println("TestNG_DependentTests =======> testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("TestNG_DependentTests =======> testMethod2");
		fail();
	}

	@Test(dependsOnMethods="testMethod1")
	public void testMethod3() {
		System.out.println("TestNG_DependentTests =======> testMethod3");
	}
	
	@Test(dependsOnMethods="testMethod3", alwaysRun=true)
	public void testMethod4() {
		System.out.println("TestNG_DependentTests =======> testMethod4");
	}
}
