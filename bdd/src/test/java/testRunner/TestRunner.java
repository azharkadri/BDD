package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Kiran\\Desktop\\ak\\newworkspace\\bdd\\src\\test\\java\\features\\_LoginFeature.feature",
		glue = {"stepDefinitions"},
		strict=true,
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:test-output"}
		)

public class TestRunner {

}
