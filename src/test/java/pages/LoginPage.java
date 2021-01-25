package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By loginButton = By.xpath("//*[@id=\"app\"]/main/div/form/div[4]/div[1]");
	By emailInput = By.xpath("//*[@id=\"app\"]/main/div/form/div[1]/label");
	By passwordInput = By.xpath("//*[@id=\"app\"]/main/div/form/div[2]/label");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setEmail(String email) {
		driver.findElement(emailInput).sendKeys(email);
	}
	
	public void setPassword(String password) {
		driver.findElement(passwordInput).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public void login(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
		this.clickLoginButton();
	}
}
