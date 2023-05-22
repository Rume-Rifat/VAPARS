# VAPARs-2206
Feature: Veterans

  Scenario Outline: Add a Foreign Address for a Veteran
    Given the user is singed in and navigate to Dashboard
    And the user clicks Navigate to Veteran page by clicking the Veteran tab
    And the user types Enter the desired Veterans SSN "<SSN>"
    And the user clickc lookup the Search button
    Then the user clicks the Veteran Select button
    And the user clicks Close button
    And the user clicks Address button
    Then the user clicks Foreign Address
    And the user types Address "<Address>"
    And the user types City "<City>"
    And the user types State "<State>"
    And the user types Postal Code "<PostalCode>"
    And the user selects Country "<Country>"
    Then the user clicks Save
    And the user click Close

    Examples: 
      | URL                              | SSN       | Address    | City   | State | PostalCode | Country |
      | https://vapars-test.cpac.va.gov/ | 123123449 | 420 elm st | Jurain | Dhaka |       1236 |      19 |
