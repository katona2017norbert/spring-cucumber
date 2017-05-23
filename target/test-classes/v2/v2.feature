Feature: the message can be retrieved
  Scenario: client makes call to GET /egy2ketto5
    Given the client calls as get /egy2ketto5
    When the client receives status code of 200
    Then the client receives server version 7
    
  Scenario: client makes call to GET /egy3ketto1
    Given the client calls as get /egy3ketto1
    When the client receives status code of 200
    Then the client receives server version 4
    
  Scenario: client makes call to GET /egy5ketto1
    Given the client calls as get /egy5ketto1
    When the client receives status code of 200
    Then the client receives server version 6