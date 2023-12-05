Feature: Book a flight

  @BookFlightMDEtoBOG
  Scenario: Reserve the cheapest flight from MDE to BOG on www.despegar.com.co
    Given I am on the www.despegar.com.co home page
    When I select the flight from MDE to BOG
    And I select the departure and return date
    And I buy the cheapest flights
    Then I verify that the payment page is displayed