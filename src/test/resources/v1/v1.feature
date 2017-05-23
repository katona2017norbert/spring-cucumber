Feature: the message can be retrieved
  Scenario: client makes call to GET /test1
    Given the client calls as get /test1
    When the client receives status code of 200
    Then the client receives server version test1
  Scenario: client makes call to GET /test2
    Given the client calls as get /test2
    When the client receives status code of 200
    Then the client receives server version test2