package seleniumScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabFooterSection {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.xpath("//footer[@class='footer']/child::ul//a[text()='Twitter']")).click();
		String childWindow = driver.getWindowHandle();
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);

		WebElement text = driver.findElement(By.xpath("//span[text()='Settings']"));
		String actText = text.getText();
		System.out.println(actText);

	}

}
