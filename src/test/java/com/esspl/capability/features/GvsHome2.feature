Feature: GVS-Titan automation - GvsHome02

  Scenario Outline: Download the Template and Verify the GIT Track Upload Feed with valid template and valid data
    Given User logged in to GVS-Titan with valid credential
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then Click on Data Upload
    When User selects the <Feed Type>  option from the Feed Type dropdown <Feed Type> field should be selected
    When User clicks on the Template download link <Feed Type> should be downloaded
    When User checks for template , it should have fields as expected
    When User upload Valid file with the <VDFile> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    When User clicks on the upload button to upload "File upload is in progress" message should be displayed
    And Once uploaded process completed "100% - Complete" message should be displayed
    When User closes the Upload Feed pop up, it should be closed
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then Click on Data Upload
    When User upload Duplicate file with the <DDFile> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    When User clicks on the upload button to upload "File upload is in progress" message should be displayed
    And Once uploaded process completed "100% - Complete" message should be displayed
    When User closes the Upload Feed pop up, it should be closed
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then Click on Data Upload
    When User upload Multiple file one with the <MF0File> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    When User clicks on the upload button to upload "File upload is in progress" message should be displayed
    And Once uploaded process completed "100% - Complete" message should be displayed
    When User closes the Upload Feed pop up, it should be closed
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then Click on Data Upload
    When User upload Multiple file two with the <MF1File> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    When User clicks on the upload button to upload "File upload is in progress" message should be displayed
    And Once uploaded process completed "100% - Complete" message should be displayed
    When User closes the Upload Feed pop up, it should be closed
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then Click on Data Upload
    When User upload VTID file with the <VTIDFile> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    When User clicks on the upload button to upload "File upload is in progress" message should be displayed
    And Once uploaded process completed "100% - Complete" message should be displayed
    When User closes the Upload Feed pop up, it should be closed
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then Click on Data Upload
    When User upload VTVID with the <VTVIDFile> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    When User clicks on the upload button to upload "File upload is in progress" message should be displayed
    And Once uploaded process completed "100% - Complete" message should be displayed
    When User closes the Upload Feed pop up, it should be closed

    Examples: 
      | Feed Type           | VDFile                  | DDFile                  | MF0File                  | MF1File                  | VTIDFile                  | VTVIDFile                  |
      | "GIT tracking feed" | "fileUpload_STT_VD.exe" | "fileUpload_STT_DD.exe" | "fileUpload_STT_MF0.exe" | "fileUpload_STT_MF1.exe" | "fileUpload_STT_VTID.exe" | "fileUpload_STT_VTVID.exe" |
