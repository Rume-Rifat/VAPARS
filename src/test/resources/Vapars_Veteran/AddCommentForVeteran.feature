# VAPARs-2221
Feature: Veterans

  Scenario: Add a comment for a Veteran
    Given the user is signed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.fieldVetLookup"
    And the user clicks "SearchForAVeteranPage.buttonVetSSNsearch"
    And the user clicks "SearchForAVeteranPage.buttonVetSelect"
    And the user clicks "SearchForAVeteranPage.buttonVetSelectClose"
    Then the user clicks "AddCommentForVeteranPage.buttonCommentVet"
    And the user types "Testing Sample 1" into "AddCommentForVeteranPage.fieldCommentVet"
    And the user clicks "AddCommentForVeteranPage.buttonSaveComments"
    And the user clicks "AddCommentForVeteranPage.buttonCloseComments"
