package seleniumScript;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingPaginationDemo {

	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
	}

	@Test
	public void pagination() throws InterruptedException {

		List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='example']//tr/td[@class='sorting_1']"));

		List<String> names = new ArrayList<String>();

		for (WebElement name : allNames) {
			names.add(name.getText());
		}

		String nextButtonClassName = driver.findElement(By.id("example_next")).getAttribute("class");
		while (!nextButtonClassName.contains("disabled")) {
			driver.findElement(By.id("example_next")).click();
			driver.findElements(By.xpath("//table[@id='example']//tr/td[@class='sorting_1']"));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfAllElements(allNames));
			for (WebElement name : allNames) {
				names.add(name.getText());
			}
			nextButtonClassName = driver.findElement(By.id("example_next")).getAttribute("class");

		}
		for (String nameoneachpage : names) {
			System.out.println(nameoneachpage);
		}
		int totalSize = names.size();
		System.out.println("Total size is : " + totalSize);

		String displayCount = driver.findElement(By.id("example_info")).getText().split(" ")[5];
		System.out.println("Total no of display count is : " + displayCount);

		Assert.assertEquals(displayCount, String.valueOf(totalSize));
		Thread.sleep(5000);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
