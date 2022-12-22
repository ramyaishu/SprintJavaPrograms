Feature: Testing Karate Feature
  Scenario: Print Hobbies
    Given url 'https://coderbyte.com/api/challenges/json/rest-get-simple'
    When method get
    Then status 200
    When def res = response.hobbies
    Then print "Item1:", res[0]+"\n"+"Item2:",res[1]+"\n"+"Item3:",res[2]
