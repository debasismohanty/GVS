Feature: GVS-Titan automation - GvsHome6

  Scenario: Verify the Upload Tracking Status page
   Given User logged in to GVS-Titan with valid credential
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then User click on Track Upload status
    And Page should have expected features
    When User Checks for the Advance search icon, Filters pop up should get opened
    And User sets filter and clicks on apply button, pop up should be closed by showing filtered records in grid
    And User clears the filter criteria and click on apply button, popup should be closed with all available records in grid
    When User checks for excel export by applying advance search, filtered data must be present there
    And User clicks on excel icon, Excel should be downloaded with all available records
    When User remove the filter from advance search and click on Excel icon, Excel should be downloaded with all available records
    When User applies Quick search, filtered records should be displayed in grid
    And User clicks on excel icon, Excel should be downloaded with all available records
    When User checks for page for records,dropdown should be placed right side Bottom of the grid
    And User Change the value from the dropdown ,Selected no of recs should be displayed in grid if available
    When User Check for Pagination grid,Pagination should have option to go any specific page by number
    And User click on specific page tab, based on selection user should be navigated to that page
    And If sufficient records are not available then tab should be in disable mode
    When User Click on the any columns hamburger icon displayed against column and select Sort ascending/Descending
    Then grid should be sorted in ascending/descending order based the available data on that column    
    And user Click on the any of the available column except Action
    Then grid should be sorted in ascending/descending order based the available data on that column    
    When User Clicks on the hamburger icon displayed against any of the columns, one drawer should be opened
    And User Hover mouse on Columns option, drawer should be opened with check box against each column
    And User Check/Uncheck the check box for any of available columns 
    Then Unticked columns should hide from the  grid and ticked columns should be displayed in the grid
    