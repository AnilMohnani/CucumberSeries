package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javaPageClasses.LoginPage;
import javaPageClasses.MyAccountPage;

public class LoginPageSteps {
	
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	private MyAccountPage myAccountPage;
	@Given("User is on application login screen")
	public void user_is_on_application_login_screen() {
	    
	    DriverFactory.getDriver().get("https://www.telerik.com/login/v2/telerik?ReturnUrl=https%3a%2f%2fidentity.telerik.com%2fv2%2foauth%2ftelerik%2fauthorize%3fclient%5fid%3dhttp%253a%252f%252fwww.lean.telerik.com%26redirect%5furi%3dhttps%253a%252f%252fwww.telerik.com%252faccount%252f%26response%5ftype%3dcode%26state%3d27387BDCCEF7C8D232FE487B9181F5AC6116090260916220C62CDF41B0C026B1#login");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String uname) {
	   loginPage.enterUsername(uname);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String pass) {
	    loginPage.enterPassword(pass);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		myAccountPage=loginPage.clickLoginBtn();
	   
	}

	@Then("User is logged in successfully and {string} is visible")
	public void user_is_logged_in_successfully_and_is_visible(String string) {
		System.out.println(myAccountPage.getUsernameValue());
	}
	

}
