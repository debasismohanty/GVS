$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/AutomationTraining/UIframework/src/test/java/com/esspl/capability/features/GvsHome3.feature");
formatter.feature({
  "line": 1,
  "name": "GVS-Titan automation - GvsHome3",
  "description": "",
  "id": "gvs-titan-automation---gvshome3",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify the GIT Track Upload Feed by uploading Invalid .xlsx and Invalid Format Template",
  "description": "",
  "id": "gvs-titan-automation---gvshome3;verify-the-git-track-upload-feed-by-uploading-invalid-.xlsx-and-invalid-format-template",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User logged in to GVS-Titan with valid credential",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on hamburger icon Sliding drawer should open with Menu list",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on dataupload link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User upload IT file with the \u003cITFile\u003e with different set of data",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Bottom of the upload feed popup menu with number of \"files selected\" message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click on Upload button to upload the selected file",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Upload should failed with \u003cValidation message\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User upload IF file with the \u003cIFFile\u003e with different set of data",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Bottom of the upload feed popup menu with number of \"files selected\" message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on Upload button to upload the selected file",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Upload should failed with a \u003cFailed Validation message\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "gvs-titan-automation---gvshome3;verify-the-git-track-upload-feed-by-uploading-invalid-.xlsx-and-invalid-format-template;",
  "rows": [
    {
      "cells": [
        "Validation message",
        "Failed Validation message",
        "ITFile",
        "IFFile"
      ],
      "line": 17,
      "id": "gvs-titan-automation---gvshome3;verify-the-git-track-upload-feed-by-uploading-invalid-.xlsx-and-invalid-format-template;;1"
    },
    {
      "cells": [
        "\"100% - Complete\"",
        "\"dddvvv\"",
        "\"fileUpload_STT_IT.exe\"",
        "\"fileUpload_STT_IF.exe\""
      ],
      "line": 18,
      "id": "gvs-titan-automation---gvshome3;verify-the-git-track-upload-feed-by-uploading-invalid-.xlsx-and-invalid-format-template;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 20836318700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify the GIT Track Upload Feed by uploading Invalid .xlsx and Invalid Format Template",
  "description": "",
  "id": "gvs-titan-automation---gvshome3;verify-the-git-track-upload-feed-by-uploading-invalid-.xlsx-and-invalid-format-template;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User logged in to GVS-Titan with valid credential",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on hamburger icon Sliding drawer should open with Menu list",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on dataupload link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User upload IT file with the \"fileUpload_STT_IT.exe\" with different set of data",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Bottom of the upload feed popup menu with number of \"files selected\" message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click on Upload button to upload the selected file",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Upload should failed with \"100% - Complete\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User upload IF file with the \"fileUpload_STT_IF.exe\" with different set of data",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Bottom of the upload feed popup menu with number of \"files selected\" message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on Upload button to upload the selected file",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Upload should failed with a \"dddvvv\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_logged_in_to_GVS_Titan_with_valid_credential()"
});
formatter.result({
  "duration": 20795456900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_click_on_hamburger_icon_Sliding_drawer_should_open_with_Menu_list()"
});
formatter.result({
  "duration": 30255891100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.User_click_on_dataupload_link()"
});
formatter.result({
  "duration": 4104676900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fileUpload_STT_IT.exe",
      "offset": 30
    }
  ],
  "location": "stepDefination.user_upload_IT_file_with_the_with_different_set_of_data(String)"
});
formatter.result({
  "duration": 9641520100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "files selected",
      "offset": 53
    }
  ],
  "location": "stepDefination.Bottom_of_the_upload_feed_popup_menu_with_number_of_message_should_be_displayed(String)"
});
formatter.result({
  "duration": 72810600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_click_on_Upload_button_to_upload_the_selected_file()"
});
formatter.result({
  "duration": 6101697100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100% - Complete",
      "offset": 27
    }
  ],
  "location": "stepDefination.upload_should_failed_with(String)"
});
