package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTestSuite;

public class TestNG_Grouping extends BaseTestSuite{

	@BeforeClass(alwaysRun=true)
	public void setUp() {
		System.out.println("TestNG_Grouping =======> setUp");
	}

	@AfterClass(alwaysRun=true)
	public void cleanUp() {
		System.out.println("TestNG_Grouping =======> cleanUp");
	}

	@Test(groups= {"cars", "suv"})
	public void testBMWX6() {
		System.out.println("TestNG_Grouping =======> testBMWX6");
	}

	@Test(groups= {"cars", "sedan"})
	public void testAudiA6() {
		System.out.println("TestNG_Grouping =======> testAudiA6");
	}

	@Test(groups= {"bikes"})
	public void testLNinja() {
		System.out.println("TestNG_Grouping =======> testNinja");
	}
	
	@Test(groups= {"bikes"})
	public void testHondaCBR() {
		System.out.println("TestNG_Grouping =======> testHondaCBR");
	}
}
