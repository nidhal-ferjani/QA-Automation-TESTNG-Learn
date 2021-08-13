package testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_Asserts {
	
	/*
	 * Default run method is order Alphabetique
	 */
	
	/******************************************************************
	 * Le mod�le AAA (Arrange, Act, Assert) est un moyen courant 
	 * d'�crire des tests unitaires pour une m�thode en cours de test.
	 ******************************************************************/

	@Test
	public void testSum() {
		/*
		 * La section Arrange d'une m�thode de test unitaire initialise 
		 * les objets et d�finit la valeur des donn�es qui sont transmises
		 * � la m�thode test�e.
		 */
		SomeClassToTest someClassToTest = new SomeClassToTest();
		System.out.println("\nRunning TestNG_Asserts ----> TestSum");
		
		/*
		 * La section Act appelle la m�thode test�e avec les param�tres arrang�s.
		 */
		int res = someClassToTest.sumNumbers(5, 6);
		
		
		/*
		 * La section Assert v�rifie que l'action de la m�thode test�e se comporte 
		 * comme pr�vu.
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
