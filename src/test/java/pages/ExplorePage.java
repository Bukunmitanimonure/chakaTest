package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ExplorePage {
	WebDriver driver;
	By exploreOption = By.tagName("select");
	
	public ExplorePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setExploreOption(String option) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.getElementsByTagName('select').setAttribute('visibility', 'true');");
		Select drpExplore = new Select(driver.findElement(exploreOption));
		drpExplore.selectByValue(option);
	}

}
