package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="src/test/resources/features",
        glue ={"stepDefinitions"},
        tags ="@Precondition",
        plugin ={"pretty", "json:target/cucumber-json-reports/Cucumber.json",
                "junit:target/cucumber-xml-reports/Cucumber.xml",
                "html:target/cucumber-html-reports"},
        dryRun = false

)

public class runner {

}
