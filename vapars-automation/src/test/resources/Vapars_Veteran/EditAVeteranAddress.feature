# VAPARs-2209

Feature: Veterans

  Scenario Outline: Edit a Veteran Address
    Given the user is singed in and navigate to Dashboard
    And the user clicks Navigate to Veteran page by clicking the Veteran tab
    When the user types Enter the desired Veterans SSN "<SSN>"
    And the user click lookup the Search button
    Then the user click the Veteran Select button
    And the user click Close button
    Then the user clicks Address History
    Then the user clicks Edit
    Then the user types Add address "<Address>"
    And the user types Add postal code "<PostalCode>"
    And the user click Search
    Then the user clicks Select the City and State
    And the user clicks Save
    Then the user clicks Close

    Examples: 
      | URL                              | SSN       | Address     | PostalCode |
      | https://vapars-test.cpac.va.gov/ | 123123445 | 7887 elm st |      22150 |




