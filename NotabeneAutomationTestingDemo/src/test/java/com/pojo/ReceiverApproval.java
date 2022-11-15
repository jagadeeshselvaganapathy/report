package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ReceiverApproval extends BaseClass {
	public ReceiverApproval() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//text[normalize-space()='QAonCloud US']")
	private WebElement company;
	
	@FindBy(xpath = "//a[normalize-space()='Transactions']")
	private WebElement tranceButton;
	
	@FindBy(xpath = "(//button[@title='Accept incoming transaction'])[1]")
	private WebElement approval;
	
	@FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
	private WebElement confirm;	

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTranceButton() {
		return tranceButton;
	}

	public WebElement getApproval() {
		return approval;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	
	
	

}
