package seleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	WebDriver driver;

	FacebookLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "pass")
	private WebElement txtPassword;

	@FindBy(name = "login")
	private WebElement btnLogin;

	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void enterPassword(String pass) {
		txtPassword.sendKeys(pass);
	}

	public void clickOnLogin() {
		btnLogin.click();
	}

}
