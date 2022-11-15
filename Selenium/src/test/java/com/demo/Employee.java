package com.demo;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Employee {
	
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.eu.notabene.dev/dashboard/outgoing");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.id("1-email")).sendKeys("jagadeesh@qaoncloud.com");
		driver.findElement(By.id("1-submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		/*  String apiKey = "COHW7u3wujDM6iiz";
		    String serverId = "umbbppch";
		    String serverDomain = "umbbppch.mailosaur.net";

		    MailosaurClient mailosaur = new MailosaurClient(apiKey);

		    MessageSearchParams params = new MessageSearchParams();
		    params.withServer(serverId);

		    SearchCriteria criteria = new SearchCriteria();
		    criteria.withSentTo("asdas@" + serverDomain);

		    Message message = mailosaur.messages().get(params, criteria);
		    
		    System.out.println(message);
		    WebElement element = driver.findElement(By.id("1-vcode"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value',message)",element );
		    
		//AppTest a = new AppTest();
	//	a.testExample();
	
		
		/*
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		WebElement element = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(12) > section:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1)"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element );
		driver.findElement(By.xpath("//a[normalize-space()='Transactions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='All']")).click();
		Thread.sleep(5000);
		WebElement element1 = driver.findElement(By.xpath("(//div[@class='TransactionRow__AssetText-aiz25-13 cbiOCx'])[1]"));
		String text = element1.getText();
		System.out.println(text);
		System.out.println(text);
		boolean contain = text.contains("3");
		Assert.assertEquals("verified", text, "200");
/*RulesSetting r = new RulesSetting();
		
		r.getCanadianCa().click();
		Thread.sleep(3000);
		r.getRule().click();
		Thread.sleep(3000);
		r.getBasicRule().click();
		Thread.sleep(3000);
		r.getSave().click();
		Thread.sleep(3000);

		driver.navigate().to("https://qa.eu.notabene.dev/dashboard/outgoing");

	/*	driver.findElement(By.xpath("(//span[@class='localize-ignore'][normalize-space()='Canadian CA'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='QAonCloud US US'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Transactions']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@title='Accept incoming transaction'])[1]")).click();
		Thread.sleep(3000);
		WebElement elementw = driver.findElement(By.xpath("(//button[normalize-space()='Cancel'])[1]"));
		elementw.click();
		 Thread.sleep(3000);*/
		
		/*driver.findElement(By.xpath("//a[normalize-space()='All']")).click();
		Thread.sleep(5000);
		WebElement elementx = driver.findElement(By.xpath("(//button[@title='Decline incoming transaction'])[1]"));
		JavascriptExecutor jv = (JavascriptExecutor)driver;
		jv.executeScript("arguments[0].click()",elementx );
		WebElement elementv = driver.findElement(By.xpath("(//button[@class='Text-var2ts-0 Button__Clickable-sc-1r4hlp6-1 Button-sc-1r4hlp6-2 "
				+ "Button__ButtonLink-sc-1r4hlp6-3 dbjaSA fARrfR ljKBeO has-text-danger is-text button'])[1]"));
		elementv.click();
		//jv.executeScript("arguments[0].click()",elementv );
		Thread.sleep(5000);*/
		
		//a[normalize-space()='Transactions']
	//	driver.findElement(By.id("email")).sendKeys("jaga");
		
		//driver.findElement(By.id("pass")).sendKeys("1234");
		
		
		
	}

}
