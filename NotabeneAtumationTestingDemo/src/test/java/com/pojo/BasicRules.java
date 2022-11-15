package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BasicRules extends BaseClass{
	public BasicRules() {
		PageFactory.initElements(driver, this);
		}
	
	//@FindBy(xpath = "//text[normalize-space()='Canadian']")
	//private WebElement companyButton;
	
	@FindBy(xpath = "//a[normalize-space()='Transactions']")
	private WebElement tranceButton;
	
	@FindBy(css = "div[class='VASPDropdownProfile__DropdownToggleDiv-sc-1yeaz8c-3 llStvs'] div[class='VASPDropdownProfile__TopCompanyNameDiv-sc-1yeaz8c-2 VrzXb']")
	private WebElement canadianCa;
	
	@FindBy(xpath = "//a[normalize-space()='Rules']")
	private WebElement rule;
	
	@FindBy(xpath = "//input[@value='basic']")
	private WebElement noRule;
	
	@FindBy(xpath = "//button[@class='LoadingButton__Button-sc-15s5hsk-0 dipzYW']")
	private WebElement save;

	//public WebElement getCompanyButton() {
		//return companyButton;
	//}

	public WebElement getTranceButton() {
		return tranceButton;
	}

	public WebElement getCanadianCa() {
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
	}
		


	

}
