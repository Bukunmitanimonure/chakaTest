package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class loginPage {

	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//body/div[@id='app']/main[1]/div[1]/form[1]/div[1]/label[1]/input[1]") WebElement emailInput;
	@FindBy(xpath = "//body/div[@id='app']/main[1]/div[1]/form[1]/div[2]/label[1]/input[1]") WebElement passwordInput;
	@FindBy(xpath = "//button[contains(text(),'Login')]") WebElement loginBtn;
	private final By loadingIndicator = By.xpath ( "//body/div[3]/iframe[1]" );



	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 30);
	}

	public dashBoard setLogin(String email, String pwd) {
		wait.until( visibilityOf ( driver.findElement ( loadingIndicator )) );
		driver.switchTo ().frame ( 1 );
		emailInput.sendKeys(email);
		passwordInput.sendKeys(pwd);
		loginBtn.click();
		return new dashBoard(driver);
	}
}
