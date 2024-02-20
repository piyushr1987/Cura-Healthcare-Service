package seleniumScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		FacebookLogin face = new FacebookLogin(driver);
		face.enterEmail("abc@gmail.com");
		face.enterPassword("12345");
		face.clickOnLogin();

	}

}
