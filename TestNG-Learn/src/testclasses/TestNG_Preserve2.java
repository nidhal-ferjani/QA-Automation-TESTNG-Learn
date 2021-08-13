package testclasses;

import org.testng.annotations.Test;

public class TestNG_Preserve2 {

	@Test(enabled = true)
	public void testMethod1() {
		System.out.println("TestNG_Preserve2 =======> testMethod1");
	}

	@Test(timeOut = 100)
	public void testMethod2() throws InterruptedException {
		System.out.println("TestNG_Preserve2 =======> testMethod2");

	}

}
