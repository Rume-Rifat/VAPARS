# VAPARs-2212

Feature: Veterans

  Scenario Outline: Add a New Address for a Veteran
 		Given the user is singed in and navigate to Dashboard
    And the user clicks "SearchForAVeteranPage.tabVeteran"
    And the title name should be "VAPARS - Veteran Details"
    And the user types "123123449" into "SearchForAVeteranPage.VetLookup"
    And the user clicks "SearchForAVeteranPage.VetSSNsearch"
    And the user clicks "SearchForAVeteranPage.VetSelect"
    And the user clicks "SearchForAVeteranPage.VetSelectClose"
    And the user clicks "CreateANewVeteranPage.buttonNewAddress"
  	And the user types "313 Elm st" into "CreateANewVeteranPage.fieldAddress"
    And the user types "22150" into "CreateANewVeteranPage.fieldPostalCode"
    And the user clicks "CreateANewVeteranPage.buttonSearch"
    And the user clicks "CreateANewVeteranPage.buttonSelectPC"
    And the user clicks "CreateANewVeteranPage.buttonSaveAddress"
    Then the user clicks "CreateANewVeteranPage.buttonCloseAddress"
    
    