package testpackage;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;

public class TestNG_SoftAsserts {
	
	/*
	 * SoftAssert : SoftAssert dans TestNG permet 
	 * de collecter toutes les assertions tout au
	 * long de la methode @Test. Et pour voir le 
	 * r�sultat des assertions � la fin du test, 
	 * il faut invoquer assertAll().
	 *  
	 * SoftAssert ne l�ve pas d'exception lorsqu'une
	 * assertion �choue, mais il enregistre l'�chec.
	 * L'ex�cution du test se poursuivra avec l'�tape 
	 * suivante apr�s l'instruction assert. L'appel 
	 * assertAll() entra�nera la lev�e d'une exception 
	 * si au moins une assertion a �chou�.
	 */

	@Test
	public void testSum() {

		System.out.println("\nRunning test testNG_SoftAsserts ----> testSum");
        
		SoftAssert softAssert = new SoftAssert();
		SomeClassToTest someClassToTest = new SomeClassToTest();
		int actualResult = someClassToTest.sumNumbers(12, 5);
		softAssert.assertEquals(actualResult, 10);
		System.out.println("\nLine after assert 1");
		softAssert.assertEquals(actualResult, 8);
		System.out.println("\nLine after assert2");
		
		softAssert.assertAll();
	}
}
