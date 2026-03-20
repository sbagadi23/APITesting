Feature: Sample Karate Test

  Scenario: Test a public API
    Given url 'https://jsonplaceholder.typicode.com/posts/1'
    When method GET
    Then status 200
    And match response.id == 1