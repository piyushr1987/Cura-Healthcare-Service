package seleniumScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutoSuggestion {

	public WebDriver driver;
	public String url = "https://www.google.com/";

	@BeforeMethod
	@Parameters("browser")
	public void browserIntialisation(String browserName) {
		if (browserName.equals("chrome")) {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}

		else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		} else {
			System.out.println("Please provide the correct browser name");
		}
	}

	@Test
	public void testAutoSuggestion() throws InterruptedException {

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium");
		Thread.sleep(5000);

		List<WebElement> allElements = driver.findElements(By.xpath("//div[contains(@id,'Al')]//li"));
		System.out.println(allElements.size());

		String expResult = "selenium ide";

		for (int i = 0; i < allElements.size(); i++) {
			if (allElements.get(i).getText().equalsIgnoreCase(expResult)) {
				allElements.get(i).click();
				break;
			}
		}

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
