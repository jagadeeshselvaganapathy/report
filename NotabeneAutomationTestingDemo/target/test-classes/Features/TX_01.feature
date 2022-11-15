@tag
Feature: validating the notabene transaction by automation

  Scenario: validating the transaction with no rule
    Given orginator goes to application Notabene
    When orginator with valid credentials they login
    Then orginator set the norule for transaction
    When orginator do transaction with below threshhold value
    Then orginator check the inbox
    When orginator do transaction with valid amount
    Then orginator cancel the transaction
    When orginator do transaction with valid amount secound time
    Then orginator approve transaction from Inbox
    And orginator cancel transaction from All
    When orginator do transaction with valid amount third time
    Then orginator approve transaction from Inbox on third time
    Then move from orginator to benificinary.........
    And benificinary reject the address
    Then move from benificinary to orginator....
    When orginator do transaction with valid amount fourth time
    Then orginator approve transaction from Inbox on fourth time
    Then move from orginator to benificinary secound time..........
    And benificinary accept the address
    Then benificinary reject transaction
    Then move from benificinary to orginator secound time....
    When orginator do transaction with valid amount fifth time
    Then orginator approve transaction from Inbox on fifth time
    Then move from orginator to benificinary third time..........
    And benificinary accept the address
    Then benificinary accept transaction
    Then move from benificinary to orginator to change into basic
    Then orginator set the basic rule for transaction
    When orginator do transaction with below threshhold value in basic rule
    Then orginator checks inbox
    When orginator do transaction with valid amount with basic rule
    Then orginator cancel the transaction in All
    When orginator do transaction with valid amount secound time with basic rule
    Then move from orginator to benificinary for transaction
    And benificinary reject the address from inbox with basic rule
    Then move from benificinary to orginator to transaction
    When orginator do transaction with valid amount third time with basic rule
    Then move from orginator to benificinary secound time for transaction
    And benificinary accept the amount
    Then beneificier do transaction with valid amount
