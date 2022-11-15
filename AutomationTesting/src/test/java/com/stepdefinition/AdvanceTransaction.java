package com.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;
import com.pojo.AdvanceRules;
import com.pojo.Create_New_Transaction;
import com.pojo.LoginPage;
import com.pojo.TransactionApproval;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvanceTransaction extends BaseClass {
	
	@Given("user goes application Notabene")
	public void user_goes_application_Notabene() {
		
		

	
	}

	@Given("user valid credentials logIn")
	public void user_valid_credentials_logIn() throws InterruptedException {
		

		LoginPage l = new LoginPage();
		l.login("jagadeesh@qaoncloud.com");
		Thread.sleep(5000);

	
	}

	@Then("user set Advance rule vasp approve")
	public void user_set_Advance_rule_vasp_approve() throws InterruptedException {

		AdvanceRules a = new AdvanceRules();
		WebElement getCompanyButton = driver.findElement(By.xpath("//text[normalize-space()='Canadian']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCompanyButton);
		Thread.sleep(3000);
		a.getTranceButton().click();
		Thread.sleep(3000);
		a.getCanadianCa().click();
		Thread.sleep(3000);
		a.getRule().click();
		Thread.sleep(3000);
		//a.getAdvanceRule();
		Thread.sleep(3000);
		
		
		//a.getIfButton().click();
		Thread.sleep(3000);
		//a.getIsButton();
		Thread.sleep(3000);
		//a.getAdvanceApproval();
		Thread.sleep(3000);
		a.getSave();
		Thread.sleep(3000);
		navigate("https://qa.eu.notabene.dev/dashboard/outgoing");
		Thread.sleep(3000);
	}

	@When("user do Advance rule transaction")
	public void user_do_Advance_rule_transaction() throws AWTException, InterruptedException {
		
		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction("500", "ETC", "name", "name2", "name3", "address", "city", "name4", "address2", "address3");
		Thread.sleep(8000);

	
	}

	@When("user approve the transaction amount")
	public void user_approve_the_transaction_amount() throws InterruptedException {
     
		TransactionApproval t = new TransactionApproval();
		t.getApproval().click();
		Thread.sleep(3000);
		t.getApprovalAndStore().click();
		Thread.sleep(5000);
	
	}

	@Then("user set Advance rule vasp reject")
	public void user_set_Advance_rule_vasp_reject() {

	
	}

	@Then("user set Advance rule jurisdiction approve")
	public void user_set_Advance_rule_jurisdiction_approve() {

	
	}

	@Then("user set Advance rule jurisdiction reject")
	public void user_set_Advance_rule_jurisdiction_reject() {

	
	}



}

/*
@tag
Feature: Validating Advance rules module

  Scenario: Notabene Automation transaction with Advance rule
    Given user goes application Notabene
    And user valid credentials logIn
    Then user set Advance rule vasp approve
    When user do Advance rule transaction
    And user approve the transaction amount
    Then user set Advance rule vasp reject
    When user do Advance rule transaction
    And user approve the transaction amount
    Then user set Advance rule jurisdiction approve
    When user do Advance rule transaction
    And user approve the transaction amount
    Then user set Advance rule jurisdiction reject
    When user do Advance rule transaction
    And user approve the transaction amount

*/
