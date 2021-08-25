package org.task;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scren_Task {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("deepikaraje07@gmail.com");
	    WebElement passwrd = driver.findElement(By.id("passwd"));
	    passwrd.sendKeys("Prideep");
	    WebElement signin_btn = driver.findElement(By.id("SubmitLogin"));
	    signin_btn.click();
	
	    WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
        Actions act=new Actions(driver);
        act.moveToElement(women).build().perform();
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		tshirt.click();
		
		WebElement list = driver.findElement(By.xpath("//i[@class='icon-th-list']"));
		list.click();
		WebElement more = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		more.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement scroll = driver.findElement(By.xpath("//ul[@class='address last_item alternate_item box']"));
        js.executeScript("arguments[0].scrollIntoView();",scroll);
        
        WebElement checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
        checkout.click();
        JavascriptExecutor js1=(JavascriptExecutor)driver;
        WebElement scroll1 = driver.findElement(By.id("address_invoice"));
        js1.executeScript("arguments[0].scrollIntoView();",scroll1);
        
        WebElement proced = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        proced.click();
        Thread.sleep(2000);
        JavascriptExecutor js2=(JavascriptExecutor)driver;
        WebElement scroll2 = driver.findElement(By.xpath("//p[@class='carrier_title']"));
        js2.executeScript("arguments[0].scrollIntoView();",scroll2);
        WebElement agree = driver.findElement(By.id("cgv"));
        agree.click();
        WebElement check = driver.findElement(By.name("processCarrier"));
        check.click();
        WebElement Bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
        Bank.click();
        
        WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        confirm.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        TakesScreenshot ts=(TakesScreenshot)driver;
         File source = ts.getScreenshotAs(OutputType.FILE);
         File destination=new File("C:\\Users\\vinoth\\eclipse-workspace\\Selenium_Task\\Screenshots\\picture.png");
         FileUtils.copyFile(source, destination);
	}
	

}
