# VAPARs-2207
Feature: Veterans
  
  //@SmokeTesting,

  Scenario Outline: Search for Veteran
    Given the user is singed in and navigate to Dashboard
    And the user Navigate to Veteran page by clicking the Veteran tab
    When the user types the desired Veterans SSN "<SSN>"
    And the user click lookup the Search button
    Then the user click the Veteran Select button
    And the user clicks Close button
    
 		Examples: 
      | URL                              | SSN       | 
      | https://vapars-test.cpac.va.gov/ | 123123445 |