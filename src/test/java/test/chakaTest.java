package test;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.dashBoard;
import pages.explorePage;
import pages.landingPage;
import pages.loginPage;


public class chakaTest extends baseClass {

	public String email = "admin@gmail.com";
	public String password = "Password12";
	String baseUrl = "https://test.chaka.ng/";

	landingPage landing;
	loginPage login;
	dashBoard dash;
	explorePage explore;

	@Test
	public void login () {
		landing = baseClass.setDriver(baseUrl);
		login = landing.navigateToLoginPage();
		dash = login.setLogin(email, password);
	}

	@Test(priority = 1)
	public void bankCategory () {
	 explore = dash.navigateExplore();
	 explore.setExploreOption();
	}
}
