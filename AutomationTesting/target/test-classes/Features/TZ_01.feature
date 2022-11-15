
Feature: Validating Notabene automation process 03
  Background: 
    Given user goes to Notabene application
    And user login with valid credentials

  Scenario: Notabene Automation transaction without vasp
  
    When transaction without vasp
    And user check whether transaction is created or not

  Scenario: Notabene Automation transaction accepting
    When user enter negative value on amount
    And check the transaction is allowed or not
