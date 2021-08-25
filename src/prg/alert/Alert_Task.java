package prg.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		
		//simple alert
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		button.click();
		Alert simple_alert = driver.switchTo().alert();
		Thread.sleep(3000);
		simple_alert.accept();
		
		//confirm alert
		WebElement button1 = driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		button1.click();
		Alert confirm_alert = driver.switchTo().alert();
		Thread.sleep(2000);
		confirm_alert.dismiss();
		
		//prompt alert
		WebElement button2 = driver.findElement(By.xpath("(//button[contains(@class,'btn')])[3]"));
		button2.click();
		Alert prompt_alert = driver.switchTo().alert();
		Thread.sleep(2000);
		prompt_alert.accept();
		Thread.sleep(5000);
		
		WebElement name = driver.findElement(By.xpath("//p[@id='prompt-demo']"));
		name.sendKeys("Deepika");
	}

}
