package org.base;

import org.openqa.selenium.WebDriver;

public class Browser extends Base_Class{
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		getBrowser("Chrome");
		launchUrl("https://www.instagram.com/");
		getTitle();
		getCurrentUrl();
		navigataTo("https://en-gb.facebook.com/");
		navigateBack();
		navigateForward();
		Refresh();
		close();
		quit();
	}
	
	

}
