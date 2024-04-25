package seleniumScript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus_Login {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		String redBusWindowId = driver.getWindowHandle();

		WebElement account = driver.findElement(By.xpath("//li[@id='account_dd']"));
		account.click();

		Thread.sleep(3000);

		WebElement login = driver.findElement(By.id("user_sign_in_sign_up"));
		login.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-close']")));

		WebElement iframeP = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(iframeP);

		WebElement iframeS = driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(iframeS);

		WebElement goggleLogin = driver
				.findElement(By.xpath("(//div[@id='container']//span[text()='Sign in with Google'])[1]"));
		goggleLogin.click();

		driver.switchTo().defaultContent();

		Set<String> windowsId = driver.getWindowHandles();
		for (String windowId : windowsId) {
			driver.switchTo().window(windowId);
			if (driver.getCurrentUrl().equalsIgnoreCase("https://www.redbus.in/")) {

			} else {
				break;
			}
		}

		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("abc123@gmail.com");

	}

}
