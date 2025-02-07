
@Regression
Feature: Verify Login Page of OpenMRS

  @Sanity
  Scenario: Login with invalid credentials
    Given User is on Login page of OpenMRS
    When User enters invalid user name 
    And User enters invalid password
    And User selects location for this session
    And click on login button
    Then User will see invalid username password error message
    
  @Sanity
  Scenario: Login with valid credentials
    Given User is on Login page of OpenMRS
    When User enters valid user name 
    And User enters valid password
    And User selects location for this session
    And click on login button
    Then User will be on home page
    


