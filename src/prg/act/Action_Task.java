package prg.act;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Task {
	public static WebDriver driver;
	
	public static void getBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

	    driver = new ChromeDriver();
	}

		public static void launchUrl() {
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();

		}
		public static void actioMet(WebElement element) {
			WebElement kids = driver.findElement(By.xpath("//a[@data-group='kids']"));
			
			Actions act=new Actions(driver);
			act.moveToElement(kids).build().perform();

		}
		
		
		
    	WebElement Boys_shirt = driver.findElement(By.xpath("//a[@data-reactid='334']"));
		
		//act.contextClick(Boys_shirt).build().perform();
		
		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_UP);
		//r.keyRelease(KeyEvent.VK_UP);
		//r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


