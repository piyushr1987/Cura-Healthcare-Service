package seleniumScript;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethod_HandlingWindows {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		String parentWindowId = driver.getWindowHandle();

		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]")).click();

		Set<String> handles = driver.getWindowHandles();

		List<String> hList = new ArrayList<String>(handles);
		if (switchToRightWindow("Facebook", hList)) {
			System.out.println(driver.getCurrentUrl() + ":" + driver.getTitle());

		}

		closeAllWindow(hList, parentWindowId);
		switchToParentWindow(parentWindowId);
		System.out.println(driver.getCurrentUrl() + ":" + driver.getTitle());
	}

	public static void switchToParentWindow(String parentWindowId) {
		driver.switchTo().window(parentWindowId);
	}

	public static void closeAllWindow(List<String> hList, String parentWindowId) {
		for (String e : hList) {
			if (!e.contains(parentWindowId)) {
				driver.switchTo().window(e).close();
			}
		}
	}

	public static boolean switchToRightWindow(String windowTitle, List<String> hList) {
		for (String e : hList) {
			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("Found the right window........");
				return true;
			}
		}
		return false;
	}

}
