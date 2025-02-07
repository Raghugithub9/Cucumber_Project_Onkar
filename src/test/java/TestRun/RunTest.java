package TestRun;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//Features/LoginWithData.feature" }, glue = { "stepDefinationFiles",
		"basePackage" }, tags = "@Sanity", dryRun = false, monochrome = false, plugin = { "pretty",
				"html:Reports/cucumber-reports.html" })

public class RunTest {

}
