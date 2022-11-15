package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pojo.Create_New_Transaction;
import com.pojo.LoginPage;
import com.pojo.NoRules;
import com.pojo.ReceiverApproval;
import com.pojo.RulesSetting;
import com.pojo.TransactionApproval;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class NoRuleSingleFlow extends BaseClass {

	@Given("orginator goes to application Notabene")
	public void orginator_goes_to_application_Notabene() {

	}

	@When("orginator with valid credentials they login")
	public void orginator_with_valid_credentials_they_login() throws InterruptedException, IOException {

		driver.manage().window().maximize();
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"));
		
	//	WebElement getCompanyButton = driver.findElement(By.xpath("(//text[normalize-space()='Canadian'])[1]"));
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].click()", getCompanyButton);

		Thread.sleep(5000);

	}

	@Then("orginator set the norule for transaction")
	public void orginator_set_the_norule_for_transaction() throws InterruptedException {

		NoRules n = new NoRules();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		WebElement getCompanyButton = driver.findElement(By.xpath("(//text[normalize-space()='Canadian'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getCompanyButton);
		Thread.sleep(3000);
		n.getTranceButton().click();
		Thread.sleep(8000);
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

	@When("orginator do transaction with below threshhold value")
	public void orginator_do_transaction_with_below_threshhold_value()
			throws AWTException, InterruptedException, IOException {

		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction(valueFromProperty("amount1"), valueFromProperty("type"), valueFromProperty("orgiAdd"),
				valueFromProperty("beneAdd"), "testPro1", "testPro1", "testPro1", "testPro1", "testPro1", "testPro1");

		Thread.sleep(3000);
	}

	@Then("orginator check the inbox")
	public void orginator_check_the_inbox() throws InterruptedException {

		driver.findElement(By.xpath("//a[normalize-space()='Transactions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='All']")).click();
		Thread.sleep(5000);

		WebElement element = driver
				.findElement(By.xpath("(//div[@class='TransactionRow__AssetText-aiz25-13 cbiOCx'])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println(text);
		boolean contain = text.contains("3");
		if (text.equals("0.4500")) {
			System.out.println("Assertion got verified");
		} else {
			System.out.println("assertion not verified");
			driver.close();

		}

		Thread.sleep(3000);

	}

	@When("orginator do transaction with valid amount")
	public void orginator_do_transaction_with_valid_amount() throws AWTException, InterruptedException, IOException {

		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction(valueFromProperty("amount2"), valueFromProperty("type"), valueFromProperty("orgiAdd2"),
				valueFromProperty("beneAdd2"), "testPro2", "testPro2", "testPro2", "testPro2", "testPro2", "testPro2");
		Thread.sleep(3000);

	}

	@Then("orginator cancel the transaction")
	public void orginator_cancel_the_transaction() throws InterruptedException {

		WebElement element = driver
				.findElement(By.xpath("(//div[@class='TransactionRow__AssetText-aiz25-13 cbiOCx'])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println(text);
		boolean contain = text.contains("3");
		if (text.equals("1.4000")) {
			System.out.println("Assertion got verified");

			driver.findElement(By.xpath("(//button[@title='Cancel transaction'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[normalize-space()='Cancel this transaction'])[1]")).click();
			Thread.sleep(3000);

		} else {
			System.out.println("assertion not verified");
			driver.close();

		}

		Thread.sleep(3000);

	}

	@When("orginator do transaction with valid amount secound time")
	public void orginator_do_transaction_with_valid_amount_secound_time()
			throws AWTException, InterruptedException, IOException {

		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction(valueFromProperty("amount2"), valueFromProperty("type"), valueFromProperty("orgiAdd3"),
				valueFromProperty("beneAdd3"), "testPro3", "testPro3", "testPro3", "testPro3", "testPro3", "testPro3");
		Thread.sleep(3000);

	}

	@Then("orginator approve transaction from Inbox")
	public void orginator_approve_transaction_from_Inbox() throws InterruptedException {

		TransactionApproval t = new TransactionApproval();
		t.getApproval().click();
		Thread.sleep(3000);
		t.getApprovalAndStore().click();
		Thread.sleep(5000);

	}

	@Then("orginator cancel transaction from All")
	public void orginator_cancel_transaction_from_All() throws InterruptedException {

		driver.findElement(By.xpath("//a[normalize-space()='All']")).click();
		Thread.sleep(5000);

		WebElement element = driver
				.findElement(By.xpath("(//div[@class='TransactionRow__AssetText-aiz25-13 cbiOCx'])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println(text);
		boolean contain = text.contains("3");
		if (text.equals("1.4000")) {
			System.out.println("Assertion got verified");

			driver.findElement(By.xpath("(//button[@title='Cancel transaction'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[normalize-space()='Cancel this transaction'])[1]")).click();
			Thread.sleep(3000);

		} else {
			System.out.println("assertion not verified");
			driver.close();

		}

		Thread.sleep(3000);

	}

	@When("orginator do transaction with valid amount third time")
	public void orginator_do_transaction_with_valid_amount_third_time()
			throws AWTException, InterruptedException, IOException {

		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction(valueFromProperty("amount2"), valueFromProperty("type"), valueFromProperty("orgiAdd4"),
				valueFromProperty("beneAdd4"), "testPro4", "testPro4", "testPro4", "testPro4", "testPro4", "testPro4");
		Thread.sleep(3000);

	}

	@Then("orginator approve transaction from Inbox on third time")
	public void orginator_approve_transaction_from_Inbox_on_third_time() throws InterruptedException {

		TransactionApproval t = new TransactionApproval();
		t.getApproval().click();
		Thread.sleep(3000);
		t.getApprovalAndStore().click();
		Thread.sleep(5000);

	}

	@Then("move from orginator to benificinary.........")
	public void move_from_orginator_to_benificinary() throws InterruptedException {

		driver.findElement(By.xpath("(//span[@class='localize-ignore'][normalize-space()='Canadian CA'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='QAonCloud US US'])[1]")).click();
		Thread.sleep(5000);
		NoRules n = new NoRules();
		n.getTranceButton().click();
		Thread.sleep(8000);
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

	@Then("benificinary reject the address")
	public void benificinary_reject_the_address() throws InterruptedException {

		driver.findElement(By.xpath("//a[normalize-space()='Transactions']")).click();
		Thread.sleep(3000);

		WebElement element = driver
				.findElement(By.xpath("(//div[@class='TransactionRow__AssetText-aiz25-13 cbiOCx'])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println(text);
		boolean contain = text.contains("3");
		if (text.equals("1.4000")) {
			System.out.println("Assertion got verified");
			driver.findElement(By.xpath("(//button[@title='Decline incoming transaction'])[1]")).click();
			driver.findElement(By.xpath("(//button[normalize-space()='Reject'])[1]")).click();
			Thread.sleep(3000);
			WebElement elementx = driver
					.findElement(By.xpath("//input[@value='The blockchain address doesn’t belong to my company']"));
			elementx.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//input[@value='I don’t know if this blockchain address belongs to my company']"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='I don’t want to receive this Travel Rule transfer']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[normalize-space()='Reject'])[1]")).click();
			Thread.sleep(3000);
		} else {
			System.out.println("assertion not verified");
			driver.close();

		}

	}

	@Then("move from benificinary to orginator....")
	public void move_from_benificinary_to_orginator() throws InterruptedException {

		driver.findElement(By.xpath("(//span[@class='localize-ignore'][normalize-space()='QAonCloud US US'])[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='Canadian CA'])[1]")).click();
		Thread.sleep(5000);

	}

	@When("orginator do transaction with valid amount fourth time")
	public void orginator_do_transaction_with_valid_amount_fourth_time()
			throws AWTException, InterruptedException, IOException {

		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction(valueFromProperty("amount2"), valueFromProperty("type"), valueFromProperty("orgiAdd5"),
				valueFromProperty("beneAdd5"), "testPro5", "testPro5", "testPro5", "testPro5", "testPro5", "testPro5");
		Thread.sleep(3000);

	}

	@Then("orginator approve transaction from Inbox on fourth time")
	public void orginator_approve_transaction_from_Inbox_on_fourth_time() throws InterruptedException {

		TransactionApproval t = new TransactionApproval();
		Thread.sleep(3000);
		t.getApproval().click();
		Thread.sleep(3000);
		t.getApprovalAndStore().click();
		Thread.sleep(5000);

	}

	@Then("move from orginator to benificinary secound time..........")
	public void move_from_orginator_to_benificinary_secound_time() throws InterruptedException {

		driver.findElement(By.xpath("(//span[@class='localize-ignore'][normalize-space()='Canadian CA'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='QAonCloud US US'])[1]")).click();
		Thread.sleep(5000);

	}

	@Then("benificinary accept the address")
	public void benificinary_accept_the_address() throws InterruptedException {

		ReceiverApproval r = new ReceiverApproval();
		r.getTranceButton().click();
		Thread.sleep(3000);
		r.getApproval().click();
		Thread.sleep(3000);
		r.getConfirm().click();
		Thread.sleep(3000);
		WebElement elementw = driver.findElement(By.xpath("(//button[normalize-space()='Cancel'])[1]"));
		elementw.click();

		Thread.sleep(5000);

	}

	@Then("benificinary reject transaction")
	public void benificinary_reject_transaction() throws InterruptedException {

		WebElement elementw = driver.findElement(By.xpath("//a[normalize-space()='All']"));
		JavascriptExecutor jv = (JavascriptExecutor) driver;
		jv.executeScript("arguments[0].click()", elementw);
		Thread.sleep(5000);
		WebElement elementx = driver.findElement(By.xpath("(//button[@title='Decline incoming transaction'])[1]"));
		jv.executeScript("arguments[0].click()", elementx);
		WebElement elementv = driver.findElement(
				By.xpath("(//button[@class='Text-var2ts-0 Button__Clickable-sc-1r4hlp6-1 Button-sc-1r4hlp6-2 "
						+ "Button__ButtonLink-sc-1r4hlp6-3 dbjaSA fARrfR ljKBeO has-text-danger is-text button'])[1]"));
		elementv.click();
		Thread.sleep(3000);

	}

	@Then("move from benificinary to orginator secound time....")
	public void move_from_benificinary_to_orginator_secound_time() throws InterruptedException {

		driver.findElement(By.xpath("(//span[@class='localize-ignore'][normalize-space()='QAonCloud US US'])[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='Canadian CA'])[1]")).click();
		Thread.sleep(5000);

	}

	@When("orginator do transaction with valid amount fifth time")
	public void orginator_do_transaction_with_valid_amount_fifth_time() throws AWTException, InterruptedException, IOException {

		Create_New_Transaction c = new Create_New_Transaction();
		//c.newTransaction(valueFromProperty("amount2"), valueFromProperty("type"), valueFromProperty("orgiAdd6"),
		//valueFromProperty("beneAdd6"), "testPro6", "testPro6", "testPro6", "testPro6");
c.newTransaction(valueFromProperty("amount2"), valueFromProperty("type"), valueFromProperty("orgiAdd6"), valueFromProperty("beneAdd6"), "name3", "address", "city", "name4", "address2", "address3");
		Thread.sleep(3000);

	}

	@Then("orginator approve transaction from Inbox on fifth time")
	public void orginator_approve_transaction_from_Inbox_on_fifth_time() throws InterruptedException {

		TransactionApproval t = new TransactionApproval();
		t.getApproval().click();
		Thread.sleep(3000);
		t.getApprovalAndStore().click();
		Thread.sleep(5000);

	}

	@Then("move from orginator to benificinary third time..........")
	public void move_from_orginator_to_benificinary_third_time() throws InterruptedException {

		driver.findElement(By.xpath("(//span[@class='localize-ignore'][normalize-space()='Canadian CA'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='QAonCloud US US'])[1]")).click();
		Thread.sleep(5000);

	}

	@Then("benificinary accept transaction")
	public void benificinary_accept_transaction() throws InterruptedException {

		ReceiverApproval r = new ReceiverApproval();
		r.getTranceButton().click();
		Thread.sleep(3000);
		r.getApproval().click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='Accept and store data'])[1]")).click();
		Thread.sleep(3000);

	}

	@Then("move from benificinary to orginator to change into basic")
	public void move_from_benificinary_to_orginator_to_change_into_basic() throws InterruptedException {

		driver.findElement(By.xpath("(//span[@class='localize-ignore'][normalize-space()='QAonCloud US US'])[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='Canadian CA'])[1]")).click();
		Thread.sleep(5000);

	}

	@Then("orginator set the basic rule for transaction")
	public void orginator_set_the_basic_rule_for_transaction() throws InterruptedException {

		RulesSetting r = new RulesSetting();

		r.getCanadianCa().click();
		Thread.sleep(3000);
		r.getRule().click();
		Thread.sleep(3000);
		r.getBasicRule().click();
		Thread.sleep(3000);
		r.getSave().click();
		Thread.sleep(3000);

		navigate("https://qa.eu.notabene.dev/dashboard/outgoing");

	}

	@When("orginator do transaction with below threshhold value in basic rule")
	public void orginator_do_transaction_with_below_threshhold_value_in_basic_rule()
			throws AWTException, InterruptedException, IOException {

		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction(valueFromProperty("amount1"), valueFromProperty("type"), valueFromProperty("basicOrgiAdd"),
				valueFromProperty("basicBeneAdd"), "testnote1", "testnote1", "testnote1", "testnote1", "testnote1",
				"testnote1");
		Thread.sleep(3000);

	}

	@Then("orginator checks inbox")
	public void orginator_checks_inbox() throws InterruptedException {

		driver.findElement(By.xpath("//a[normalize-space()='Transactions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='All']")).click();
		Thread.sleep(5000);

		WebElement element = driver
				.findElement(By.xpath("(//div[@class='TransactionRow__AssetText-aiz25-13 cbiOCx'])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println(text);
		boolean contain = text.contains("3");
		if (text.equals("0.4500")) {
			System.out.println("Assertion got verified");
		} else {
			System.out.println("assertion not verified");
			driver.close();

		}

		Thread.sleep(3000);

	}

	@When("orginator do transaction with valid amount with basic rule")
	public void orginator_do_transaction_with_valid_amount_with_basic_rule()
			throws AWTException, InterruptedException, IOException {

		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction(valueFromProperty("amount2"), valueFromProperty("type"), valueFromProperty("basicOrgiAdd2"),
				valueFromProperty("basicBeneAdd2"), "testnote2", "testnote2", "testnote2", "testnote2", "testnote2",
				"testnote2");
		Thread.sleep(3000);

	}

	@Then("orginator cancel the transaction in All")
	public void orginator_cancel_the_transaction_in_All() throws InterruptedException {

		driver.findElement(By.xpath("//a[normalize-space()='All']")).click();
		Thread.sleep(5000);

		WebElement element = driver
				.findElement(By.xpath("(//div[@class='TransactionRow__AssetText-aiz25-13 cbiOCx'])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println(text);
		boolean contain = text.contains("3");
		if (text.equals("1.4000")) {
			System.out.println("Assertion got verified");

			driver.findElement(By.xpath("(//button[@title='Cancel transaction'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[normalize-space()='Cancel this transaction'])[1]")).click();
			Thread.sleep(3000);

		} else {
			System.out.println("assertion not verified");
			driver.close();

		}

		Thread.sleep(3000);

	}

	@When("orginator do transaction with valid amount secound time with basic rule")
	public void orginator_do_transaction_with_valid_amount_secound_time_with_basic_rule()
			throws AWTException, InterruptedException, IOException {

		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction(valueFromProperty("amount2"), valueFromProperty("type"), valueFromProperty("basicOrgiAdd3"),
				valueFromProperty("basicBeneAdd3"), "testnote3", "testnote3", "testnote3", "testnote3", "testnote3",
				"testnote3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='All']")).click();
		Thread.sleep(5000);
		WebElement element = driver
				.findElement(By.xpath("(//div[@class='TransactionRow__AssetText-aiz25-13 cbiOCx'])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println(text);
		boolean contain = text.contains("3");
		if (text.equals("1.4000")) {
			System.out.println("Assertion got verified");

		} else {
			System.out.println("assertion not verified");
			driver.close();

		}

		Thread.sleep(3000);

	}

	@Then("move from orginator to benificinary for transaction")
	public void move_from_orginator_to_benificinary_for_transaction() throws InterruptedException {

		driver.findElement(By.xpath("(//span[@class='localize-ignore'][normalize-space()='Canadian CA'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='QAonCloud US US'])[1]")).click();
		Thread.sleep(5000);

	}

	@Then("benificinary reject the address from inbox with basic rule")
	public void benificinary_reject_the_address_from_inbox_with_basic_rule() throws InterruptedException {

		RulesSetting r = new RulesSetting();

		r.getCanadianCa().click();
		Thread.sleep(3000);
		r.getRule().click();
		Thread.sleep(3000);
		r.getBasicRule().click();
		Thread.sleep(3000);
		r.getSave().click();
		Thread.sleep(3000);

		navigate("https://qa.eu.notabene.dev/dashboard/outgoing");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='Transactions']")).click();
		Thread.sleep(3000);

		WebElement element = driver
				.findElement(By.xpath("(//div[@class='TransactionRow__AssetText-aiz25-13 cbiOCx'])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println(text);
		boolean contain = text.contains("3");
		if (text.equals("1.4000")) {
			System.out.println("Assertion got verified");
			driver.findElement(By.xpath("(//button[@title='Decline incoming transaction'])[1]")).click();
			driver.findElement(By.xpath("(//button[normalize-space()='Reject'])[1]")).click();
			Thread.sleep(3000);
			WebElement elementx = driver
					.findElement(By.xpath("//input[@value='The blockchain address doesn’t belong to my company']"));
			elementx.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//input[@value='I don’t know if this blockchain address belongs to my company']"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='I don’t want to receive this Travel Rule transfer']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[normalize-space()='Reject'])[1]")).click();
			Thread.sleep(3000);
		} else {
			System.out.println("assertion not verified");
			driver.close();

		}
		Thread.sleep(3000);

	}

	@Then("move from benificinary to orginator to transaction")
	public void move_from_benificinary_to_orginator_to_transaction() throws InterruptedException {

		driver.findElement(By.xpath("(//span[@class='localize-ignore'][normalize-space()='QAonCloud US US'])[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='Canadian CA'])[1]")).click();
		Thread.sleep(5000);

	}

	@When("orginator do transaction with valid amount third time with basic rule")
	public void orginator_do_transaction_with_valid_amount_third_time_with_basic_rule()
			throws AWTException, InterruptedException, IOException {

		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction(valueFromProperty("amount2"), valueFromProperty("type"), valueFromProperty("basicOrgiAdd4"),
				valueFromProperty("basicBeneAdd4"), "testnote4", "testnote4", "testnote4", "testnote4", "testnote4",
				"testnote4");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='All']")).click();
		Thread.sleep(5000);

		WebElement element = driver
				.findElement(By.xpath("(//div[@class='TransactionRow__AssetText-aiz25-13 cbiOCx'])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println(text);
		boolean contain = text.contains("3");
		if (text.equals("1.4000")) {
			System.out.println("Assertion got verified");
		} else {
			System.out.println("assertion not verified");
			driver.close();

		}

		Thread.sleep(3000);

	}

	@Then("move from orginator to benificinary secound time for transaction")
	public void move_from_orginator_to_benificinary_secound_time_for_transaction() throws InterruptedException {

		driver.findElement(By.xpath("(//span[@class='localize-ignore'][normalize-space()='Canadian CA'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='QAonCloud US US'])[1]")).click();
		Thread.sleep(5000);

	}

	@Then("benificinary accept the amount")
	public void benificinary_accept_the_amount() throws InterruptedException {

		ReceiverApproval r = new ReceiverApproval();
		r.getTranceButton().click();
		Thread.sleep(3000);
		r.getApproval().click();
		Thread.sleep(3000);
		r.getConfirm().click();
		Thread.sleep(3000);
		Thread.sleep(3000);

	}

	@Then("beneificier do transaction with valid amount")
	public void beneificier_do_transaction_with_valid_amount() throws AWTException, InterruptedException {

		Create_New_Transaction c = new Create_New_Transaction();
		c.newTransaction("1.52", "ETH", "testnote3", "testnote3", "testnote3", "testnote3", "testnote3", "testnote3",
				"testnote3", "testnote3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='All']")).click();
		Thread.sleep(5000);
		WebElement element = driver
				.findElement(By.xpath("(//div[@class='TransactionRow__AssetText-aiz25-13 cbiOCx'])[1]"));
		String text = element.getText();
		System.out.println(text);
		System.out.println(text);
		boolean contain = text.contains("3");
		Assert.assertEquals("verified", text, "200");
	/*	if (text.equals("1.4000")) {
			System.out.println("Assertion got verified");

		} else {
			System.out.println("assertion not verified");
			
			

		}*/

		Thread.sleep(3000);

	}

}
