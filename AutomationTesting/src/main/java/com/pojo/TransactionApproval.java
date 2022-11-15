package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class TransactionApproval extends BaseClass{
	
	public TransactionApproval() {
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath = "(//button[@title='Approve transaction'])[1]")
	private WebElement approval;
	
	@FindBy(xpath = "(//button[normalize-space()='Approve and store data'])[1]")
	private WebElement approvalAndStore;

	public WebElement getApproval() {
		return approval;
	}

	public WebElement getApprovalAndStore() {
		return approvalAndStore;
	}
	
	
	
	
	

}
