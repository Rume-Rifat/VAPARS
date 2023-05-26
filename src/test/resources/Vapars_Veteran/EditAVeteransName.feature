# VAPARs-2208
Feature: Veterans

  Scenario: Edit a Veteran Name
    Given the user is signed in and navigates to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.fieldVetLookup"
    And the user clicks "SearchForAVeteranPage.buttonVetSSNsearch"
    And the user clicks "SearchForAVeteranPage.buttonVetSelect"
    And the user clicks "SearchForAVeteranPage.buttonVetSelectClose"
    Then the user clicks Edit Details "EditAVeteransNamePage.editVetDetails"
    And the user clears "EditAVeteransNamePage.editFieldLastName"
    And the user types "Fourteen" into "EditAVeteransNamePage.editFieldLastName"
    And the user clears "EditAVeteransNamePage.editFieldFirstName"
    And the user types "Testsubject" into "EditAVeteransNamePage.editFieldFirstName"
    Then the user clicks "EditAVeteransNamePage.buttonCloseAddress"