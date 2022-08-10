 # Test Mercado Libre Groovy-TestNG-REST-Assured
## Resume:
•	To achieve this test framework, the following scenario with Mercado Libre API was taken:

**Carry out a search in Mercado Libre for 3 different items and validate that the search results contain the word used as search criteria.**
________________________________________
•	In order to automate test cases, the following classes and files were created:

***1. build.gradle*** file to define the build configurations that will be applied to all the modules in the project.

***2. Base page groovy class*** to implements methods setting baseUri, Headers, Request Specifications so this can be inherited from other pages.

***3. Page groovy class*** where we are going to implement the methods to validate the test cases.

________________________________________
## Technologies used:

-	Language: Groovy

-	Building Tool: Gradle

-	Libraries: REST Assured-TestNG

* Enviroment Configuration:

  - Download and set JAVA environment variables (JAVA_HOME and PATH):JDK (17.0.2)

  - Download and installation IDE (IntelliJ IDEA)

* TestNG Reports:

  - build/reports/tests/test/index.html
  

* Run Tests:

   - gradle clean
   
   - gradle test -D TestMeli

 
