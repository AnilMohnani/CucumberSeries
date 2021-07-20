package javaPageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	//private members
	private WebDriver driver;
	
	private By username=By.id("username");
	private By password=By.id("password");
	private By loginBtn=By.id("LoginButton-1");
	
	//constructor
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//public member methods
	public void enterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public MyAccountPage clickLoginBtn()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", driver.findElement(loginBtn));
		return new MyAccountPage(driver);
	}
	
}
