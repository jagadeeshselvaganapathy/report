package com.pojo;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.utils.CommonUtils;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
    PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "1-email")
	private WebElement txtusername;
	
	@FindBy(id = "1-submit")
	private WebElement clkLogin;
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement cookiesButton;
	
		
//	@FindBy(css = "body > div:nth-child(2) > div:nth-child(12) > section:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1)")
//	private WebElement companyButton;
	
	//@FindBy(xpath = "//a[normalize-space()='Transactions']")
//	private WebElement tranceButton;
	
	/*@FindBy(css = "div[class='VASPDropdownProfile__DropdownToggleDiv-sc-1yeaz8c-3 llStvs'] div[class='VASPDropdownProfile__TopCompanyNameDiv-sc-1yeaz8c-2 VrzXb']")
	private WebElement canadianCa;
	
	@FindBy(xpath = "//a[normalize-space()='Rules']")
	private WebElement rule;
	
	@FindBy(xpath = "//input[@value='no-rules']")
	private WebElement noRule;
	
	@FindBy(xpath = "//button[@class='LoadingButton__Button-sc-15s5hsk-0 dipzYW']")
	private WebElement save;
	
	//@FindBy(xpath = "//button[@class='CreateTransferButton__Button-sc-1ax3pep-0 fvObLB']")
	//private WebElement createButton;*/
	
	
	public WebElement getTxtusername() {
		return txtusername;
	}


	public WebElement getClkLogin() {
		return clkLogin;
	}

	
	public WebElement getCookiesButton() {
		return cookiesButton;
	}


//	public WebElement getCompanyButton() {
//		return companyButton;
//	}


	//public WebElement getTranceButton() {
//		return tranceButton;
	//}
	
/*	public WebElement getCanadianCa() {
		return canadianCa;
	}

	public WebElement getRule() {
		return rule;
	}

	public WebElement getNoRule() {
		return noRule;
	}

	public WebElement getSave() {
		return save;
	}*/


	//public WebElement getCreateButton() {
	//	return createButton;
	//}


	public void login(String username) throws InterruptedException, IOException {
		CommonUtils.loadProperties();

		insertText(getTxtusername(), username);
		clickButton(getClkLogin());
		sleep(20000);
	//	clickButton(cookiesButton);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", getCompanyButton());
	//	clickButton(tranceButton);
	//	Thread.sleep(5000);*/
	//	clickButton(createButton);
		/*clickButton(getCanadianCa());
		Thread.sleep(4000);
		clickButton(getRule());
		Thread.sleep(4000);
		clickButton(getNoRule());
		Thread.sleep(4000);
		clickButton(getSave());
		Thread.sleep(4000);
		navigate("https://qa.eu.notabene.dev/dashboard/outgoing");*/
		
		
	}

}
