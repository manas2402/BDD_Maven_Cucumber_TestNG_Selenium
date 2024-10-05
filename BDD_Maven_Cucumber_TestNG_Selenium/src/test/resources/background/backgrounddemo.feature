Feature: This is background demo

  
  Background: User is logged in to saucedemo app
  	Given User accessing the saucedemo login page
		When User enters valid username and password
		Then User should be able to navigate to Home Page
		
  Scenario: Test Menu items 
    And click on breadcrumb creds
    Then User should be able to see the menu items

  Scenario: Verify add to cart functionality
    And Clicks on Add to button
    Then Item should be added to the cart


