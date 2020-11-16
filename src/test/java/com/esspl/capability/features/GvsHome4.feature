Feature: GVS-Titan automation - GvsHome4

  Scenario Outline: Download the Template and Verify the Shipment Summary Feed with valid template and valid data
    Given User logged in to GVS-Titan with valid credential
    When User click on hamburger icon Sliding drawer should open with Menu list
    When User selects the <Feed Type>  option from the Feed Type dropdown <Feed Type> field should be selected
    When User clicks on the Template download link <Feed Type> should be downloaded
    When User checks for template ,it should contain fields as expected
    When User upload with the <File> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    When User clicks on the upload button to upload "File upload is in progress" message should be displayed
    And Once uploaded process completed "100% - Complete" message should be displayed
    When User closes the Upload Feed pop up, it should be closed

    Examples: 
      | Feed Type               | File                                                                                                  |
      | "Shipment Summary Feed" | "D:\\GVS_TITAN_AUTOMATION\\Titan\\src\\main\\java\\com\\esspl\\capability\\autoIT\\fileUpload_ST.exe" |

  Scenario Outline: Verify the Shipment Summary Feed by uploading duplicate file
    Given User logged in to GVS-Titan with valid credential
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then User click on dataupload link
    When User upload with the <File> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    When User clicks on the upload button to upload "File upload is in progress" message should be displayed
    And Once uploaded process completed "100% - Complete" message should be displayed
    When User closes the Upload Feed pop up, it should be closed

    Examples: 
      | File                                                                                                     |
      | "D:\\GVS_TITAN_AUTOMATION\\Titan\\src\\main\\java\\com\\esspl\\capability\\autoIT\\fileUpload_ST_DD.exe" |

  Scenario Outline: Verify the Shipment Summary Feed by uploading Multiple  files
    Given User logged in to GVS-Titan with valid credential
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then User click on dataupload link
    When User upload with the <File> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    When User clicks on the upload button to upload "File upload is in progress" message should be displayed
    And Once uploaded process completed "100% - Complete" message should be displayed
    When User closes the Upload Feed pop up, it should be closed

    Examples: 
      | File                                                                                                  |
      | "D:\\GVS_TITAN_AUTOMATION\\Titan\\src\\main\\java\\com\\esspl\\capability\\autoIT\\fileUpload_ST_MF0.exe" |
      | "D:\\GVS_TITAN_AUTOMATION\\Titan\\src\\main\\java\\com\\esspl\\capability\\autoIT\\fileUpload_ST_MF1.exe" |

  Scenario Outline: Verify the Shipment Summary Feed by uploading valid Template and invalid data
    Given User logged in to GVS-Titan with valid credential
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then User click on dataupload link
    When User upload with the <File> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    When User clicks on the upload button to upload "File upload is in progress" message should be displayed
    And Once uploaded process completed "100% - Complete" message should be displayed
    When User closes the Upload Feed pop up, it should be closed

    Examples: 
      | File                                                                                                       |
      | "D:\\GVS_TITAN_AUTOMATION\\Titan\\src\\main\\java\\com\\esspl\\capability\\autoIT\\fileUpload_ST_VTID.exe" |

  Scenario Outline: Verify the Shipment Summary Feed by uploading valid Template and valid & invalid records
    Given User logged in to GVS-Titan with valid credential
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then User click on dataupload link
    When User upload with the <File> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    When User clicks on the upload button to upload "File upload is in progress" message should be displayed
    And Once uploaded process completed "100% - Complete" message should be displayed
    When User closes the Upload Feed pop up, it should be closed

    Examples: 
      | File                                                                                                        |
      | "D:\\GVS_TITAN_AUTOMATION\\Titan\\src\\main\\java\\com\\esspl\\capability\\autoIT\\fileUpload_ST_VTVID.exe" |
