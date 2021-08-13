package testclasses;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_SeleniumParametersParallelExample {
	private WebDriver webDriver;
	private String baseURL;

	@BeforeClass
	@Parameters({ "browser" })
	public void setUp(@Optional("None") String browser) {

		baseURL = "https://letskodeit.teachable.com";
        System.out.println("Browser : " + browser);
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\NodeJS (WorkSpace)\\Home-Test-Automation"
					+ "\\Test-Automation-Framework-Egypte\\Drivers\\geckodriver.exe");

			webDriver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\NodeJS (WorkSpace)\\Home-Test-Automation"
					+ "\\Test-Automation-Framework-Egypte\\Drivers\\chromedriver.exe");

			webDriver = new ChromeDriver();
		} else {
               System.out.println("Nothing browser");
               System.exit(0);
		}
		
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriver.get(baseURL);

	}

	@Test
	public void testLogin() throws InterruptedException {
     
		webDriver.findElement(By.cssSelector("a[href='/sign_in']")).click();
		Thread.sleep(100);
		webDriver.findElement(By.id("user_email")).sendKeys("test@email.com");
		webDriver.findElement(By.id("user_password")).sendKeys("abcabc");
		webDriver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
	}

	@AfterClass
	public void cleanUp() {
		webDriver.quit();
	}
}
