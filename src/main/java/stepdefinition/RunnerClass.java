package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = {"stepdefinition"},
monochrome = true,
plugin = {"pretty" , "html:target/HTMLReports/report.html",
		"pretty" , "json:target/JSONReports/report.json",
		"pretty" , "junit:target/JUNITReports/report.junit"}
)

public class RunnerClass 
{
	

}
