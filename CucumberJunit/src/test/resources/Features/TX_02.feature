
@tag1
Feature: validating the notabene transaction by automation process
  

  
  Scenario: validating the transaction with basic rule
    Given orginator goes application Notabene
    When orginator login with valid credentials
    Then orginator set the basic rule for transaction
    When orginator do transaction with below threshhold value in basic rule
    Then orginator checks inbox
    When orginator do transaction with valid amount with basic rule
    Then orginator cancel the transaction in All
    When orginator do transaction with valid amount secound time with basic rule
    Then move from orginator to benificinary------
    And benificinary reject the address from inbox with basic rule
    Then move from benificinary to orginator----
    When orginator do transaction with valid amount fourth time
    Then move from orginator to benificinary secound time--------
    And benificinary accept the amount
    
    