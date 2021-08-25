package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Browser_Launch extends Base_Class{
	
	public static WebDriver driver;
	public static  void main(String[] args) {
		 driver=getBrowser("Chrome");
		driver.get("https://en-gb.facebook.com/");
		
		Fb_Login fb=new Fb_Login(driver);
		
		//WebElement email = driver.findElement(By.id("email"));
		inputvalues(fb.getEmail(), "deepikaraje07@gmail.com");
		
		//WebElement pswd = driver.findElement(By.id("pass"));
		inputvalues(fb.getPswd(), "12345");
		
		//WebElement login = driver.findElement(By.name("login"));
		ClickOnElement(fb.getLogin());
		
		
		
		
		
	}

}
