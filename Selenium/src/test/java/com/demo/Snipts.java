package com.demo;

public class Snipts{
	
	private void emp1() {

		System.out.println("yes");
	}
	
	public static void main(String[] args) {
		
		Snipts s = new Snipts();
				s.emp1();
	}

/*public void getOTP(Accountstestdata accountstestdata) throws Throwable {
	int num = 1;
	logger.info(accountstestdata.getEmailAddress1());
	String[] mailbox = accountstestdata.getEmailAddress1().split("@");
	String url = mailinatorURL.concat(mailbox[0]).concat(mailinatorURLpart2);
	driver_chrome = launchBrowser();
	driver_chrome.get(url);
	WebDriverWait wait = new WebDriverWait(driver_chrome, 150);
	wait.until(ExpectedConditions.visibilityOf(driver_chrome.findElement(By.xpath(dismissCookie))));
	driver_chrome.findElement(By.xpath(dismissCookie)).click();
	wait.until(ExpectedConditions.visibilityOf(driver_chrome.findElement(By.xpath(minuteago))));
	List<WebElement> mails = driver_chrome.findElements(By.xpath(minuteago));
	int j = 0;
	if (mails.size() == 0) {
		do {
			mails = driver_chrome.findElements(By.xpath(minuteago));
			j++;
		} while ((mails.size() > 0) && (j < 9));
	}
	for (int i = 1; i <= mails.size(); i++) {
		String minutues = driver_chrome.findElement(By.xpath("(" + minuteago + ")[" + i + "]")).getText();
		String[] min = minutues.split(" ");
		if (!((min[0].equalsIgnoreCase("moments")) | (min[0].equalsIgnoreCase("minute"))
				| min[0].equalsIgnoreCase("minutes"))) {
			if (((Integer.valueOf(min[0]) < 8))) {
				num = i;
				break;
			}
		} else if ((min[0].equalsIgnoreCase("moments")) | (min[0].equalsIgnoreCase("minute"))
				| (min[0].equalsIgnoreCase("minutes"))) {
			num = i;
			break;
		}
	}
	mailverificationCde = mailverificationCde.replaceAll("Z", String.valueOf(num));
	driver_chrome.findElement(By.xpath(mailverificationCde)).click();
	driver_chrome.switchTo().frame(mailBdyFrameName);
	Boolean flag = driver_chrome.findElements(By.xpath(verifCde)).size() != 0;
	if (!flag) {
		do {
			flag = driver_chrome.findElements(By.xpath(verifCde)).size() != 0;
		} while (!flag);
	}
	String otptemp = driver_chrome.findElement(By.xpath(verifCde)).getText();
	String[] actualOTP = otptemp.split(":");
	OTP = actualOTP[1];
	quitBrowser(driver_chrome);*/
}