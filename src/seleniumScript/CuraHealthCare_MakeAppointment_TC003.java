package seleniumScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CuraHealthCare_MakeAppointment_TC003 {

	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://katalon-demo-cura.herokuapp.com/");
	}

	@Test
	public void testLogout() throws IOException, InterruptedException {
		WebElement appointment = driver.findElement(By.id("btn-make-appointment"));
		appointment.click();

		String actURL = driver.getCurrentUrl();
		String expURL = "https://katalon-demo-cura.herokuapp.com/profile.php#login";

		Assert.assertEquals(actURL, expURL, "actual and expected URL is not matching");

		WebElement username = driver.findElement(By.id("txt-username"));
		username.sendKeys("John Doe");

		WebElement password = driver.findElement(By.id("txt-password"));
		password.sendKeys("ThisIsNotAPassword");

		WebElement btnLogin = driver.findElement(By.id("btn-login"));
		btnLogin.click();

		WebElement menu = driver.findElement(By.xpath("//a[@id='menu-toggle']"));
		menu.click();
		Thread.sleep(3000);

		WebElement logout = driver.findElement(By.xpath("//ul[@class='sidebar-nav']//li[5]"));
		logout.click();

		WebElement menuItems = driver.findElement(By.xpath("//a[@id='menu-toggle']"));
		menuItems.click();
		Thread.sleep(3000);

		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		Assert.assertTrue(login.isDisplayed());

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
