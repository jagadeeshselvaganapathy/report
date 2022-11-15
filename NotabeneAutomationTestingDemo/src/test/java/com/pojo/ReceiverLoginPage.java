package com.pojo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ReceiverLoginPage extends BaseClass{
	
	public ReceiverLoginPage() {
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "1-email")
	private WebElement txtusername;
	
	@FindBy(id = "1-submit")
	private WebElement clkLogin;
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement cookiesButton;
	
	@FindBy(css = "body > div:nth-child(2) > div:nth-child(12) > section:nth-child(1) >"
			+ " div:nth-child(5) > div:nth-child(1) > div:nth-child(1)")
	private WebElement companyButton;
	
	@FindBy(xpath = "//a[normalize-space()='Transactions']")
	private WebElement tranceButton;
	
	
	public WebElement getTxtusername() {
		return txtusername;
	}


	public WebElement getClkLogin() {
		return clkLogin;
	}

	
	public WebElement getCookiesButton() {
		return cookiesButton;
	}
	
	
	public WebElement getCompanyButton() {
		return companyButton;
	}
	
	
	public WebElement getTranceButton() {
		return tranceButton;
	}
	
	public void reciverLogin(String username) {

		insertText(getTxtusername(), username);
		clickButton(getClkLogin());
		sleep(20000);
		clickButton(cookiesButton);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", getCompanyButton());
		clickButton(tranceButton);

	}

}
