# VAPARs-2208
Feature: Veterans

  Scenario Outline: Edit a Veteran's Name
    Given the user is singed in and navigate to Dashboard
    And the user clicks Navigate to Veteran page by clicking the Veteran tab
    When the user types Enter the desired Veterans SSN "<SSN>"
    And the user clicks lookup the Search button
    Then the user clicks the Veteran Select button
    And the user clicks Close button
    Then the user clicks Edit Details
    Then the user types the Veterans Last Name "<LastName>"
    And the user types the Veterans First Name "<FirstName>"
    Then the user clicks Save Patient Details button

    Examples: 
      | URL                              | SSN       | LastName | FirstName   |
      | https://vapars-test.cpac.va.gov/ | 123123445 | Fourteen | Testsubject |
