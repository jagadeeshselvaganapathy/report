
Feature: 
  Validating Notabene automation process 02

  Background: 
    Given user goes to application Notabene
    And user with valid credentials they login

  Scenario: Validating transaction creating and canceled with basic rules
    When user set the basic rule for transaction
    Then user do transaction with it
    And user cancel the transaction

  Scenario: Validating transaction creating with low amount with basic rule
    Then user do transaction with basic rule with low amount
    And user check in dashboard orginator

  Scenario: Validating transaction creating and aprove transaction with basic rule
    Then user do the transaction with bsaic rule
    And In dashboard user will approve the transaction

  Scenario: Validating the transaction Beneificiar approve
    And In dashboard Beneificiar will accept the transaction
