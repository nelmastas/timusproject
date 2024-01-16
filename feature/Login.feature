Feature: Timus Login
  Background: Login page is opened successfully
    Given Timus login page is opened
    Then Timus login page was displayed
    Then User sees the login form

  @Test
  Scenario: User can sign in successfully
    And User sets email address
    And User sets password button
    When User summits login button
    And driver close

  @Test
  Scenario: User can create account successfully
    And User click create account button
    And User sets Nazmi in first name
    And User sets Elmastaş in last name
    And User sets account email
    And User sets Turkey in country
    And User accept Privacy Policy
    And User accept Terms of Service
    And driver close

