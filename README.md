# Cucumber with Java


#### Cucumber uses a language called gherkin
[gherkin](https://docs.behat.org/en/v2.5/guides/1.gherkin.html)
*****
#### Behavior Driven Development
[BDD](https://en.wikipedia.org/wiki/Behavior-driven_development)
#### Cucumber
[Cucumber](https://cucumber.io/docs/guides/10-minute-tutorial/)
#### Steps
1. Add Cucumber dependencies to pom.xml
2. In test/resources create the feature file. Feature is the behavior which is implementation of user story.
3. Write the feature file. With details like Feature, Scenario: Given When Then
  
````
Feature: FizzBuzz Game play

  Scenario: Play FizzBuzz to get Fizz
    Given Create a FizzBuzz game play
    When I play with number 3
    Then The result is "Fizz"

  Scenario: Play FizzBuzz to get Buzz
    Given Create a FizzBuzz game play
    When I play with number 5
    Then The result is "Buzz"

  Scenario: Play FizzBuzz to get FizzBuzz
    Given Create a FizzBuzz game play
    When I play with number 15
    Then The result is "FizzBuzz"
````   
4. Create Step definitions. These are steps for each steps written in feature file like given, when, then.
5. Use IntelliJ feature to create step definition for each steps.
6. Add logic to each step definition.