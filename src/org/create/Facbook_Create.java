package org.create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facbook_Create {
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
		    WebElement lng_butt = driver.findElement(By.xpath("(//a [@class='_sv4'])[1]"));
			lng_butt.click();
			
			
			WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
			button.click();
			
			Thread.sleep(3000);
			
			WebElement name = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
			name.sendKeys("Deepika");
			
			WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
			lastname.sendKeys("V");
			
			WebElement email = driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
			email.sendKeys("deepika1232@gmail.com");
			
			WebElement confirmmail = driver.findElement(By.xpath("(//input[@data-type='text'])[4]"));
			confirmmail.sendKeys("deepika1232@gmail.com");
			
			WebElement pswd = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
			pswd.sendKeys("12345");
			
			WebElement month = driver.findElement(By.id("month"));
			Select s=new Select(month);
			s.selectByValue("7");
			
			WebElement day = driver.findElement(By.id("day"));
			Select s1=new Select(day);
			s1.selectByVisibleText("3");
			
			WebElement year = driver.findElement(By.id("year"));
			Select s2=new Select(year);
			s2.selectByValue("2008");
			
			WebElement rad_button = driver.findElement(By.xpath("//input[@type='radio']"));
			rad_button.click();
			
		}
	


}
