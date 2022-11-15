package com.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pojo.BasicRules;
import com.pojo.Create_New_Transaction;
import com.pojo.LoginPage;
import com.pojo.ReceiverApproval;
import com.pojo.RulesSetting;
import com.pojo.TransactionApproval;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicRuleTransaction extends BaseClass{
	

	@Given("user goes  Notabene application")
	public void user_goes_to_Notabene_application() {
     
		
	}

	@Given("user login  valid credentials")
	public void user_login_with_valid_credentials() throws InterruptedException {
		
		LoginPage l = new LoginPage();
		l.login("jagadeesh@qaoncloud.com");
		Thread.sleep(5000); 

	}
	
	@Then("user set rules")
	public void user_set_rules() throws InterruptedException {
		
		BasicRules n = new BasicRules();
		WebElement getCompanyButton = driver.findElement(By.xpath("//text[normalize-space()='Canadian']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCompanyButton);
	//	n.getCompanyButton().click();
		Thread.sleep(3000);
		n.getTranceButton().click();
		Thread.sleep(3000);
		n.getCanadianCa().click();
		Thread.sleep(3000);
		n.getRule().click();
		Thread.sleep(3000); 
		n.getNoRule().click();
		Thread.sleep(3000);
		n.getSave().click();
		Thread.sleep(3000);
		navigate("https://qa.eu.notabene.dev/dashboard/outgoing");
		Thread.sleep(3000);
	
	}
	
	@When("user do basic rule transaction with minimum ammount")
	public void user_do_basic_rule_transaction_with_minimum_ammount() throws InterruptedException, AWTException {
		
		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction("50", "ETC", "name", "name2", "name3", "address", "city", "name4", "address2", "address3");
		Thread.sleep(8000);

	}

	
	

	@When("user do basic rule transaction with required ammount")
	public void user_do_basic_rule_transaction_with_required_ammount() throws InterruptedException, AWTException {
		
		RulesSetting r = new RulesSetting();
		r.settingRules("5000", "ETC", "name", "name2", "name3", "address", "city", "name4", "address2", "address3");
		Thread.sleep(3000);

	
	}
	
	@When("user approve  transaction")
	public void user_approve_the_transaction() throws InterruptedException {
		
		TransactionApproval t = new TransactionApproval();
		t.getApproval().click();
		Thread.sleep(3000);
		t.getApprovalAndStore().click();
		Thread.sleep(5000);

	}

	@When("user accept the transaction")
	public void user_accept_transaction() throws InterruptedException {
		
		ReceiverApproval r = new ReceiverApproval();
		r.getCompany().click();
		Thread.sleep(3000);
		r.getTranceButton().click();
		Thread.sleep(3000);
		r.getApproval().click();
		Thread.sleep(3000);
		r.getConfirm().click();
		Thread.sleep(3000);

}
}
