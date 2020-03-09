Feature: Shopping
   Scenario Outline: :Purchase of a sweater by a logged in user
Given I log in to the application using my "<email>" and "<password>"
     When I seek out Hummingbird Printed Sweater
     And I choose size M
     And I add five pieces
     And I go to checkout
     And I confirm my adress
     And Choose shipment type
     And and I choose payment method
     And I check I agree therms of service
     And Click order with obligation to pay
     Then Information is displayed: You order is confirmed
     And I'm doing a screenshot]
     And the browser closes




     Examples:
       |email             | password |
       |presset@gmail.com |Pass123   |