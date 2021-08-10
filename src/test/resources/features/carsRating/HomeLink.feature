@Homelink, @Regression
Feature: Page Header's Home Link
  In any page, user can navigate to home page by click the 'Buggy Rating' on the page header's home link.

  Scenario: header on 'Make' page should have a homepage link
    Given User is on home Page
    When User clicks on Popular Make image
    Then The browser should navigate to make page
    And the header should has a home link

  Scenario: header on 'Model' page should have a homepage link
    Given User is on home Page
    When User clicks on Popular Model image
    Then The browser should navigate to Model page
    And the header should has a home link

  @Smoke
  Scenario: header on 'Overall' page should have a homepage link
    Given User is on home Page
    When User clicks on Overall Rating image
    Then The browser should navigate to Overall Rating page
    And the header should has a home link
