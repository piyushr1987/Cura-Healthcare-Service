package testFlipkart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Get_AllValues_FromList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone 14");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();

		List<WebElement> alliphonetext = driver
				.findElements(By.xpath("//div[contains(@class,'_2k')]//div[contains(@class,'_4')]"));
		for (int i = 0; i < alliphonetext.size(); i++) {
			String allText = alliphonetext.get(i).getText();
			System.out.println(allText);
			if (allText.contains("(Purple, 512 GB)")) {
				alliphonetext.get(i).click();
				break;
			}

		}

	}

}
