package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	@Before
	public void beforeExecution() {
        
		lanchBrowser();
		loadUrl("https://qa.eu.notabene.dev/dashboard/outgoing");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		
	}
	
	@After
	public void afterExecution(Scenario s) {

		TakesScreenshot screenshot = (TakesScreenshot)driver;
		byte[] sh = screenshot.getScreenshotAs(OutputType.BYTES);
		s.embed(sh, "image/png");
		
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
