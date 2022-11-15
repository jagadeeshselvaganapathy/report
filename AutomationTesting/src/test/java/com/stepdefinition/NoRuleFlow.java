package com.stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;
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

public class NoRuleFlow extends BaseClass{
	
	@Given("user goes to Notabene")
	public void user_goes_to_Notabene() {

	
	}

	@Given("user with valid credentials login")
	public void user_with_valid_credentials_login() throws InterruptedException {

		LoginPage l = new LoginPage();
		l.login("jagadeesh@qaoncloud.com");
		Thread.sleep(5000);
	
	}

	@When("user set the rules for transaction")
	public void user_set_the_rules_for_transaction() throws InterruptedException {
		
		NoRules n = new NoRules();
		WebElement getCompanyButton = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(12) > section:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1)"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCompanyButton);
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

	@Then("user do transaction")
	public void user_do_transaction() throws AWTException, InterruptedException {
		
		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction("500", "ETC", "name", "name2", "name3", "address", "city", "name4", "address2", "address3");

	
	}

	@Then("user cancel transaction")
	public void user_cancel_transaction() throws InterruptedException {
		
		driver.findElement(By.xpath("(//button[@title='Cancel transaction'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='Cancel this transaction'])[1]")).click();
		Thread.sleep(3000);

	
	}

	@Then("user do transaction with no rule with low amount")
	public void user_do_transaction_with_no_rule_with_low_amount() throws AWTException, InterruptedException {
		
		WebElement getCompanyButton = driver.findElement(By.xpath("//text[normalize-space()='Canadian']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCompanyButton);
		
		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction("3", "ETC", "name", "name2", "name3", "address", "city", "name4", "address2", "address3");

	
	}

	@Then("user check in dashboard")
	public void user_check_in_dashboard() throws InterruptedException {

		WebElement element = driver.findElement(By.xpath("(//div[@class=\"TransactionRow__AssetText-aiz25-13 cbiOCx\"])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println(text
				);
		boolean contain = text.contains("3");
		if (text.equals("3")) {
			driver.findElement(By.xpath("(//button[@title='Accept incoming transaction'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[normalize-space()='Confirm'])[1]")).click();
		} else {
			System.out.println("assertion not verified");
			driver.quit();

		}
		
		
		
		
	
	}

	@Then("user do the transaction")
	public void user_do_the_transaction() throws AWTException, InterruptedException {
		
		WebElement getCompanyButton = driver.findElement(By.xpath("//text[normalize-space()='Canadian']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCompanyButton);
		
		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction("500", "ETC", "name", "name2", "name3", "address", "city", "name4", "address2", "address3");

	
	}

	@Then("In dashboard user approve the transaction")
	public void in_dashboard_user_approve_the_transaction() throws InterruptedException {

		TransactionApproval t = new TransactionApproval();
		t.getApproval().click();
		Thread.sleep(3000);
		t.getApprovalAndStore().click();
		Thread.sleep(5000);
	
	}

	@Then("In dashboard Beneificiar accept the transaction")
	public void in_dashboard_Beneificiar_accept_the_transaction() throws InterruptedException {
		
		ReceiverApproval r = new ReceiverApproval();
		WebElement getCompanyButton = driver.findElement(By.xpath("//text[normalize-space()='QAonCloud US']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCompanyButton);
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
