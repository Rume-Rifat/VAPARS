# VAPARs-2214
Feature: Veterans

  Scenario: Edit a Veterans foreign address
    Given the user is signed in and navigates to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.fieldVetLookup"
    And the user clicks "SearchForAVeteranPage.buttonVetSSNsearch"
    And the user clicks "SearchForAVeteranPage.buttonVetSelect"
    And the user clicks "SearchForAVeteranPage.buttonVetSelectClose"
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

  # Reverting Veteran foriegn address 
  Scenario: Reverting Edit of a Veterans foreign address
    Given the user is signed in and navigates to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.fieldVetLookup"
    And the user clicks "SearchForAVeteranPage.buttonVetSSNsearch"
    And the user clicks "SearchForAVeteranPage.buttonVetSelect"
    And the user clicks "SearchForAVeteranPage.buttonVetSelectClose"
    Then the user clicks "EditAVeteranAddressPage.vetAddressHistory"
    Then the user clicks "EditAVetForeignAddressPage.buttonEditForeignAddress"
    And the user clicks "AddAForeignAddressPage.buttonForeignAddress"
    And the user clears "AddAForeignAddressPage.fieldForeignAddress"
    And the user types "313 Center City cr" into "AddAForeignAddressPage.fieldForeignAddress"
    And the user clears "AddAForeignAddressPage.fieldForeignCity"
    And the user types "Jatrabari" into "AddAForeignAddressPage.fieldForeignCity"
    And the user clears "AddAForeignAddressPage.fieldForeignState"
    And the user types "1204" into "AddAForeignAddressPage.fieldForeignState"
    And the user selects index "19" from dropdown "AddAForeignAddressPage.selectCountry"
    Then the user clicks "AddAForeignAddressPage.saveForeignAddress"
    And the user clicks "AddAForeignAddressPage.closeForeignAddress"