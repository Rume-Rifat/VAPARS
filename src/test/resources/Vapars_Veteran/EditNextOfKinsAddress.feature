# VAPARs-2211
Feature: Veterans

  Scenario: Edit Next of Kins Address
    Given the user is signed in and navigates to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.fieldVetLookup"
    And the user clicks "SearchForAVeteranPage.buttonVetSSNsearch"
    And the user clicks "SearchForAVeteranPage.buttonVetSelect"
    And the user clicks "SearchForAVeteranPage.buttonVetSelectClose"
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
  # Reverting Test Data
  Scenario: Reverting Edit of Next of Kins Address
    Given the user is signed in and navigates to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.fieldVetLookup"
    And the user clicks "SearchForAVeteranPage.buttonVetSSNsearch"
    And the user clicks "SearchForAVeteranPage.buttonVetSelect"
    And the user clicks "SearchForAVeteranPage.buttonVetSelectClose"
    Then the user clicks "EditNextofKinsAddressPage.tabNextKin"
    And the user clicks "EditNextofKinsAddressPage.buttonEditNextKin"
    And the user clears "AddNextofKinPage.fieldKinAddress"
    And the user types "4785 Layton St" into "AddNextofKinPage.fieldKinAddress"
    And the user clears "AddNextofKinPage.fieldKinPC"
    And the user types "22150" into "AddNextofKinPage.fieldKinPC"
    And the user clicks "AddNextofKinPage.buttonKinPCSearch"
    And the user clicks "AddNextofKinPage.buttonKinPCSelect"
    And the user clicks "AddNextofKinPage.buttonSaveKin"
    And the user clicks "AddNextofKinPage.buttonCloseKin"