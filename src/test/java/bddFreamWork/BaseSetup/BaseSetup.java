package bddFreamWork.BaseSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {
    private static WebDriver driver;
    private final String url= " https://qa.insurance.tekschool-students.com";

    public void openBrowser(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get(url);
    }

    public void closeBrowser(){

        driver.quit();
}




    public static WebDriver getDriver() {
        return driver;
    }
}
