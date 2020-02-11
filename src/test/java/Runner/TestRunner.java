package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="cucumber_demo\\Demo2.Feature",glue= {"stepdef"},plugin= {"html:target//report.html"},monochrome=true)

public class TestRunner {

}
