
@login
Feature: login
@amazon
  Scenario: Login to amazon appication
    Given user is on login page
    And user can see following options
    |Today's Deals|
    |Your Amazon.com|
    |Buy Again|
    |Gift Cards|
    
    
