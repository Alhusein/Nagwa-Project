@smoke
  Feature: F02_Search | User use search icon to start searching on nagwa lessons and choose one of this lessons

    Scenario: user could search for lesson name
      Given user clicks on search field
      And user search for lesson name like "addition"
      And user click on Enter Button
      Then user could search successfully
      And user click on 2nd lesson in the search result
      Then user can navigate to its home page successfully
      And user go to worksheet section and click preview button
      And user can navigate to worksheet page successfully
      Then count number of questions displayed on web page and print the count