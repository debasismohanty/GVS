Feature: GVS-Titan automation - GvsHome3

  Scenario Outline: Verify the GIT Track Upload Feed by uploading Invalid .xlsx and Invalid Format Template
    Given User logged in to GVS-Titan with valid credential
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then User click on dataupload link
    When User upload IT file with the <ITFile> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    And User click on Upload button to upload the selected file
    Then Upload should failed with <Validation message>
    When User upload IF file with the <IFFile> with different set of data
    Then Bottom of the upload feed popup menu with number of "files selected" message should be displayed
    And User click on Upload button to upload the selected file
    Then Upload should failed with a <Failed Validation message>

    Examples: 
      | Validation message | Failed Validation message                                | ITFile                  | IFFile                  |
      | "100% - Complete"  | "dddvvv" | "fileUpload_STT_IT.exe" | "fileUpload_STT_IF.exe" |
