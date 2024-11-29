package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",          // Path to the feature files
        glue = {"stepDefinitions"},                        // Package containing step definition classes
        plugin = {
                "pretty",                                  // Prints Gherkin steps in the console
                "html:target/cucumber-reports/cucumber.html", // Generates HTML report
                "json:target/cucumber-reports/cucumber.json"  // Generates JSON report
        },
        monochrome = true,                                 // Makes console output readable
        dryRun = false,                                    // Set to true to check step mapping without execution
        tags = "@SmokeTest"                                // Runs scenarios with the given tag
)
public class TestRunner {
}
