package Bdd_FrameWork.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "Bdd_FrameWork.steps",
        tags = "@Smock",
        plugin = {
                "html:target/html_report/report.html"
        }
)

public class TestRunner {
}
