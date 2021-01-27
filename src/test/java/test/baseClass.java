package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.landingPage;

import java.util.concurrent.TimeUnit;

public class baseClass {

    protected  static WebDriver driver;
    ChromeOptions options=new ChromeOptions();
    String projectPath = System.getProperty("user.dir");
    String driverPath = projectPath+"\\driver\\chromedriver.exe";



    public static landingPage setDriver(String url) {
        driver.get(url);
        return new landingPage(driver);
    }

    @BeforeTest
    public void setup() {

        System.setProperty("webdriver.chrome.driver", driverPath);
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void closeDriver () {
        driver.quit();
    }



}
