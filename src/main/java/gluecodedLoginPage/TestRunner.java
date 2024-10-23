package gluecodedLoginPage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeaturewithTags",glue = {"gluecodedLoginPage"}, tags="(@smoke and @regression) or @important",
monochrome = true,
plugin = {"pretty" , "html:target/HTMLReports/report.html"}
		
)

public class TestRunner {

	
}
