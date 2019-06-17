# This project utilizes Serenity Framework

Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured. 

## How to run the project
Clone or download this project from Github.

## Executing the tests
To run the project, key in `mvn verify` or `gradle test` from the command line.

By default, the tests will run using Chrome Headless for the purpuse of CI/CD implementation.

In order to turn of the headless mode, use `mvn verify -Ddriver=chrome -Dheadless.mode=false`

To run them in Firefox by overriding the `driver` system property, e.g.

```json
$ mvn verify -Ddriver=firefox
```
Or 
```json
$ gradle test -Pdriver=firefox
```
## Test Execution Report
The test results will be recorded in the `target/site/serenity` directory.
```index.html``` provides the comprehensive html report about the test execution.

## Serenity configuration
Serenity uses the `serenity.conf` file in the `src/test/resources` directory to configure test execution options.  

