package org.task;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dynamic_Path {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=men+t+shirt");
		
		driver.manage().window().maximize();
		
		List<Integer>Price=new ArrayList<Integer>();
		
		List<WebElement> All_Prices = driver.findElements(By.xpath("//span[@aria-hidden='true']//preceding-sibling::span"));
		
		for (WebElement prices : All_Prices) {
			String replace = prices.getText().replace("₹", "");
			int value = Integer.parseInt(replace);
			Price.add(value);
			
			int size = Price.size();
			System.out.println("size:"+size);
			
		}
		
		
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

