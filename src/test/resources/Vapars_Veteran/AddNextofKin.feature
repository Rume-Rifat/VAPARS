# VAPARs-2205
Feature: Veterans

  Scenario: Add Next of Kin
    Given the user is singed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.VetLookup"
    And the user clicks "SearchForAVeteranPage.VetSSNsearch"
    And the user clicks "SearchForAVeteranPage.VetSelect"
    And the user clicks "SearchForAVeteranPage.VetSelectClose"
    Then the user clicks "AddNextofKinPage.tabNextKin"
    And the user clicks "AddNextofKinPage.buttonNewKin"
    And the user types "kintwo" into "AddNextofKinPage.fieldKinLastName"
    And the user types "Subject" into "AddNextofKinPage.fieldKinFirstName"
    And the user types "435 Elm st" into "AddNextofKinPage.fieldKinAddress"
    And the user types "22150" into "AddNextofKinPage.fieldKinPC"
    And the user clicks "AddNextofKinPage.buttonKinPCSearch"
    And the user clicks "AddNextofKinPage.buttonKinPCSelect"
    And the user clicks "AddNextofKinPage.buttonSaveKin"
    And the user clicks "AddNextofKinPage.buttonCloseKin"
