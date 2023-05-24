# VAPARs-2213
Feature: Veterans

  Scenario: Remove a Veterans Address
    Given the user is singed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.VetLookup"
    And the user clicks "SearchForAVeteranPage.VetSSNsearch"
    And the user clicks "SearchForAVeteranPage.VetSelect"
    And the user clicks "SearchForAVeteranPage.VetSelectClose"
    Then the user clicks "EditAVeteranAddressPage.vetAddressHistory"
    And the user clicks "RemoveAVetAddressPage.buttonRemoveVetAddress"
