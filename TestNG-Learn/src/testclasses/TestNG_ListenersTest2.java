package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@Listeners(CustomListener2.class)
public class TestNG_ListenersTest2 {

	@BeforeClass
	public void setUp() {
		System.out.println("Code in Before Class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("Code in After Class");
	}

	@Test
	public void testMethod1() {
		System.out.println("Code in test Method1");
		Assert.assertTrue(true);
	}

	@Test
	public void testMethod2() {
		System.out.println("Code in test Method2");
		Assert.assertTrue(false);
	}
	
}
