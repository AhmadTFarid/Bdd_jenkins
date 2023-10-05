package bddFreamWork.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "tek.bdd.steps",
        tags = "@US_7",
        plugin = {
                "html:target/html_report/report.html"
        }
)

public class TestRunner {
}
