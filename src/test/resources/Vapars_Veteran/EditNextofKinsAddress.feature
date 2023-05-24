# VAPARs-2211
Feature: Veterans

  Scenario: Edit Next of Kins Address
    Given the user is singed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.VetLookup"
    And the user clicks "SearchForAVeteranPage.VetSSNsearch"
    And the user clicks "SearchForAVeteranPage.VetSelect"
    And the user clicks "SearchForAVeteranPage.VetSelectClose"
    Then the user clicks "EditNextofKinsAddressPage.tabNextKin"
    And the user clicks "EditNextofKinsAddressPage.buttonEditNextKin"
    And the user clears "AddNextofKinPage.fieldKinAddress"
    And the user types "5135 Elm st" into "AddNextofKinPage.fieldKinAddress"
    And the user clears "AddNextofKinPage.fieldKinPC"
    And the user types "22201" into "AddNextofKinPage.fieldKinPC"
    And the user clicks "AddNextofKinPage.buttonKinPCSearch"
    And the user clicks "AddNextofKinPage.buttonKinPCSelect"
    And the user clicks "AddNextofKinPage.buttonSaveKin"
    And the user clicks "AddNextofKinPage.buttonCloseKin"
