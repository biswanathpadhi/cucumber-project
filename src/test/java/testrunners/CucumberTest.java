package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { 
//		"src/test/resources/appfeatures",
		"src/test/resources/appfeatures/userregistration.feature"}, // To list the features, we can mention multiple
																	// packages/feature files
		glue = { "stepdefinitions", "hooks" }, // To connect features to step definition, and also hooks
		plugin = { "pretty", // To print console output in a nice format
				"json:target/reports/report.json", "junit:target/reports/report.xml" 
				},

		tags = "@exampleswithdecimal", // we can use or, and, not keyword with multiple tags
		publish = false, // either via CucumberOptions here or via Cucumber.properties file
		dryRun = false, // set to true if you just want to check if all steps have the step definition
		strict = true

)
public class CucumberTest {

}
