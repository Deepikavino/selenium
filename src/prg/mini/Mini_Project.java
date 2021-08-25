package prg.mini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement sign_btn = driver.findElement(By.xpath("//a[@class='login']"));
		sign_btn.click();
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("deepikaraje07@gmail.com");
		
		WebElement create_btn = driver.findElement(By.id("SubmitCreate"));
		create_btn.click();
		Thread.sleep(2000);
		
		WebElement Radio_btn = driver.findElement(By.id("id_gender2"));
		Radio_btn.click();
		
		WebElement First_name = driver.findElement(By.id("customer_firstname"));
		First_name.sendKeys("DEEPIKA");
		
		WebElement Last_name = driver.findElement(By.id("customer_lastname"));
        Last_name.sendKeys("VINOTHKUMAR");
        
        WebElement passwrd = driver.findElement(By.xpath("//input[@type='password']"));
	    passwrd.sendKeys("Prideep");
	    
	    WebElement Day = driver.findElement(By.id("days"));
	    Select s=new Select(Day);
	    s.selectByValue("3");
	    
	    WebElement Month = driver.findElement(By.id("months"));
	    Select s1=new Select(Month);
	    s1.selectByVisibleText("June ");
	    
	    WebElement Year = driver.findElement(By.id("years"));
	    Select s2=new Select(Year);
	    s2.selectByValue("1990");
	    
	    WebElement Address = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
	    Address.sendKeys("Arignar anna street");
	    
	    WebElement Address2 = driver.findElement(By.id("address2"));
	    Address2.sendKeys("Flat no:116");
	    
	    WebElement City = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
	    City.sendKeys("Chennai");
	    
	    WebElement State = driver.findElement(By.id("id_state"));
	    Select s3=new Select(State);
	    s3.selectByVisibleText("Indiana");
	    
	    WebElement Pincode = driver.findElement(By.name("postcode"));
        Pincode.sendKeys("60007");
        
        WebElement Country = driver.findElement(By.name("id_country"));
        Select s4=new Select(Country);
        s4.selectByVisibleText("United States");
        
        WebElement Ph_num = driver.findElement(By.id("phone_mobile"));
        Ph_num.sendKeys("9856877704");
        
        WebElement Future_Addr = driver.findElement(By.name("alias"));
        Future_Addr.sendKeys( "","Vinoth,cuddalore");
        
        WebElement Reg_btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        Reg_btn.click();
	}
	
	
	
	

}
