package prg.mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Cart {
	
	public Proceed_Cart(WebDriver driver3) {
        this.driver=driver3;
        PageFactory.initElements(driver3, this);
	}
	public WebDriver driver;
	@FindBy(xpath="//i[@class='icon-th-list']")
	private WebElement list;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getList() {
		return list;
	}
	public WebElement getMore() {
		return more;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getProced() {
		return proced;
	}
	@FindBy(xpath="//a[@title='Add to cart']")
	private WebElement more;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	@FindBy(xpath="//a[@title='Proceed to checkout'])[2]")
	private  WebElement checkout;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement proced;
	

}
