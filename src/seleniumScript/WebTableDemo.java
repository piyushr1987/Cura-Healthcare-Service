package seleniumScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		Thread.sleep(3000);
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));
		System.out.println(allHeaders.size());

		for (WebElement headerText : allHeaders) {
			System.out.println(headerText.getText());
		}

		driver.findElement(By.xpath("//*[text()='Selenium']/preceding-sibling::td//input")).click();
		
		driver.findElement(By.xpath("//*[text()='Ola']/following-sibling::td//a")).click();
		driver.quit();

	}

}
