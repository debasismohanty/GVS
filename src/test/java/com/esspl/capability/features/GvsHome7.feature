Feature: GVS-Titan automation - GvsHome7

  Scenario Outline: Verify the status by uploading valid data file
    Given User logged in to GVS-Titan with valid credential
    When User click on hamburger icon Sliding drawer should open with Menu list
    Then User click on Track Upload status
    Then User checks for the selected fields' availability
    And Track upload status contains accurate values like <Uploaded by user> ,<actual file> , <feedtype> , <status> , <Total rows> and <rows failed>
    And For failed transactions there must be a hyperlink on failed rows and error log page contains same no of failed rows

    Examples: 
      | Uploaded by user        | actual file          | feedtype | status      | Total rows | rows failed |
      | "Sobhana Priyadarshini" | "Template_STT_VD"    | "STT"    | "Processed" | "1,040"    | ""          |
      | "Sobhana Priyadarshini" | "Template_STT_DD"    | "STT"    | "Processed" | "1,061"    | "24"        |
      | "Sobhana Priyadarshini" | "Template_STT_VTVID" | "STT"    | "Processed" | "1,040"    | "1,040"     |
