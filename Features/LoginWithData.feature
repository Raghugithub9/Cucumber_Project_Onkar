
@Regression
Feature: Verify Login Page of OpenMRS
    
  @Sanity
  Scenario Outline: Login with credentials test
    Given User is on Login page of OpenMRS test
    When User enters username <username> 
    And User enters password <password>
    And User selects <location> for this session test
    And User clicks on login button
    Then User will see invalid username password error message test
    
    
    Examples: 
      | username  | password | location       |
      | Admin     | Test123  | Inpatient Ward |
      | Test      | Admin123 | Inpatient Ward |
      | Test      | Test123  | Inpatient Ward |
