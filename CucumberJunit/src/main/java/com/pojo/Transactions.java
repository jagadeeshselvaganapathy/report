package com.pojo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Transactions extends BaseClass {
	
public Transactions() {
	 PageFactory.initElements(driver, this);
}
		
@FindBy(css = "tbody tr:nth-child(1) td:nth-child(9) div:nth-child(1)"
		+ " div:nth-child(1) div:nth-child(2) button:nth-child(1)")
private WebElement checkButton;

@FindBy(xpath = "//button[normalize-space()='Approve and store data']")
private WebElement complteTransaction;

public WebElement getCheckButton() {
	return checkButton;
}

public WebElement getComplteTransaction() {
	return complteTransaction;
}


private void transacComplt() throws InterruptedException {
    Thread.sleep(8000);
	clickButton(getCheckButton());
	Thread.sleep(8000);
	clickButton(getComplteTransaction());
	Thread.sleep(8000);
}
		
		
	}





