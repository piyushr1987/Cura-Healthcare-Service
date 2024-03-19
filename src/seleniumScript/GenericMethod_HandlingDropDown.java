package seleniumScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericMethod_HandlingDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);

		By country = By.xpath("//select[@name='country']");
		// doSelectByVisibleText(country, "INDIA");
		// Thread.sleep(3000);
		// doSelectByIndex(country, 4);
		// Thread.sleep(3000);
		// doSelectByValue(country, "ANTARCTICA");
		selectDropDownValue(country, "index", "5");
		Thread.sleep(3000);
		selectDropDownValue(country, "value", "ANTARCTICA");
		Thread.sleep(3000);
		selectDropDownValue(country, "visibleText", "INDIA");

	}

	public static void selectDropDownValue(By locator, String type, String value) {
		Select sel = new Select(getElement(locator));
		switch (type) {
		case "index":
			sel.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			sel.selectByValue(value);
			break;
		case "visibleText":
			sel.selectByVisibleText(value);
			break;

		default:
			System.out.println("please the pass the correct selection criteria");
			break;
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByVisibleText(By locator, String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(value);
	}

	public static void doSelectByIndex(By locator, int index) {
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}

	public static void doSelectByValue(By locator, String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	}

}
