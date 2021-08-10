# Buggy Cars Rating 
Automation Test Application

## Test Execution

* Build and Run project by Maven
  ```
  mvn clean verify
  ```

* Changing default values on execution with different browsers 
    * Pass argument `-Dwebdriver.driver=firefox` to run tests in Firefox

* Run tests locally using downloaded Chromedriver and Geckodriver
    * Configure values in `src/test/resources/serenity.conf` 
    ````
    webdriver.driver = chrome
    webdriver.chrome.driver = "./webdriver/mac/chromedriver"
    webdriver.base.url = "https://buggy.justtestit.org/"
    ````

* Run Regression Test using Maven with default values
    ```
    mvn clean verify
    ```

* Use IDE to Run Test 
    ```
    Run TestRunner in IDE
    ```

## Tools 
* Git
* Java 8 openjdk version "1.8.0_242-release"
* IDE - This project was set up using [IntelliJ IDEA][IntelliJ] 
* [ChromeDriver][chromedriver] for local execution in parallel or in sequence
* [GeckoDriver][geckodriver] for local execution in sequence only (optional)
* Chrome: 92.0.4515.131 (Official Build) (x86_64)
* FireFox: 90.0.2 (64-bit)
* IntelliJ IDEA 2020.3.2 (Community Edition)
* MacOS Catalina 10.15.7

[serenity]: https://serenity-bdd.github.io/theserenitybook/latest/cucumber.html
[chromedriver]: https://chromedriver.chromium.org/
[geckodriver]: https://github.com/mozilla/geckodriver/releases
[IntelliJ]: https://www.jetbrains.com/idea/download/

