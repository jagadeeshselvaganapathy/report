
Feature: Validating Basic rules module

  Background: 
    Given user goes  Notabene application
    And user login  valid credentials

  Scenario: Notabene Automation transaction with basic rule
  Then user set rules
    When user do basic rule transaction with minimum ammount
    When user do basic rule transaction with required ammount
    And user approve the transaction

  Scenario: Notabene Automation transaction accepting
    When user accept the transaction
