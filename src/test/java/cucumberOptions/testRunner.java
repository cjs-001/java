package cucumberOptions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature",glue ="stepDefinitions",
                 monochrome=true)


public class testRunner {

}
