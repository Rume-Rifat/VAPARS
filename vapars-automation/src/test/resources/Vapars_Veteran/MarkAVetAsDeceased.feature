# VAPARs-2216

Feature: Veterans

  Scenario Outline: Mark a Veteran as deceased
 		Given the user is singed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the user types "123123449" into "SearchForAVeteranPage.VetLookup"
    And the user clicks "SearchForAVeteranPage.VetSSNsearch"
    And the user clicks "SearchForAVeteranPage.VetSelect"
    And the user clicks "SearchForAVeteranPage.VetSelectClose"