Feature: Book a flight

  @BookFlightMDEtoBGA
  Scenario: Reserve the cheapest flight from MDE to BGA on www.despegar.com.co
    Given I am on the www.despegar.com.co home page
    When I select the flight from MDE to BGA
    And I select the cheapest flights
    Then I verify that the payment page is displayed