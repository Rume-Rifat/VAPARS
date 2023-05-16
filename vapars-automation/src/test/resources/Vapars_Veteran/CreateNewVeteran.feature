# VAPARs-2191
Feature: Veterans
  
  //@SmokeTesting,

  Scenario Outline: Create New Veteran
    Given User is singed in and navigate to Dashboard "<URL>"
    And Navigate to the Veteran page by clicking the Veteran tab
    When User click the New Veteran button
    And Enter the Veterans SSN "<SSN>"
    And Enter the Veterans ICN "<ICN>"
    Then Enter the Veterans Last Name "<LastName>"
    And Enter the Veterans First Name "<FirstName>"
    Then User click Save Patient Details button
    And User click Address button
    Then User adds address "<Address>"
    And User adds postal code "<PostalCode>"
    And User clicks Search
    Then User Select the City and State
    And User clicks Save
    Then User clicks Close

    Examples: 
      | URL                              | SSN       | ICN        | LastName | FirstName   | Address    | PostalCode |
      | https://vapars-test.cpac.va.gov/ | 123123445 | 9123456775 | xiv      | Testsubject | 313 elm st |      22201 |
