@Smock
Feature:Test Application Tile

  @US_1
  Scenario: get the application title

    Then Validate application title should be "Tek Insurance Service"


  @US_2
  Scenario: Validate the page head title

    Then Validate the header title is "TEK Insurance Portal"


  @US_3
  Scenario: Validate Login Section Title

    Then Validate the header title is "TEK Insurance Portal"
    Then Validate login section title "Customer Service Portal"

  @US_4
  Scenario:Validate login button Section

    Then Validate login button is "disabled"
    When Enter username as "supervisor"
    When Enter password as "tek_supervisor"
    Then Validate login button its "enabled"


  @US_5
  Scenario:Validate Title after logged in

    When Enter username as "supervisor"
    When Enter password as "tek_supervisor"
    When Click on login buttons
    Then Validate the header title  "Tek Insurance App"
    Then Validate logged in username is "Supervisor"


  @US_6
  Scenario Outline:Validate error message username
    When Enter username as "<username>"
    When Enter password as "<password>"
    When Click on login button
    Then Validate error message "<error massage>"
    Examples:
      | username    | password        | error massage        |
      | supervisorq | tek_supervisor  | User not found       |
      | supervisor  | tek_supervisorq | Password Not Matched |
      | supervisor  | farid           | Password Not Matched |
      | tariq       | tek_supervisor  | User not found       |


  @US_7
  Scenario:

    Given Login with username as "supervisor" and password as "tek_supervisor"
    When Click on login button
    When Wait 2 Second
    When Click on "Plans" Link
    Then Validate Section title is "Plans"
    Then Validate Table row is 4
    And Validate All Plans are Valid






