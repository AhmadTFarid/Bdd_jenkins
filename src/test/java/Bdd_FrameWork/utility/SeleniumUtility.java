package Bdd_FrameWork.utility;

import Bdd_FrameWork.BaseSetup.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtility extends BaseSetup {
    private static WebDriverWait wait;
    private static WebElement element;
    public static WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(9));
        return wait;
    }



    public static WebElement getElement(By locator) {
        WebElement element = getWait().until(ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }


    public String getElementText(By Locator) {

        WebElement element= getWait().until(ExpectedConditions.visibilityOfElementLocated(Locator));
        System.out.println("The text is: " + element.getText());
        return element.getText();




    }
}