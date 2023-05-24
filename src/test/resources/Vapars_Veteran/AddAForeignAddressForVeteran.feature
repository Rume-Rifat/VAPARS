# VAPARs-2206

Feature: Veterans

  Scenario: Add a Foreign Address for a Veteran
    Given the user is singed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the user types "123123449" into "SearchForAVeteranPage.VetLookup"
    And the user clicks "SearchForAVeteranPage.VetSSNsearch"
    And the user clicks "SearchForAVeteranPage.VetSelect"
    And the user clicks "SearchForAVeteranPage.VetSelectClose"
    Then the user clicks "CreateANewVeteranPage.buttonNewAddress"
    And the user clicks "AddAForeignAddressPage.buttonForeignAddress"
    And the user types "420 Elm St" into "AddAForeignAddressPage.fieldForeignAddress"
    And the user types "Dhaka" into "AddAForeignAddressPage.fieldForeignCity"
    And the user types "1236" into "AddAForeignAddressPage.fieldForeignState"
    And the user selects index "19" from dropdown "AddAForeignAddressPage.selectCountry"
    Then the user clicks "AddAForeignAddressPage.saveForeignAddress"
    And the user clicks "AddAForeignAddressPage.closeForeignAddress"

