package seleniumScript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CuraHealthCare_MakeAppointment_TC002 {

	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://katalon-demo-cura.herokuapp.com/");
	}

	@Test
	public void makeAnAppointmentWithoutEnteringDate() throws IOException {
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

		WebElement bookAppointment = driver.findElement(By.id("btn-book-appointment"));
		bookAppointment.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\piyush ramteke\\Piyush-Workspace\\PiyushRamteke\\Screenshots\\date.png");
		FileHandler.copy(src, des);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
