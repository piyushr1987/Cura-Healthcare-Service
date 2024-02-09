package seleniumScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CuraHealthCare_MakeAppointment {

	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://katalon-demo-cura.herokuapp.com/");
	}

	@Test
	public void makeAnAppointment() {
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

		WebElement appointmentHeader = driver.findElement(By.xpath("//div[@class='col-sm-12 text-center']/child::h2"));
		String actText = appointmentHeader.getText();
		String expText = "Make Appointment";
		Assert.assertEquals(actText, expText, "actual and expected text is not matching");

		WebElement facility = driver.findElement(By.xpath("//select[@id='combo_facility']"));
		Select sel = new Select(facility);
		sel.selectByValue("Hongkong CURA Healthcare Center");

		WebElement hospitalReadmission = driver.findElement(By.id("chk_hospotal_readmission"));
		hospitalReadmission.click();

		WebElement medicaid = driver.findElement(By.id("radio_program_medicaid"));
		medicaid.click();

		WebElement visitDate = driver.findElement(By.id("txt_visit_date"));
		visitDate.sendKeys("12/02/2024");

		WebElement comment = driver.findElement(By.id("txt_comment"));
		comment.sendKeys("This is an urgent medical emergency");

		WebElement bookAppointment = driver.findElement(By.id("btn-book-appointment"));
		bookAppointment.click();

		WebElement appointmentConfirmation = driver
				.findElement(By.xpath("//div[@class='col-xs-12 text-center']/child::h2"));
		String actConfirmationText = appointmentConfirmation.getText();
		String expConfirmationText = "Appointment Confirmation";
		Assert.assertEquals(actConfirmationText, expConfirmationText,
				"actual and expected confirmation text is not matching");

		WebElement homePage = driver.findElement(By.xpath("//a[text()='Go to Homepage']"));
		homePage.click();

		String actHomeURL = driver.getCurrentUrl();
		String expHomeURL = "https://katalon-demo-cura.herokuapp.com/";

		Assert.assertEquals(actHomeURL, expHomeURL, "actual and expected home URL is not matching");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
