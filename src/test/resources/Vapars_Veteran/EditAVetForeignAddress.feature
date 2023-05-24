# VAPARs-2214

Feature: Veterans

  Scenario: Edit a Veterans foreign address
 		Given the user is singed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.VetLookup"
    And the user clicks "SearchForAVeteranPage.VetSSNsearch"
    And the user clicks "SearchForAVeteranPage.VetSelect"
    And the user clicks "SearchForAVeteranPage.VetSelectClose"
    Then the user clicks "EditAVeteranAddressPage.vetAddressHistory"
    Then the user clicks "EditAVetForeignAddressPage.buttonEditForeignAddress"
    And the user clicks "AddAForeignAddressPage.buttonForeignAddress"
    And the user clears "AddAForeignAddressPage.fieldForeignAddress"
    And the user types "420 Elm St" into "AddAForeignAddressPage.fieldForeignAddress"
    And the user clears "AddAForeignAddressPage.fieldForeignCity"
    And the user types "Dhaka" into "AddAForeignAddressPage.fieldForeignCity"
    And the user clears "AddAForeignAddressPage.fieldForeignState"
    And the user types "1236" into "AddAForeignAddressPage.fieldForeignState"
    And the user selects index "17" from dropdown "AddAForeignAddressPage.selectCountry"
    Then the user clicks "AddAForeignAddressPage.saveForeignAddress"
    And the user clicks "AddAForeignAddressPage.closeForeignAddress"