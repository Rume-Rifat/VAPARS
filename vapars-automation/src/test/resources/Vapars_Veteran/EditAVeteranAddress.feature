# VAPARs-2209

Feature: Veterans

  Scenario Outline: Edit a Veteran Address
    Given User0 was singed in then navigate to Dashboard "<URL>"
    And User0 will Navigate to Veteran page by clicking the Veteran tab
    When User0 will Enter the desired Veterans SSN "<SSN>"
    And User0 will Click lookup the Search button
    Then User0 will Click the Veteran Select button
    And User0 will Click Close button
    Then User0 Clicks Address History
    Then User0 Clicks Edit
    Then User0 will Add address "<Address>"
    And User0 will Add postal code "<PostalCode>"
    And User0 will Click Search
    Then User0 will Select the City and State
    And User0 will Click Save
    Then User0 will Click Close

    Examples: 
      | URL                              | SSN       | Address     | PostalCode |
      | https://vapars-test.cpac.va.gov/ | 123123445 | 7887 elm st |      22150 |




