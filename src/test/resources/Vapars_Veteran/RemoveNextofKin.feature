# VAPARs-2215
Feature: Veterans

  Scenario: Remove Next of kin
    Given the user is signed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.fieldVetLookup"
    And the user clicks "SearchForAVeteranPage.buttonVetSSNsearch"
    And the user clicks "SearchForAVeteranPage.buttonVetSelect"
    And the user clicks "SearchForAVeteranPage.buttonVetSelectClose"
    Then the user clicks "AddNextofKinPage.tabNextKin"
    And the user clicks "RemoveNextToKinPage.removeNextKin"