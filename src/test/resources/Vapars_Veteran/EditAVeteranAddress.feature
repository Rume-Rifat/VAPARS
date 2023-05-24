# VAPARs-2209

Feature: Veterans

  Scenario: Edit a Veteran Address
    Given the user is singed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.VetLookup"
    And the user clicks "SearchForAVeteranPage.VetSSNsearch"
    And the user clicks "SearchForAVeteranPage.VetSelect"
    And the user clicks "SearchForAVeteranPage.VetSelectClose"
    Then the user clicks "EditAVeteranAddressPage.vetAddressHistory"
    And the user clicks "EditAVeteranAddressPage.editAddress"
    And the user clears "EditAVeteranAddressPage.editFieldAddress"
    And the user types "5515 Center Ct" into "EditAVeteranAddressPage.editFieldAddress"
    And the user clears "EditAVeteranAddressPage.fieldPostalCode"
    And the user types "22201" into "EditAVeteranAddressPage.fieldPostalCode"
    And clickthe user click "EditAVeteranAddressPage.buttonSearch"
    And the user clicks "EditAVeteranAddressPage.buttonEditPC"
    Then the user clicks "EditAVeteranAddressPage.buttonSaveAddress"
    And the user clicks "EditAVeteranAddressPage.buttonCloseAddress"
    And the user clicks "EditAVeteranAddressPage.buttonCloseEditAddress"
    




