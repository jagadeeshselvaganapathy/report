
Feature: 
  Validating Notabene automation process

  Background: 
    Given user goes to Notabene
    And user with valid credentials login

  Scenario: Validating transaction creating and canceled
    When user set the rules for transaction
    Then user do transaction
    And user cancel transaction

  Scenario: Validating transaction creating with low amount
    Then user do transaction with no rule with low amount
    And user check in dashboard

  Scenario: Validating transaction creating and aprove transaction
    Then user do the transaction
    And In dashboard user approve the transaction

  Scenario: Validating transaction Beneificiar approve
    And In dashboard Beneificiar accept the transaction
