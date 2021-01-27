package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class landingPage {

	WebDriver driver;
	WebDriverWait wait;
	Alert alert;

	@FindBy(linkText = "Log In") WebElement clickLogin;
	
	public landingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 30);
	}
	
	public loginPage navigateToLoginPage(){
		clickLogin.click();
		return new loginPage(driver);
	}

}
