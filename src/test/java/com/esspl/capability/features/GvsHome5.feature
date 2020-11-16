Feature: GVS-Titan automation - GvsHome5

  Scenario Outline: Verify the Shipment Summary Feed by uploading Invalid .xlsx Template
    Given User logged in to GVS-Titan with valid credential
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then User click on dataupload link
    When User upload with the <File> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    And User click on Upload button to upload the selected file
    Then Upload should failed with <Validation message>

    Examples: 
      | Validation message | File                                                                                                     |
      | "100% - Complete"  | "D:\\GVS_TITAN_AUTOMATION\\Titan\\src\\main\\java\\com\\esspl\\capability\\autoIT\\fileUpload_ST_IT.exe" |

  Scenario Outline: Verify the Shipment Summary Feed by uploading different  format file
    Given User logged in to GVS-Titan with valid credential
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then User click on dataupload link
    When User upload with the <File> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    And User click on Upload button to upload the selected file
    Then Upload should failed with a <Validation message>

    Examples: 
      | Validation message                                       | File                                                                                                     |
      | "Invalid file format. Please upload only *.xlsx file(s)" | "D:\\GVS_TITAN_AUTOMATION\\Titan\\src\\main\\java\\com\\esspl\\capability\\autoIT\\fileUpload_ST_IF.exe" |
