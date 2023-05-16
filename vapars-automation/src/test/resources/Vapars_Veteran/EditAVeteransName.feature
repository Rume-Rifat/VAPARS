# VAPARs-2208
Feature: Veterans

  Scenario Outline: Edit a Veteran's Name
    Given User2 was singed in then navigate to Dashboard "<URL>"
    And User2 will Navigate to Veteran page by clicking the Veteran tab
    When User2 will Enter the desired Veterans SSN "<SSN>"
    And User2 will Click lookup the Search button
    Then User2 will Click the Veteran Select button
    And User2 will Click Close button
    Then User2 Clicks Edit Details
    Then User2 Enter the Veterans Last Name "<LastName>"
    And User2 Enter the Veterans First Name "<FirstName>"
    Then User2 clicks Save Patient Details button

    Examples: 
      | URL                              | SSN       | LastName | FirstName   |
      | https://vapars-test.cpac.va.gov/ | 123123445 | Fourteen | Testsubject |
