package testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_Asserts {
	
	/*
	 * Default run method is order Alphabetique
	 */
	
	/******************************************************************
	 * Le modèle AAA (Arrange, Act, Assert) est un moyen courant 
	 * d'écrire des tests unitaires pour une méthode en cours de test.
	 ******************************************************************/

	@Test
	public void testSum() {
		/*
		 * La section Arrange d'une méthode de test unitaire initialise 
		 * les objets et définit la valeur des données qui sont transmises
		 * à la méthode testée.
		 */
		SomeClassToTest someClassToTest = new SomeClassToTest();
		System.out.println("\nRunning TestNG_Asserts ----> TestSum");
		
		/*
		 * La section Act appelle la méthode testée avec les paramètres arrangés.
		 */
		int res = someClassToTest.sumNumbers(5, 6);
		
		
		/*
		 * La section Assert vérifie que l'action de la méthode testée se comporte 
		 * comme prévu.
		 */
		Assert.assertEquals(res, 11);
	}
	
	@Test
	public void testStrings() {
		System.out.println("\nRunning TestNG_Asserts ----> TestStrings");
	    String expectedString = new String("Hello World");
		SomeClassToTest someClassToTest = new SomeClassToTest();
		
		String actualString = someClassToTest.addStrings("Hello", "World");
		
		//Assert.assertEquals(actualString, expectedString);
		Assert.assertTrue(actualString.equals(expectedString));
		
		
	}
	
	@Test
	public void testArrays() {
		System.out.println("\nRunning  TestNG_Asserts ----> TestArrays");
		int[] expectedArray = {1, 2, 3};
		SomeClassToTest someClassToTest = new SomeClassToTest();
		
		int[] actualArray = someClassToTest.getArrays();
		
		Assert.assertEquals(actualArray, expectedArray);
		
		System.out.println("End Test TestNG_Asserts ----> TestArrays");
	}
}
