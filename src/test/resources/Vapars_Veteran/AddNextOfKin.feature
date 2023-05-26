# VAPARs-2205
Feature: Veterans

  Scenario: Add Next of Kin
    Given the user is signed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.fieldVetLookup"
    And the user clicks "SearchForAVeteranPage.buttonVetSSNsearch"
    And the user clicks "SearchForAVeteranPage.buttonVetSelect"
    And the user clicks "SearchForAVeteranPage.buttonVetSelectClose"
    Then the user clicks "AddNextOfKinPage.tabNextKin"
    And the user clicks "AddNextOfKinPage.buttonNewKin"
    And the user types "kintwo" into "AddNextOfKinPage.fieldKinLastName"
    And the user types "Subject" into "AddNextOfKinPage.fieldKinFirstName"
    And the user types "435 Elm st" into "AddNextOfKinPage.fieldKinAddress"
    And the user types "22150" into "AddNextOfKinPage.fieldKinPC"
    And the user clicks "AddNextOfKinPage.buttonKinPCSearch"
    And the user clicks "AddNextOfKinPage.buttonKinPCSelect"
    And the user clicks "AddNextOfKinPage.buttonSaveKin"
    And the user clicks "AddNextOfKinPage.buttonCloseKin"