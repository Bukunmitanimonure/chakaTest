package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LandingPage;
import pages.LoginPage;
import pages.PortfolioPage;
import pages.ExplorePage;

public class ChakaTest {
	String baseUrl = "https://test.chaka.ng/";
	String projectPath = System.getProperty("user.dir");
	String driverPath = projectPath+"\\driver\\chromedriver.exe";
	WebDriver driver;
	public String email = "admin@gmail.com";
	public String password = "Password12";
	public String countries = "Countries";
	
	LandingPage objLandingPage;
	LoginPage objLoginPage;
	PortfolioPage objPortfolioPage;
	ExplorePage objExplorePage;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test(priority=0)
	public void toLandingPage() {
		objLandingPage = new LandingPage(driver);
		objLandingPage.naviagateToLoginPage();
	}
	
	@Test(priority=1)
	public void userLogin() {
		objLoginPage = new LoginPage(driver);
		objLoginPage.login(email, password);
	}
	
	@Test(priority=2)
	public void toExplorePage() {
		objPortfolioPage = new PortfolioPage(driver);
		objPortfolioPage.navigateToExplore();
	}
	
	@Test(priority=3)
	public void selectCountry() {
		objExplorePage = new ExplorePage(driver);
		objExplorePage.setExploreOption(countries);
	}
	
}
