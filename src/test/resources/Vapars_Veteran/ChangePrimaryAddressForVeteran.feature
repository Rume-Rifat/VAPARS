# VAPARs-2217
Feature: Veterans

  Scenario: Change the Primary Address for a Veteran
    Given the user is signed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.fieldVetLookup"
    And the user clicks "SearchForAVeteranPage.buttonVetSSNsearch"
    And the user clicks "SearchForAVeteranPage.buttonVetSelect"
    And the user clicks "SearchForAVeteranPage.buttonVetSelectClose"
    And the user clicks "hangePrimaryAddressForVeteranPage.tabVetAddressHistory"
    And the user clicks "hangePrimaryAddressForVeteranPage.buttonVetPrimaryAddress"
