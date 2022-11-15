package com.stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pojo.BasicRules;
import com.pojo.Create_New_Transaction;
import com.pojo.LoginPage;
import com.pojo.ReceiverApproval;
import com.pojo.TransactionApproval;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicRuleFlow extends BaseClass {
	
	@Given("user goes to application Notabene")
	public void user_goes_to_application_Notabene() {

	
	}

	@Given("user with valid credentials they login")
	public void user_with_valid_credentials_they_login() throws InterruptedException {
		

		LoginPage l = new LoginPage();
		l.login("jagadeesh@qaoncloud.com");
		Thread.sleep(5000);

	
	}

	@When("user set the basic rule for transaction")
	public void user_set_the_basic_rule_for_transaction() throws InterruptedException {
		
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

	@Then("user do transaction with it")
	public void user_do_transaction_with_it() throws AWTException, InterruptedException {

		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction("50", "ETC", "name", "name2", "name3", "address", "city", "name4", "address2", "address3");
		Thread.sleep(8000);
		
	
	}

	@Then("user cancel the transaction")
	public void user_cancel_the_transaction() throws InterruptedException {
		
		driver.findElement(By.xpath("(//button[@title='Cancel transaction'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='Cancel this transaction'])[1]")).click();
		Thread.sleep(3000);

	
	}

	@Then("user do transaction with basic rule with low amount")
	public void user_do_transaction_with_basic_rule_with_low_amount() throws AWTException, InterruptedException {
		
		WebElement getCompanyButton = driver.findElement(By.xpath("//text[normalize-space()='Canadian']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCompanyButton);
		
		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction("3", "ETC", "name", "name2", "name3", "address", "city", "name4", "address2", "address3");


	
	}

	@Then("user check in dashboard orginator")
	public void user_check_in_dashboard_orginator() {

		WebElement element = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
		String text = element.getText();
		boolean contains = text.contains("xyz");
		Assert.assertTrue("verify amount", contains);
	
	}

	@Then("user do the transaction with bsaic rule")
	public void user_do_the_transaction_with_bsaic_rule() throws AWTException, InterruptedException {
		

		WebElement getCompanyButton = driver.findElement(By.xpath("//text[normalize-space()='Canadian']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCompanyButton);
		
		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction("500", "ETC", "name", "name2", "name3", "address", "city", "name4", "address2", "address3");


	
	}

	@Then("In dashboard user will approve the transaction")
	public void in_dashboard_user_will_approve_the_transaction() throws InterruptedException {

		TransactionApproval t = new TransactionApproval();
		t.getApproval().click();
		Thread.sleep(3000);
		t.getApprovalAndStore().click();
		Thread.sleep(5000);
	
	}

	@Given("In dashboard Beneificiar will accept the transaction")
	public void in_dashboard_Beneificiar_will_accept_the_transaction() throws InterruptedException {
		
		ReceiverApproval r = new ReceiverApproval();
/*		WebElement getCompanyButton = driver.findElement(By.xpath("//text[normalize-space()='QAonCloud US']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCompanyButton);
*/		r.getCompany().click();
		Thread.sleep(3000);
		r.getTranceButton().click();
		Thread.sleep(3000);
		r.getApproval().click();
		Thread.sleep(3000);
		r.getConfirm().click();
		Thread.sleep(3000);


	
	}

}
