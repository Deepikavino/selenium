package prg.mini;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;
import okhttp3.internal.cache.DiskLruCache.Snapshot;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\IEDriverserver.exe");
			driver = new ChromeDriver();

		}
		return driver;

	}

	public static void launchUrl(String Url) {

		driver.get(Url);
		driver.manage().window().maximize();

	}

	public static void inputvalues(WebElement element, String values) {
		element.sendKeys(values);
	}

	public static void ClickOnElement(WebElement element) {
		element.click();
	}

	public static void actionMeth(WebElement element) {

		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static void MoveToElement(WebElement element) {
		// a[@title='Evening Dresses'])[1]
		// a[@title='T-shirts'])[1]
		Actions act = new Actions(driver);
		act.click(element).build().perform();

	}

	public static void confirm() {
		WebElement Bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		Bank.click();

		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();

	}

	public static void photo(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(location);
		FileUtils.copyFile(source, destination);
	}

}
