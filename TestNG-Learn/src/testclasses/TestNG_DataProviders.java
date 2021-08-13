package testclasses;

import org.testng.annotations.Test;

public class TestNG_DataProviders {

	@Test(dataProvider = "getData", dataProviderClass=TestData.class)
	public void testMethod1(String input1, String input2, String input3) {

		System.out.println("Input 1 : " + input1);
		System.out.println("Input 2 : " + input2);
		System.out.println("Input 3 : " + input3);
	}
    
//	@DataProvider(name="getData")
//	public Object[][] dataSet() {
//
//		return new Object[][] { { "nidhal", "ferjani", "Amine" }, 
//			                    { "Ali", "Slim", "Wassef" }, 
//			                    { "Ali ben ticha", "Slim ben marzouk", "Wassef aloui" }
//			                    };

//	}

}
