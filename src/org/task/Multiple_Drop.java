package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Drop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		
		//isMultiple
		
		WebElement multi = driver.findElement(By.id("multi-select"));
		Select s=new Select(multi);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		
		s.selectByValue("New York");
		s.selectByVisibleText("Texas");
		s.selectByIndex(1);
		
		//get options
		List<WebElement> options = s.getOptions();
		//System.out.println(options);
		for(WebElement alloptions:options)
		  {
			String Text = alloptions.getText();
			System.out.println(Text);
		  }
		
		//length
		int size = options.size();
		System.out.println(size);
			
		//all selected options
		List<WebElement> allselected = s.getAllSelectedOptions();
			for (WebElement allselectedopt : allselected) {
				String text = allselectedopt.getText();
				System.out.println(text);
			}
		//first selected options
			WebElement firstSelect = s.getFirstSelectedOption();
			String text = firstSelect.getText();
			System.out.println(text);
		  }
		
		
		
	}


