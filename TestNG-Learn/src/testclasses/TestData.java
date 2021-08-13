package testclasses;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="getData")
	public Object[][] dataSet() {

		return new Object[][] { { "nidhal", "ferjani", "Amine" }, 
			                    { "Ali", "Slim", "Wassef" }, 
			                    { "Ali ben ticha", "Slim ben marzouk", "Wassef aloui" }
			                    };

}
	
}
