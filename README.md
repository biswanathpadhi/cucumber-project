# Sample Cucumber Project

- [Cucumber](https://cucumber.io/) is a framework/library that we supports BDD (Behavioural Driver Development).

- It has 3 major componenets namely as below
 
    1. Feature file: file with .feature extension where the scenarios are written
    2. Step definitition:
Java classes that contains the definition i.e. the implementation for the steps defined in feature file scenarios.
    3. Test Runner: Not mandatory but needed to have a better control on running all features via a single file. 
    Note: It should end with *Test to be able to run as Junit test from mvn
### Steps to implement cucumber:
- BA/PO/Dev/QA writes the requirements in plain english laguage ( [Gherkin](https://cucumber.io/docs/gherkin/reference/) )  in a .feature file
- Dev/QA writes the implementation for the steps mentioned in the feature files
- Create a test runner file to run the feature files as test

----------



#### **Sample feature file:**
[search.feature](src\test\resources\appfeatures\search.feature)

#### **Sample definition file:**
[SearchStepDefinition.feature](src\test\java\stepdefinitions\SearchStepDefinition.java)
