Feature: Automation test


  @UIT
 Scenario Outline: Launch browser
  Given Open "<browser>" with predefined options
    Examples:
      |browser|
      |chrome |
      #|edge   |
      #|opera  |
  @UIT
  Scenario: Navigate to automation practice and search
    Given navigate to automation practice
    Then search for eminem

