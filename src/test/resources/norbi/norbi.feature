Feature: the message can be retrieved
  Scenario: client makes call to GET /norbi
    Given the client calls as get /norbi
    When the client receives status code of 200
    Then the client receives server version norbi