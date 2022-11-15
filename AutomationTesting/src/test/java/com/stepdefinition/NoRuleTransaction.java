package com.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pojo.Create_New_Transaction;
import com.pojo.LoginPage;
import com.pojo.NoRules;
import com.pojo.ReceiverApproval;
import com.pojo.TransactionApproval;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NoRuleTransaction extends BaseClass {
	
	@Given("user goes to Notabene application")
	public void user_goes_to_Notabene_application() {
     
		
	}

	@Given("user login with valid credentials")
	public void user_login_with_valid_credentials() throws InterruptedException {
		
		LoginPage l = new LoginPage();
		l.login("jagadeesh@qaoncloud.com");
		Thread.sleep(5000); 

	}
	
	@Then("user set the rules")
	public void user_set_the_rules() throws InterruptedException {

		NoRules n = new NoRules();
		WebElement getCompanyButton = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(12) > section:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1)"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCompanyButton);
	//	Thread.sleep(3000);
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

	@When("user no rule transaction")
	public void user_no_rule_transaction() throws AWTException, InterruptedException {
		
		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction("500", "ETC", "name", "name2", "name3", "address", "city", "name4", "address2", "address3");


	}

	@When("user approve the transaction")
	public void user_approve_the_transaction() throws InterruptedException {
		
		TransactionApproval t = new TransactionApproval();
		t.getApproval().click();
		Thread.sleep(3000);
		t.getApprovalAndStore().click();
		Thread.sleep(5000);

	}

	@When("user accept transaction")
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
