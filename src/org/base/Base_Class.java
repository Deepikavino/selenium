package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browser) {
      if(browser.equalsIgnoreCase("Chrome"))
      {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
      }
      else if (browser.equalsIgnoreCase("IE")) {
    	  System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\IEDriverserver.exe");
          driver = new ChromeDriver();
		
	}
    return driver;

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}
	public static void inputvalues(WebElement element,String values) {
		element.sendKeys(values);
         
	}
	public static void ClickOnElement(WebElement element) {
         element.click();
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void navigataTo(String url) {
		driver.navigate().to(url);

	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void Refresh() {
		driver.navigate().refresh();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}
}
