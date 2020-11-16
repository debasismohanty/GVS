Feature: Login into GVS-Titan Application GvsHome1

  Scenario Outline: Verify the Home page
    When User logged in to GVS-Titan with valid credential
    When user is on Home page, Titan Logo and Hamburger menu icon should present there
    And Welcome <Username>, Global Filter, Control Tower and My Alert Section should present there
    When User click on hamburger icon Sliding drawer should open with Menu list
    And User should be able to see "Visibility", "Shipment" ,"Administration", "Configuration" and "Find a Shipment"
    And It should show "Data Upload" ,"Track Upload Status" and "GIT Dashboard" as submenu of Visibility
    And It should have "Shipment summary" as submenu of Shipment and "Master Data" as submenu of Configuration
    And It should have "Roles and Permissions" ,"Users" and "Preferences" as submenu of Administration
    And Welcome label should be displayed with username by which user logged in to the application
    When Username is clicked "Administration" and "Preferences" options should be displayed
    And User can navigate to the Administration and Preferences page on clicking on both of the links
    When User check for Global filter criteria should be displayed as "Shipment Type: " and "Regions: "
    When User click on Global filter the drawer should open and "Filter by Shipment Type" and "Filter by Origin" should present
    And Shipment type should have "Non Precious" and "Precious" and both the options should be selected
    When User click on deselect all button Filter criteria should be removed from the global filter
    Then User click on Apply Filter button "none" should be displayed in regions section
    When User click on Select all under Shipment Type and Click on Apply Filter button
    Then "Non precious +1 more" should be displayed against  Shipment Type on top
    When user selects any one out of the two present Shipment Type and Click on Apply Filter button
    Then Shipment Type  filter criteria should be added and selected Shipment Type should be displayed on top
    When User click on Global filter "East","North","South" and "West" should be displayed under Filter by Origin
    When User click on Deselect All and click on Apply Filter, Regions should display "None" in global filter on top
    When User click on select all and click on Apply Filter, Regions should display "East +3 more" in global filter on top
    When User select one origin in filter and click on the Apply Filters, Regions should display selected origin in global filter on top
    When User Check for the Control tower section it should have the Shipment summary details
    When User Click on the Shipment summary icon Shipment summary page should be opened
    And The page should display "Filter" ,"Export to Excel" and "Result grid with pagination functionality"
    And Inbound shipments section should show two graphs "Shipment Summary","Goods In Transit"

    Examples: 
      | ActualTitle     | Username                |
      | "GVS Home Page" | "Sobhana Priyadarshini" |
