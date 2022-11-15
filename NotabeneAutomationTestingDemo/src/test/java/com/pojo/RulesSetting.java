package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class RulesSetting extends BaseClass{
	
	public RulesSetting() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div[class='VASPDropdownProfile__DropdownToggleDiv-sc-1yeaz8c-3 llStvs'] div[class='VASPDropdownProfile__TopCompanyNameDiv-sc-1yeaz8c-2 VrzXb']")
	private WebElement canadianCa;
	
	@FindBy(xpath = "//a[normalize-space()='Rules']")
	private WebElement rule;
	
	@FindBy(xpath = "//input[@value='basic']")
	private WebElement basicRule;
	
	@FindBy(xpath = "//button[@class='LoadingButton__Button-sc-15s5hsk-0 dipzYW']")
	private WebElement save;
	
	
/*	@FindBy(xpath = "//a[normalize-space()='Transactions']")
	private WebElement tranceButton;
	
	@FindBy(xpath = "//button[@class='CreateTransferButton__Button-sc-1ax3pep-0 fvObLB']")
	private WebElement createButton;
	
	@FindBy(xpath = "//input[@id='easy-transactionAmount']")
	private WebElement amount;

	@FindBy(xpath = "//select[@id='easy-transactionAsset']")
	private WebElement asset;

	@FindBy(xpath = "//input[@id='easy-txHash']")
	private WebElement transactionHash;

	@FindBy(xpath = "//input[@id='easy-originatorBlockchainAddress']")
	private WebElement orgAddress;

	@FindBy(xpath = "//input[@id='easy-beneficiaryBlockchainAddress']")
	private WebElement benefAddress;

	@FindBy(xpath = "//input[@name='checkOpportunisticCompliance']")
	private WebElement checkBox;
	
	@FindBy(xpath = "//input[@id='react-select-select-input']")
	private WebElement vaspType;
	
	@FindBy(xpath = "//input[@name='checkBeneficiaryNonCustodialWallet']")
	private WebElement checkBox2;

	@FindBy(xpath = "//input[@id='easy-originatorName']")
	private WebElement originatorName;
	
	@FindBy(css = "input[name='checkOriginatorAddress']")
	private WebElement originatorAddress;
	
	@FindBy(id = "easy-originatorAddressLine1")
	private WebElement originatorAddressLine1;
	
	@FindBy(id = "easy-originatorAddressCity")
	private WebElement originatorAddressCity;
	

	@FindBy(xpath = "//input[@id='easy-beneficiaryName']")
	private WebElement beneficiaryName;
	
	@FindBy(xpath = "//input[@name='checkBeneficiaryAddress']")
	private WebElement beneficiaryCheckBox;
	
	@FindBy(id = "easy-beneficiaryAddressLine1")
	private WebElement beneficiaryAddress;
	
	@FindBy(id = "easy-beneficiaryAddressCity")
	private WebElement beneficiaryCity;
	
	@FindBy(xpath = "(//button[normalize-space()='Create a transaction'])[1]")
	private WebElement clickButton;
	
	@FindBy(xpath = "//a[normalize-space()='Go to dashboard']")
	private WebElement dashBoard;


	*/

	
	public WebElement getCanadianCa() {
		return canadianCa;
	}





	public WebElement getRule() {
		return rule;
	}





	public WebElement getBasicRule() {
		return basicRule;
	}





	public WebElement getSave() {
		return save;
	}



/*

	public WebElement getTranceButton() {
		return tranceButton;
	}





	public WebElement getCreateButton() {
		return createButton;
	}





	public WebElement getAmount() {
		return amount;
	}





	public WebElement getAsset() {
		return asset;
	}





	public WebElement getTransactionHash() {
		return transactionHash;
	}





	public WebElement getOrgAddress() {
		return orgAddress;
	}





	public WebElement getBenefAddress() {
		return benefAddress;
	}





	public WebElement getCheckBox() {
		return checkBox;
	}





	public WebElement getVaspType() {
		return vaspType;
	}





	public WebElement getCheckBox2() {
		return checkBox2;
	}





	public WebElement getOriginatorName() {
		return originatorName;
	}





	public WebElement getOriginatorAddress() {
		return originatorAddress;
	}





	public WebElement getOriginatorAddressLine1() {
		return originatorAddressLine1;
	}





	public WebElement getOriginatorAddressCity() {
		return originatorAddressCity;
	}





	public WebElement getBeneficiaryName() {
		return beneficiaryName;
	}





	public WebElement getBeneficiaryCheckBox() {
		return beneficiaryCheckBox;
	}





	public WebElement getBeneficiaryAddress() {
		return beneficiaryAddress;
	}





	public WebElement getBeneficiaryCity() {
		return beneficiaryCity;
	}





	public WebElement getClickButton() {
		return clickButton;
	}





	public WebElement getDashBoard() {
		return dashBoard;
	}


*/


	public void settingRules(String amount, String type, String name, String name2, String name3,String address,String city,
			String name4,String address2, String address3) throws InterruptedException, AWTException {
		
		clickButton(getCanadianCa());
		Thread.sleep(4000);
		clickButton(getRule());
		Thread.sleep(4000);
		clickButton(getBasicRule());
		Thread.sleep(4000);
		clickButton(getSave());
		Thread.sleep(4000);

		navigate("https://qa.eu.notabene.dev/dashboard/outgoing");
/*		
		clickButton(tranceButton);
		clickButton(createButton);
		Thread.sleep(5000);
		insertText(getAmount(), amount);
		clickButton(getAsset());
		selectKey(getAsset(), type);
		insertText(getTransactionHash(), "et");
		insertText(getOrgAddress(), name);
		insertText(getBenefAddress(), name2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCheckBox());
		js.executeScript("arguments[0].scrollIntoView();", getVaspType());
		getVaspType().sendKeys("qaoncloud us");
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		
	//	js.executeScript("arguments[0].click();", getVaspType());
		//js.executeScript("arguments[0].value='Canada';", getVaspType());
		Thread.sleep(10000);

	//	Robot r = new Robot();
	//	r.keyPress(KeyEvent.VK_ENTER);
	//	r.keyRelease(KeyEvent.VK_ENTER);
	//vj.executeScript("arguments[0].click()", getCheckBox2());
		insertText(getOriginatorName(), name3);
		Thread.sleep(3000);
		//clickButton(getOriginatorAddress());
		js.executeScript("arguments[0].click()", getOriginatorAddress());
		Thread.sleep(3000);
		insertText(getOriginatorAddressLine1(), address);
		Thread.sleep(3000);
		insertText(getOriginatorAddressCity(), city);
		
		insertText(getBeneficiaryName(), name4);
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", getBeneficiaryCheckBox());
		Thread.sleep(2000);
		insertText(getBeneficiaryAddress(), address2);
		insertText(getBeneficiaryCity(), address3);
		
		js.executeScript("arguments[0].click()", getClickButton());
		Thread.sleep(5000);
		//clickButton(getRequestAccess());
		//clickButton(getCloseButton());
		//Thread.sleep(3000);
		//clickButton(getCloseButton2());
		//Thread.sleep(3000);
		//js.executeScript("arguments[0].click()", getClickButton2());
	//	Thread.sleep(3000);
		clickButton(getDashBoard());
*/
		
		
	}
	

}
