package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Column_Table {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> Col_data = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		
		for (WebElement column : Col_data) {
			String text = column.getText();
			System.out.println(text);
		}
		System.out.println("HEADINGS");
		List<WebElement> heading = driver.findElements(By.tagName("th"));
		for (WebElement head : heading) {
			String text = head.getText();
			System.out.println(text);
			
		}
		
		
		
	}

}
