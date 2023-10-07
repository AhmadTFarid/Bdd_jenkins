package Bdd_FrameWork.utility;

import Bdd_FrameWork.BaseSetup.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class buttonUtility extends BaseSetup {


        public String getTextOfElement(By locator ){
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return text.getText();
        }



        public boolean isElementEnable(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.isEnabled();


    }
         public  void enterValue(By locator , String text){
         WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
         WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
         element.sendKeys(text);

     }
}