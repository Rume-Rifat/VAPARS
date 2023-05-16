 # VAPARs-2206
  
 #Feature: Veterans
 
 # Scenario Outline: Add a Foreign Address for a Veteran
  #  Given User1 was singed in then navigate to Dashboard "<URL>"
   # And User1 will Navigate to Veteran page by clicking the Veteran tab
    #When User1 will Enter the desired Veterans SSN "<SSN>"
    #And User1 will Click lookup the Search button
    #Then User1 will Click the Veteran Select button
    #And User1 will Click Close button
    #And User1 click Address button
    #Then User1 Selects Foreign Address
    #Then User1 inputs Address "<Address>"
    #And User1 input City "<City>"
    #Then User1 input State "<State>"
    #Then User1 input Postal Code "<PostalCode>"
    #And User1 selects Country "<Country>"
    #Then User1 Clicks Save
    #Then User1 Click Close

    #Examples: 
     # | URL                              | SSN       | Address    | City   | State | PostalCode | Country |
      #| https://vapars-test.cpac.va.gov/ | 123123449 | 420 elm st | Jurain | Dhaka |       1236 |      19 |