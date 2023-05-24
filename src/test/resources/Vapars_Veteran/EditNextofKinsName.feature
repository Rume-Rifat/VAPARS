# VAPARs-2210
Feature: Veterans

  Scenario: Edit Next of Kins Name
    Given the user is singed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.VetLookup"
    And the user clicks "SearchForAVeteranPage.VetSSNsearch"
    And the user clicks "SearchForAVeteranPage.VetSelect"
    And the user clicks "SearchForAVeteranPage.VetSelectClose"
    Then the user clicks "AddNextofKinPage.tabNextKin"
    And the user clicks "EditNextofKinsAddressPage.buttonEditNextKin"
    And the user clears "AddNextofKinPage.fieldKinLastName"
    And the user types "kinSampletwo" into "AddNextofKinPage.fieldKinLastName"
    And the user clears "AddNextofKinPage.fieldKinFirstName"
    And the user types "TestSubject" into "AddNextofKinPage.fieldKinFirstName"
    Then the user clicks "EditAVeteranAddressPage.buttonSaveAddress"
    And the user clicks "EditAVeteranAddressPage.buttonCloseAddress"
    And the user clicks "EditAVeteranAddressPage.buttonCloseEditAddress"
