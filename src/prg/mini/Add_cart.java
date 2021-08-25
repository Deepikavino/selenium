package prg.mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_cart {
	
	public WebDriver driver;
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	
	public Add_cart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
          
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getEveng_dress() {
		return Eveng_dress;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getStyle() {
		return style;
	}
	@FindBy(xpath="(//a[@title='T-shirts'])[1]")
	private WebElement Eveng_dress;
	@FindBy(xpath="(//input[@class='checkbox'])[2]")
	private WebElement size;
	@FindBy(xpath="(//input[@type='checkbox'])[5]")
	private WebElement style;

}
