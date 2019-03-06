Feature: To test subtotal price calculation for various scenarios

  Scenario: To test the scenario
    Given that the subtotal price API "http://localhost:8080/subtotal" is working
    When request has one item 3
    Then response will have regular price