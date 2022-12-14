#one or more tags can be added at feature/scenario level
@uber
Feature: Uber Search

  Background: 
    # back ground is run before each scenario
    Given user has installed uber app

  @car
  Scenario: Book a car
    Given I have opened the uber app for car booking
    And I enter souce as "BLR" and destination as "BLR Airport"
    When I click BookCab and select
    Then Car booking should be done

  @car2
  Scenario: Book a car2
    Given I have opened the uber app for car booking
    And I enter souce as "BLR airport" and destination as "home"
    When I click BookCab and select
    Then Car booking should be done