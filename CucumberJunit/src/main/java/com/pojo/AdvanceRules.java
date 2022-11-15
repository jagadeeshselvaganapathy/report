package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AdvanceRules extends BaseClass {
	
	public AdvanceRules() {
     PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//a[normalize-space()='Transactions']")
	private WebElement tranceButton;
	
	@FindBy(css = "div[class='VASPDropdownProfile__DropdownToggleDiv-sc-1yeaz8c-3 llStvs'] div[class='VASPDropdownProfile__TopCompanyNameDiv-sc-1yeaz8c-2 VrzXb']")
	private WebElement canadianCa;
	
	@FindBy(xpath = "//a[normalize-space()='Rules']")
	private WebElement rule;
	
	@FindBy(xpath = "//input[@value='advanced']")
	private WebElement advanceRule;
	
	@FindBy(xpath = "(//div[contains(@class,'css-jrhyj0')])[1]")
	private WebElement ifButton;
	
	@FindBy(xpath = "(//input[@id='react-select-select-input'])[2]")
	private WebElement isButton;
	
	@FindBy(xpath = "//div[contains(text(),'Send to inbox (for manual review)')]")
	private WebElement advanceApproval;
	
	@FindBy(xpath = "//button[@class='LoadingButton__Button-sc-15s5hsk-0 dipzYW']")
	private WebElement save;

	public WebElement getTranceButton() {
		return tranceButton;
	}

	public WebElement getCanadianCa() {
		return canadianCa;
	}

	public WebElement getRule() {
		return rule;
	}

	public WebElement getAdvanceRule() {
		return advanceRule;
	}

	public WebElement getIfButton() {
		return ifButton;
	}

	public WebElement getIsButton() {
		return isButton;
	}

	public WebElement getAdvanceApproval() {
		return advanceApproval;
	}

	public WebElement getSave() {
		return save;
	}

	//public WebElement getCompanyButton() {
		//return companyButton;
	//}
	
	



}
