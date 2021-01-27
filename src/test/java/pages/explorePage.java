package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explorePage {
	WebDriver driver;
	WebDriverWait wait;


	@FindBy(xpath = "//body/div[@id='app']/main[1]/section[1]/section[1]/section[2]") WebElement drpExplore;
	
	public explorePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 30);

	}
	
	public void setExploreOption() {
		Select select = new Select(drpExplore);
		select.selectByValue("COUNTRIES");
	}

}
