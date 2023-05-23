# VAPARs-2208

Feature: Veterans

  Scenario: Edit a Veteran Name
 		Given the user is singed in and navigate to Dashboard
 		And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.VetLookup"
    And the user clicks "SearchForAVeteranPage.VetSSNsearch"
    And the user clicks "SearchForAVeteranPage.VetSelect"
    And the user clicks "SearchForAVeteranPage.VetSelectClose"
    Then the user clicks Edit Details "EditAVeteransNamePage.editVetDetails"
    And the user clears "EditAVeteransNamePage.editFieldLastName"
    And the user types "Fourteen" into "EditAVeteransNamePage.editFieldLastName"
    And the user clears "EditAVeteransNamePage.editFieldFirstName"
    And the user types "Testsubject" into "EditAVeteransNamePage.editFieldFirstName"
    Then the user clicks "EditAVeteransNamePage.buttonCloseAddress"
