# VAPARs-2206
Feature: Veterans

  Scenario: Add a Foreign Address for a Veteran
    Given the user is signed in and navigates to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.fieldVetLookup"
    And the user clicks "SearchForAVeteranPage.buttonVetSSNsearch"
    And the user clicks "SearchForAVeteranPage.buttonVetSelect"
    And the user clicks "SearchForAVeteranPage.buttonVetSelectClose"
    And the user clicks "CreateANewVeteranPage.buttonNewAddress"
    And the user clicks "AddAForeignAddressPage.buttonForeignAddress"
    And the user types "420 Elm St" into "AddAForeignAddressPage.fieldForeignAddress"
    And the user types "Dhaka" into "AddAForeignAddressPage.fieldForeignCity"
    And the user types "1236" into "AddAForeignAddressPage.fieldForeignState"
    And the user selects value "19" from dropdown "AddAForeignAddressPage.dropDownCountry"
    And the user clicks "AddAForeignAddressPage.buttonSaveForeignAddress"
    And the user clicks "AddAForeignAddressPage.buttonCloseForeignAddress"