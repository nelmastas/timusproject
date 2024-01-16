Feature: Api tests
  Scenario: Login create
    When Send a Post Request
    Then Receive valid HTTP response code '200'