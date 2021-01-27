package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashBoard {
    WebDriver driver;
    WebDriverWait wait;

    public dashBoard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 30);

    }

    @FindBy(xpath = "//header/nav[1]/div[1]/ul[1]/li[2]/a[1]/span[1]") WebElement clickExplore;

    public explorePage navigateExplore () {
        clickExplore.click();
        return new explorePage(driver);
    }
}
