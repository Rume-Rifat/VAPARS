# VAPARs-2207
Feature: Veterans
  
  //@SmokeTesting,

  Scenario Outline: Search for Veteran
    Given User3 was singed in and navigate to Dashboard "<URL>"
    And User3 Navigate to Veteran page by clicking the Veteran tab
    When User3 Enter the desired Veterans SSN "<SSN>"
    And User3 Click lookup the Search button
    Then User3 Click the Veteran Select button
    And User3 clicks Close button
    
 		Examples: 
      | URL                              | SSN       | 
      | https://vapars-test.cpac.va.gov/ | 123123445 |