Feature: Title of your featureI want to use this template for my feature file

Background: User logs in to profile
Given User able to open the browser and enter the URL
 
  Scenario: Title of your scenario
    Given User able to login the page
    When Click on the user Adimn option 
    
    Scenario: Title of your scenario2
    Given User able to login the page
    When Click on the user Adimn option 
    
    Scenario Outline: Title of your scenario
    Given User able to enter the User Name as "<User Name>" in Login page
    And user able to click on the Login button
    Given User able to enter the Password as "<Password>" in Login page
    Given user able to click on the Login button

    Examples: 
      | User Name                 | Password    |
      | sclient927+FSAR@gmail.com | Lvt12345678 |
      | sclient927+FSAR@gmail.com | Lvt12345678 |
      