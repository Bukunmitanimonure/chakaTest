package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver;
	By loginButton = By.linkText("Log In");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void naviagateToLoginPage() {
		driver.findElement(loginButton).click();
	}

}
