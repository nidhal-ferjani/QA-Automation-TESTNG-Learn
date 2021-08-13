package testpackage;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;

public class TestNG_SoftAsserts {
	
	/*
	 * SoftAssert : SoftAssert dans TestNG permet 
	 * de collecter toutes les assertions tout au
	 * long de la methode @Test. Et pour voir le 
	 * résultat des assertions à la fin du test, 
	 * il faut invoquer assertAll().
	 *  
	 * SoftAssert ne lève pas d'exception lorsqu'une
	 * assertion échoue, mais il enregistre l'échec.
	 * L'exécution du test se poursuivra avec l'étape 
	 * suivante après l'instruction assert. L'appel 
	 * assertAll() entraînera la levée d'une exception 
	 * si au moins une assertion a échoué.
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
