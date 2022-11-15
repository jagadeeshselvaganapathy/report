$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/TX_01.feature");
formatter.feature({
  "name": "validating the notabene transaction by automation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "validating the transaction with no rule",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "orginator goes to application Notabene",
  "keyword": "Given "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_goes_to_application_Notabene()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "orginator with valid credentials they login",
  "keyword": "When "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_with_valid_credentials_they_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "orginator set the norule for transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_set_the_norule_for_transaction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "orginator do transaction with below threshhold value",
  "keyword": "When "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_do_transaction_with_below_threshhold_value()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: target frame detached\n  (failed to check if window was closed: disconnected: Unable to receive message from renderer)\n  (Session info: chrome\u003d107.0.5304.88)\nBuild info: version: \u00274.1.3\u0027, revision: \u00277b1ebf28ef\u0027\nSystem info: host: \u0027DCKAQOC-038\u0027, ip: \u0027192.168.1.131\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [090e31919e44e1eb584b43125ddb63e4, findElement {using\u003dxpath, value\u003d//a[normalize-space()\u003d\u0027Go to dashboard\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.88, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\DCKLP-~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:59129}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:59129/devtoo..., se:cdpVersion: 107.0.5304.88, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 090e31919e44e1eb584b43125ddb63e4\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:567)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:385)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:377)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat com.base.BaseClass.clickButton(BaseClass.java:49)\r\n\tat com.pojo.Create_New_Transaction.newTransaction(Create_New_Transaction.java:317)\r\n\tat com.stepdefinition.NoRuleSingleFlow.orginator_do_transaction_with_below_threshhold_value(NoRuleSingleFlow.java:69)\r\n\tat ✽.orginator do transaction with below threshhold value(file:src/test/resources/Features/TX_01.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "orginator check the inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_check_the_inbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator do transaction with valid amount",
  "keyword": "When "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_do_transaction_with_valid_amount()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator cancel the transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_cancel_the_transaction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator do transaction with valid amount secound time",
  "keyword": "When "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_do_transaction_with_valid_amount_secound_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator approve transaction from Inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_approve_transaction_from_Inbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator cancel transaction from All",
  "keyword": "And "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_cancel_transaction_from_All()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator do transaction with valid amount third time",
  "keyword": "When "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_do_transaction_with_valid_amount_third_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator approve transaction from Inbox on third time",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_approve_transaction_from_Inbox_on_third_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "move from orginator to benificinary.........",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.move_from_orginator_to_benificinary()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "benificinary reject the address",
  "keyword": "And "
});
formatter.match({
  "location": "NoRuleSingleFlow.benificinary_reject_the_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "move from benificinary to orginator....",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.move_from_benificinary_to_orginator()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator do transaction with valid amount fourth time",
  "keyword": "When "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_do_transaction_with_valid_amount_fourth_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator approve transaction from Inbox on fourth time",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_approve_transaction_from_Inbox_on_fourth_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "move from orginator to benificinary secound time..........",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.move_from_orginator_to_benificinary_secound_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "benificinary accept the address",
  "keyword": "And "
});
formatter.match({
  "location": "NoRuleSingleFlow.benificinary_accept_the_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "benificinary reject transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.benificinary_reject_transaction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "move from benificinary to orginator secound time....",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.move_from_benificinary_to_orginator_secound_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator do transaction with valid amount fifth time",
  "keyword": "When "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_do_transaction_with_valid_amount_fifth_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator approve transaction from Inbox on fifth time",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_approve_transaction_from_Inbox_on_fifth_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "move from orginator to benificinary third time..........",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.move_from_orginator_to_benificinary_third_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "benificinary accept the address",
  "keyword": "And "
});
formatter.match({
  "location": "NoRuleSingleFlow.benificinary_accept_the_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "benificinary accept transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.benificinary_accept_transaction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "move from benificinary to orginator to change into basic",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.move_from_benificinary_to_orginator_to_change_into_basic()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator set the basic rule for transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_set_the_basic_rule_for_transaction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator do transaction with below threshhold value in basic rule",
  "keyword": "When "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_do_transaction_with_below_threshhold_value_in_basic_rule()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator checks inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_checks_inbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator do transaction with valid amount with basic rule",
  "keyword": "When "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_do_transaction_with_valid_amount_with_basic_rule()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator cancel the transaction in All",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_cancel_the_transaction_in_All()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator do transaction with valid amount secound time with basic rule",
  "keyword": "When "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_do_transaction_with_valid_amount_secound_time_with_basic_rule()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "move from orginator to benificinary for transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.move_from_orginator_to_benificinary_for_transaction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "benificinary reject the address from inbox with basic rule",
  "keyword": "And "
});
formatter.match({
  "location": "NoRuleSingleFlow.benificinary_reject_the_address_from_inbox_with_basic_rule()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "move from benificinary to orginator to transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.move_from_benificinary_to_orginator_to_transaction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "orginator do transaction with valid amount third time with basic rule",
  "keyword": "When "
});
formatter.match({
  "location": "NoRuleSingleFlow.orginator_do_transaction_with_valid_amount_third_time_with_basic_rule()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "move from orginator to benificinary secound time for transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.move_from_orginator_to_benificinary_secound_time_for_transaction()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "benificinary accept the amount",
  "keyword": "And "
});
formatter.match({
  "location": "NoRuleSingleFlow.benificinary_accept_the_amount()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "beneificier do transaction with valid amount",
  "keyword": "Then "
});
formatter.match({
  "location": "NoRuleSingleFlow.beneificier_do_transaction_with_valid_amount()"
});
formatter.result({
  "status": "skipped"
});
