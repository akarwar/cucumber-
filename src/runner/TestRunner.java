package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"features"},
glue= {"stepdefination"},
tags= {"@Sprint1","@Firefox"}

//dryRun=false,
//strict=true,//if the steps are not defined it will fail
//monochrome=true // display the console output in a readable format
)
public class TestRunner {

}
