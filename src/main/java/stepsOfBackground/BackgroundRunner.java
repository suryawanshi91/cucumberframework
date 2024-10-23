package stepsOfBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureWithBackground",glue = {"stepsOfBackground"},
monochrome = true,
plugin = {"pretty" , "html:target/HTMLReports/report.html"})

public class BackgroundRunner {

}
