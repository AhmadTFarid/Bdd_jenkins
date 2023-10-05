package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tek.bdd.utility.SeleniumUtility;

import java.io.File;
import java.io.IOException;


public class hooks extends SeleniumUtility {
    //This is Hook will be executed by cucumber
    //before and after each scenario
    @Before
    public void setUpTests() {
        openBrowser();
    }


    @After
    public void cleanUpTests() throws IOException {


        TakesScreenshot ts = (TakesScreenshot) getDriver();
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\screenshots\\Homepage.png");
        FileUtils.copyFile(src, trg);

/*
        if (scenario.isFailed()) {
            byte[] picture = takeScreenshot();
            //Step 2) Attached screenshot to Scenario
            scenario.attach(picture, "image/png", "failedScreenShot");
            */

            closeBrowser();
        }
}