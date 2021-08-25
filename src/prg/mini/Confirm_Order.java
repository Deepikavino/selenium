package prg.mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order {
	
	public WebDriver driver;
	@FindBy(id="cgv")
	private WebElement agree;
	public Confirm_Order(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAgree() {
		return agree;
	}
	public WebElement getCheck() {
		return check;
	}
	public WebElement getBank() {
		return bank;
	}
	public WebElement getConfirm() {
		return confirm;
	}
	public WebElement getPhoto() {
		return photo;
	}
	@FindBy(name="processCarrier")
	private WebElement check;
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bank;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm;
	
	private WebElement photo;
	

}
