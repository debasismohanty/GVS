Feature: GVS TITAN Scenario

  Scenario Outline: Verify the Goods In Transit Summary Dashboard page..
    When User logged in to GVS-Titan with valid credential
    And User click on hamburger icon Sliding drawer should open with Menu list
    And Click on GIT Dashboard submenu of <MenuItem>
    Then <Required> page opened which contains number of fields as specified
    And <Required> grid contains number of columns as specified
    And Validate Docket number is hyperlinked
    Then Validate Delivered column contains green check mark against delivered docket
    And Validate POD column contains Upload and down load link against each available record
    When User validate Upload functionality with pdf,image and excel files then excel uploaded file shows error
    And Validate download functionality
    And After successfull upload of <Required> feed , successfull records should displayed on the grid
    When User enter a keyword to search then value displayed on that search criteria basis
    When User click on docket no it redirect to <Pages> where number of fields available to validate
    When User click on Back button it redirects to <Required> page.
    And Check for Ascending and Descending of Sorting functionality
    Then Click on hamburger icon and validate sorting functionality and columns field and its submenu functionality
    And validate Rec per page availability and its functionality
    And Validate Pagination functionality
    Then click on excel export and validate required fields are present as per documentation
    When Click on Quick search and filter with some value then records should be displayed as per documentation
    Then Click on Excel export and validate same records present in the excel sheet

    Examples: 
      | Required        | MenuItem     | Pages                   |
      | "GIT Dashboard" | "Visibility" | "shipment details page" |
