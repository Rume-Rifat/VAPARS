# VAPARs-2213
Feature: Veterans

  Scenario: Remove a Veterans Address
    Given the user is signed in and navigates to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.fieldVetLookup"
    And the user clicks "SearchForAVeteranPage.buttonVetSSNsearch"
    And the user clicks "SearchForAVeteranPage.buttonVetSelect"
    And the user clicks "SearchForAVeteranPage.buttonVetSelectClose"
    Then the user clicks "EditAVeteranAddressPage.vetAddressHistory"
    And the user clicks "RemoveAVetAddressPage.buttonRemoveVetAddress"