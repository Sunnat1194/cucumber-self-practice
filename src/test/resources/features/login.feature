@1
Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

   @librarian @employee
  Scenario: Login as librarian
    Given user is on the login page
    When user enters librarian username
    And user enter librarian password
    Then user should see  dashboard

     @student
     Scenario: Login as student
       Given user is on the login page
       When user enters student username
       And user enters student password
       Then user should see  dashboard

       @admin
       Scenario: Login as admin
         Given user is on the login page
         When user enters admin username
         And user enters admin password
         Then user should see  dashboard