package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortfolioPage {
	WebDriver driver;
	By exploreLink = By.linkText("Explore");

	public PortfolioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToExplore() {
		driver.findElement(exploreLink).click();
	}
}
