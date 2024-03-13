package seleniumScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.collections.CollectionUtils;

public class SwagLagDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
		for (WebElement productNames : allProducts) {
			System.out.println(productNames.getText());
		}

		WebElement drpNames = driver.findElement(By.xpath("//select[@class='product_sort_container']"));

		Select sel = new Select(drpNames);
		sel.selectByValue("za");

		List<WebElement> allProductsAfterSort = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));

		for (WebElement sortProductNames : allProductsAfterSort) {
			System.out.println("After sorting " + sortProductNames.getText());
		}
		Assert.assertTrue(allProducts.equals(allProductsAfterSort));

	}

}
