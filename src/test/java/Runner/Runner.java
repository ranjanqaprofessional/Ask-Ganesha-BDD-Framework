package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// Path to feature files
	    //features = "src/test/resources/features",
		features = {
		"src/test/resources/features/HomePage.feature",
		"src/test/resources/features/Login.feature",
		"src/test/resources/features/LovePage.feature"
		},
	    // Path to step definitions and hooks
	    glue = {"StepDefinitions", "Hooks"},

	    // Tags to control which scenarios to run
	   // tags = "@smoke or @regression",

	    // Plugins for reporting
	    plugin = {
	        "pretty",                                // Console output
	        "html:target/cucumber-reports.html",     // HTML report
	        "json:target/cucumber.json",             // JSON report
	        "junit:target/cucumber.xml",              // JUnit XML report
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // Extent Reports
	    },

	    // Display console output in readable format
	    monochrome = true,

	    // Dry run: true = check mapping only, false = execute tests
	    dryRun = false

	   

)

public class Runner {

}
