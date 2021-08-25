package prg.mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	@FindBy(id="email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getSignin_btn() {
		return signin_btn;
	}
    @FindBy(id="passwd")
	private WebElement passwrd;
	@FindBy(id="SubmitLogin")
	private WebElement signin_btn;
	

	public LoginPage(WebDriver drive) {
		
		this.driver=drive;
		PageFactory.initElements(drive, this);
	}
	

}
