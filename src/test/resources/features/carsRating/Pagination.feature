@Pagination, @Regression
Feature: Pagination in Overall page
  User can use pagination control to navigate in Overall Rating page
  click prev arrow, next arrow, input page number

  Background:
    Given User is on Overall Rating Page
    And There are 21 cars
    And Each page has 5 cars listed

  Scenario Outline: Navigate by Input Page Number
    Given User is on <current> page
    When User input <page number> and press enter
    Then It should be on <target> page

    Examples:
      | current | page number | target |
      | 1       | 2           | 2      |
      | 2       | 1           | 1      |
      | 2       | 3           | 3      |
      | 4       | 5           | 5      |
      | 5       | 1           | 1      |


  Scenario Outline: Navigate by click Next Page Arrow
    Given User is on <current> page
    When User clicks Next Page arrow
    Then It should be on <next> page

    Examples:
      | current | next |
      | 1       | 2    |
      | 2       | 3    |
      | 5       | 5    |

  Scenario Outline: Navigate by click Previous Page Arrow
    Given User is on <current> page
    When User clicks Prev Page arrow
    Then It should be on <prev> page

    Examples:
      | current | prev |
      | 1       | 1    |
      | 2       | 1    |
      | 5       | 4    |

  @Negative
  Scenario Outline: Input Page Number is out of range
    Given User is on <current> page
    When User input <page number> and press enter
    Then It should be on <target> page

    Examples:
      | current | page number | target |
      | 1       | 6           | 1      |
