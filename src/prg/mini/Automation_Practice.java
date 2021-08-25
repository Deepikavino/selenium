package prg.mini;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Automation_Practice extends Base_Class {

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = getBrowser("Chrome");
		launchUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		LoginPage lp = new LoginPage(driver);
		
		inputvalues(lp.getEmail(), "deepikaraje07@gmail.com");

		inputvalues(lp.getPasswrd(), "Prideep");

		ClickOnElement(lp.getSignin_btn());
		
		Thread.sleep(1000);
		
		Add_cart ac = new Add_cart(driver);

		actionMeth(ac.getWomen());

		MoveToElement(ac.getEveng_dress());

		ClickOnElement(ac.getSize());

		ClickOnElement(ac.getStyle());

		Proceed_Cart pc = new Proceed_Cart(driver);

		ClickOnElement(pc.getList());

		ClickOnElement(pc.getMore());
		Thread.sleep(2000);

		ClickOnElement(pc.getProceed());
		Thread.sleep(2000);

		ClickOnElement(pc.getCheckout());

		ClickOnElement(pc.getProced());
		Thread.sleep(2000);

		Confirm_Order co = new Confirm_Order(driver);

		ClickOnElement(co.getAgree());

		ClickOnElement(co.getCheck());

		ClickOnElement(co.getBank());

		ClickOnElement(co.getConfirm());
		photo("\"C:\\\\Users\\\\vinoth\\\\eclipse-workspace\\\\Selenium_Task\\\\Screenshots\\\\picture2.png\"");

	}

}
	
//WebElement email = driver.findElement(By.id("email"));

//WebElement passwrd = driver.findElement(By.id("passwd"));
//WebElement signin_btn = driver.findElement(By.id("SubmitLogin"));
//WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
//WebElement Eveng_dress = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
//WebElement size = driver.findElement(By.xpath("(//input[@class='checkbox'])[2]"));
//WebElement style = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")); 
//WebElement list = driver.findElement(By.xpath("//i[@class='icon-th-list']"));
//WebElement more = driver.findElement(By.xpath("//a[@title='Add to cart']"));
//WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
//WebElement checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//WebElement proced = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//WebElement agree = driver.findElement(By.id("cgv"));
//WebElement check = driver.findElement(By.name("processCarrier"));
//WebElement Bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
//WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));