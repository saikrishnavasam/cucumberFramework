package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features="src/test/resources/features",
        glue ={"stepDefinitions","cucumberHooks"},
        tags ={"@UIT"},
        plugin ={"pretty",
                "cucumberHooks.customReportListener",
                "json:target/cucumber-json-reports/Cucumber.json",
                "junit:target/cucumber-xml-reports/Cucumber.xml",
                "html:target/cucumber-html-reports"},
        dryRun = false

)

public class runner {

}
