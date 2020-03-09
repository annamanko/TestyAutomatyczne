Feature: AddingTheAdress
 Scenario Outline: Logging in to the application and adding the address
   Given I log in to the application using the correct "<email>" address and "<password>"
   When As a logged in user, I click the Adrses link
   And Entered "<adress>"
   And And entered "<zipCode>"
   And I entered "<city>"
   And Choose "<Country>"
   And Save Adress
   And I checking whether it displays information Address successfully added!


   Then The address has been added, the browser closes.
   Examples:
     |email             | password | adress | zipCode | city | Country |
     |presset@gmail.com |Pass123   |Polna 24| 00-908  |NY    | United Kingdom |
