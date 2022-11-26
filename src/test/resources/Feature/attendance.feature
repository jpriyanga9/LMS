#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: attendance

  Scenario: Validating the Attendance Header
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff Clicks on Attendance button
    Then Admin/User/Staff see header text as "Manage Attendance"

  Scenario: Validating the Attendance Footer
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attandance page
    Then Admin/User/Staff see Footer text as "In total there are 5 entries."

  Scenario: Validating the Attendance Paginator
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 5 entries."

  Scenario: Verify All paginator button on the Attendance page
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see all paginator buttons are Disabled

  Scenario: Verify the Edit Button
    #Backgound  User/Staff Logged on to LMS Website
    Given User/Staff is on Manage Attendance page
    When User/Staff Clicks on Edit Button
    Then Admin see header text as "Attendance Details"

  Scenario: Edit ProgramName in Attendance Details window
    #Backgound User/Staff is on Manage Attendance page
    Given User/Staff Clicks on Edit Button
    When User/Staff clicks on Save button after changing Program Name
    Then User/Staff see the success message "Updated Successfully"

  Scenario: Edit User Name Attendance Details window
    Given User/Staff Clicks on Edit Button
    When User/Staff clicks on Save button after changing User name
    Then User/Staff see the success message "Updated Successfully"

  Scenario: Edit Present in Attendance Details window
    Given User/Staff Clicks on Edit Button
    When User/Staff clicks on Save button after disabling Present details
    Then User/Staff see the success message "Updated Successfully"

  Scenario: Edit Absent in Attendance Details window
    Given User/Staff Clicks on Edit Button
    When User/Staff clicks on Save button after enabling Absent details
    Then User/Staff see the success message "Updated Successfully"

  Scenario: Click on Cancel button in Attendance Details window
    Given User/Staff Clicks on Edit Button
    When User/Staff clicks on Cancel button after entering details
    Then User/Staff see a Attendance Details window getting closed

  Scenario: Admin Verify the Edit Button
    #Backgound Admin Logged on to LMS Website
    Given Admin is on Manage Attendance page
    When Admin Clicks on Edit Button
    Then Admin see Error Message "Admin Has View Only Permission"

  Scenario: Verify the Delete Functionality
    #Backgound User/Staff Logged on to LMS Website
    Given User/Staff is on Manage Attendance page
    When User/Staff Clicks on Delete Button
    Then Admin see header text as "Delete Confirm"

  Scenario: Click on "Yes" button in Delete Confirm window
    Given User/Staff Clicks on Delete Button
    When User/Staff Clicks on " Yes" button
    Then User/Staff see Success message "Program Deleted Succesfully"

  Scenario: Click on "No" button in Delete Confirm window
    Given User/Staff Clicks on Delete Button
    When User/Staff Clicks on "No" button
    Then User/Staff can see Program Name not deleted

  Scenario: Admin Verify the Delete Functionality
    #Backgound Admin Logged on to LMS Website
    Given Admin is on Manage Attendance page
    When Admin Clicks on Delete Button
    Then Admin see Error Message "Admin Has View Only Permission"

  Scenario: Verifying the Checkbox functionality of a Program Name
    #Backgound Admin/User/Staff Logged on to LMS Website
    Given Admin/User/Staff is on Manage Attendance page
    When Admin/User/Staff Clicks on Checkbox
    Then Admin/User/Staff see list of Users in that Program

  Scenario: Verifying the Functionality of a Present button
    #Backgound Admin/User/Staff Logged on to LMS Website
    Given Admin/User/Staff is on Manage Attendance page
    When Admin/User/Staff Clicks on Present
    Then Admin/User/Staff see the list of "User Name" who are Present

  Scenario: Verifying the Functionality of a Absent button
    #Backgound Admin/User/Staff Logged on to LMS Website
    Given Admin/User/Staff is on Manage Attendance page
    When Admin/User/Staff Clicks on Absent
    Then Admin/User/Staff see the list of "User Name" who are Absent
