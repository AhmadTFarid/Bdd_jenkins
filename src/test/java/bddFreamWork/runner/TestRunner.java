package bddFreamWork.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "bddFrameWork.steps",
        tags = "@US_4",
        plugin = {
                "html:target/html_report/report.html"
        }
)

public class TestRunner {
}
