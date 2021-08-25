package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login {
	
	public static WebDriver driver;
	@FindBy(id="email")
	private WebElement email;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getLogin() {
		return login;
	}
    @FindBy(id="pass")
	private WebElement pswd;
	@FindBy(name="login")
	private WebElement login;

	public Fb_Login (WebDriver drive)
	{
		this.driver=drive;
		PageFactory.initElements(drive, this);
		
	}
	

}
