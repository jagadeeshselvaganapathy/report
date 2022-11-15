package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.j2objc.annotations.Property;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	
	
public static WebDriver driver;
	
	public static WebDriver lanchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public void navigate(String url) {

		driver.navigate().to(url);
	}

	public void insertText(WebElement element, String text) {
		element.sendKeys(text);
		
	}
	

	public void clickButton(WebElement element) {
		element.click();
	}

	public void selectKey(WebElement element1, String text) {
		Select s = new Select(element1);
		s.selectByVisibleText(text);
	}

	public String txtPrint(WebElement element2) {
		String text = element2.getText();
		return text;
	}
	
	public void scrollTrue(WebElement element) {
    
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView(false)", element);
	 
	}
	
	
	public Timeouts sleep(int element) {
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(element));
		return implicitlyWait;
	}
	
	public void deleteCookies() {
driver.manage().deleteAllCookies();
	}
	
	public void closeBrowser() {
driver.close();
	}
	
	public static String valueFromProperty(String key) throws IOException {
File fi = new File(System.getProperty("user.dir")+"\\target\\config.properties");
FileInputStream stream = new FileInputStream(fi);
Properties pro = new Properties();
pro.load(stream);
Object obj = pro.get(key);
String s = (String)obj;
return s;
	}
	
	
	

 
}
