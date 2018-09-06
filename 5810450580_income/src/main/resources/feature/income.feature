Feature: Income
  As a user
  I want to add and view income
  so that I know how much money I have


  Scenario: Add income
    Given a user has 1000 baht
    When I add income 500 baht
    Then I have income amount 1500 baht


  Scenario:  Pay a money less than income
    Given a user has 1000 baht
    When I pay a money 400 baht
    Then I have money income amount 600 baht
    And my disbursement is 400 baht

  Scenario: Pay a money greater than income
    Given a user has 1000 baht
    When I pay a money 1100 baht
    Then I have money income amount 0 baht

  Scenario: Check income
    Given a user has 1000 baht
    When I want to check my income that is 1000 baht
    Then System show my income amount 1000 baht

  Scenario: Check disbursement
    Given a user has 1000 baht
    When I pay a money 400 baht
    Then System show disbursement amount 400 baht