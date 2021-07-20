package javaPageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
	private WebDriver driver;
	private By usernameValidator = By.cssSelector(".e2e-email.u-mb10.u-wbba");

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getUsernameValue() {
		return driver.findElement(usernameValidator).getText();
	}
}
