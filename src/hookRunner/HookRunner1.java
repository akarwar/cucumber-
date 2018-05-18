package hookRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features= {"features"}, // path to the feature file
		glue= {"stepDefinition"}, //path to the step definition folder 
		tags= {"@Firefox"},
		format = {"pretty","html:target/cucumber-html-report" ,"json:json_output/cucumber.json"},
		dryRun = false,
		strict = true, // if the steps are not defined it will fail
		monochrome = true //display the console output in a readable format
		)


public class HookRunner1 {
	

}





