package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke", features= {"src/test/resources/FeatureWithTags"},
glue= {"StepDefinitionss"},
plugin = {"pretty","html:target/htmlreport.html"})

public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests{

}
