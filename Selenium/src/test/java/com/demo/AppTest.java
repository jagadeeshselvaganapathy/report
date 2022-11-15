package com.demo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
   public static void main(String[] args) throws IOException, MailosaurException  {
	   WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.eu.notabene.dev/dashboard/outgoing");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.id("1-email")).sendKeys("@asdas@umbbppch.mailosaur.net");
		driver.findElement(By.id("1-submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
    // Available in the API tab of a server
    String apiKey = "COHW7u3wujDM6iiz";
    String serverId = "umbbppch";
    String serverDomain = "umbbppch.mailosaur.net";

    MailosaurClient mailosaur = new MailosaurClient(apiKey);

    MessageSearchParams params = new MessageSearchParams();
    params.withServer(serverId);

    SearchCriteria criteria = new SearchCriteria();
    criteria.withSentTo("asdas@" + serverDomain);

    Message message = mailosaur.messages().get(params, criteria);
    
    System.out.println(message);

  
  }
}


   
    
    


