package cbt;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber/",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/cbt",
        glue = "com/trycloud/step_definitions"
)
public class CukesRunner {}