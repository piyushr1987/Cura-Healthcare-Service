package seleniumScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CuraHealthCare_MakeAppointment_TC001 {

	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://katalon-demo-cura.herokuapp.com/");
	}

	@Test
	public void makeAnAppointmentWithBlankData() {
		WebElement appointment = driver.findElement(By.id("btn-make-appointment"));
		appointment.click();

		WebElement btnLogin = driver.findElement(By.id("btn-login"));
		btnLogin.click();

		WebElement errorMessage = driver
				.findElement(By.xpath("//div[contains(@class,'col-sm-12')]/child::p[@class='lead text-danger']"));

		String actErrorMessage = errorMessage.getText();
		String expErrorMessage = "Login failed! Please ensure the username and password are valid.";

		Assert.assertEquals(actErrorMessage, expErrorMessage, "actual and expected error message is not matching");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
