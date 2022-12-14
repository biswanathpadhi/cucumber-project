#one or more tags can be added at feature/scenario level
@user
Feature: User registration

  Scenario: User registration with different data
    Given user is on home page
    And he enters below details
      | Andrew | Jack  | andrewjack@gmail.com | +911234567890 |
      | Harry  | larry | harrylarry@gmail.com | +911234567891 |
      | john   | wick  | johnwick@gmail.com   | +911234567891 |
    When user click submit button
    Then user should see home page

  @dataTableWithMap
  Scenario: User registration with different data with columns
    Given user is on home page
    And he enters below details with column name
      | firstName | lastName | email                | phone         |
      | Andrew    | Jack     | andrewjack@gmail.com | +911234567890 |
      | Harry     | larry    | harrylarry@gmail.com | +911234567891 |
      | john      | wick     | johnwick@gmail.com   | +911234567891 |
    When user click submit button
    Then user should see home page

  @scenariooutline
  Scenario Outline: 
    Given user is on home page
    And user enters "<username>" and "<password>"
    When user click submit button
    Then user should see home page

    Examples: 
      | username | password |
      | sita     | ram      |
      | radhe    | krishna  |

  @exampleswithdecimal
  Scenario Outline: 
    Given user is on home page
    And user clicks on pay outstanding amount
    Then <totalPayment> should equal to sum of <totalAmount> and <taxAmount>

    Examples: 
      | totalPayment | totalAmount | taxAmount |
      |        110.6 |       100.3 |      10.3 |
      |          110 |         100 |        10 |
