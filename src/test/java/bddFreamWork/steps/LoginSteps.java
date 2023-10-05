package bddFreamWork.steps;

import bddFreamWork.BaseSetup.BaseSetup;
import bddFreamWork.utility.SeleniumUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginSteps extends SeleniumUtility {


    @Then("Validate application title should be {string}")
    public void validateApplicationTitleShouldBe(String ActualTitle)  {
        BaseSetup.getDriver().getTitle();
        String ExpectedTitle = "Tek Insurance Service";
        Assert.assertEquals("Tek Insurance Service",ExpectedTitle,ActualTitle);
        System.out.println(BaseSetup.getDriver().getTitle());

    }

    @Then("Validate the header title is {string}")
    public void validateTheHeaderTitleIs(String ActualHeather) {
        String ExpectedTitle = getElementText(CommonSteps.PageTitle);
        Assert.assertEquals("Validation Head Title",
                ExpectedTitle,
                ActualHeather);
      /* ActualHeather = getDriver().findElement(By.xpath("/html/body/app-root/app-login/mat-toolbar/span[1]")).getText();
       String ExpectedTitle = "TEK Insurance Portal";
       Assert.assertEquals("validate Title", ExpectedTitle,ActualHeather);
       System.out.println("The Actuale Hether is :"+ActualHeather);
      String heather=  getDriver().findElement(By.xpath("/html/body/app-root/app-login/mat-toolbar/span[1]")).getText();
        System.out.println(heather);
        Assert.assertEquals(heather,ActualHeather);

       WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(3));

        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-toolbar/span[1]")));
        ActualHeather = title.getText();
        String ExpectedTitle = "TEK Insurance Portal";
*/




    }

    @Then("Validate login section title {string}")
    public void validateLoginSectionTitle(String ActualePortle) {
        ActualePortle= getElementText(CommonSteps.ActualTitle);
        String ExpectedPortal ="Customer Service Portal";
        Assert.assertEquals("header validation" ,
                ActualePortle
               ,ExpectedPortal);
    }

    @Then("Validate error message {string}")
    public void validateErrorMessage(String actualMassage) {
        if (actualMassage.equalsIgnoreCase("User not found"))
        {
            String expectedMassage = BaseSetup.getDriver().findElement(CommonSteps.LoginUserErorrMasage).getText();
            Assert.assertEquals("Validate error message",actualMassage,expectedMassage);
            System.out.println(actualMassage);


        } else if ( actualMassage.equalsIgnoreCase("Password Not Matched")){
            String expectedMassage = BaseSetup.getDriver().findElement(CommonSteps.LoginPasswordErorrMasage).getText();
            Assert.assertEquals("Validate error message",actualMassage,expectedMassage);
            System.out.println("Your Actual Rrorr Massage is: "+ actualMassage);
        }

        }

    @Given("Login with username as {string} and password as {string}")
    public void loginWithUsernameAsAndPasswordAs(String username, String password) {
        BaseSetup.getDriver().findElement(CommonSteps.username ).sendKeys("supervisor");
        BaseSetup.getDriver().findElement(CommonSteps.password).sendKeys("tek_supervisor");
      

    }

    @When("Wait {int} Second")
    public void waitSecond(int second) throws InterruptedException {
        Thread.sleep(1000);

    }

    @When("Click on {string} Link")
    public void clickOnLink(String xpath) throws InterruptedException {
        BaseSetup.getDriver().findElement(By.xpath("/html/body/app-root/app-home-page/mat-drawer-container/mat-drawer/div/app-menu-items/mat-nav-list/a[2]")).sendKeys(Keys.RETURN);
        Thread.sleep(1000);
    }

    @Then("Validate Section title is {string}")
    public void validateSectionTitleIs(String title) {
       title= BaseSetup.getDriver().findElement(By.xpath("/html/body/app-root/app-home-page/mat-drawer-container/mat-drawer/div/app-menu-items/mat-nav-list/a[2]/span[1]/span")).getText();
        System.out.println(title);
    }

    @Then("Validate Table row is {int}")
    public void validateTableRowIs(int pageElement) {

        List<WebElement> plan = BaseSetup.getDriver().findElements(By.xpath("/html/body/app-root/app-home-page/mat-drawer-container/mat-drawer-content/div/app-plans-list/mat-card/mat-card-content/mat-card/mat-card-content/div/table/thead/tr"));

           for ( WebElement planElements :plan ){
            System.out.println("element for plans page is: " + planElements.getText().trim().concat("|"));
        }

    }

    @And("Validate All Plans are Valid")
    public void validateAllPlansAreValid() {
        List<WebElement> callam = BaseSetup.getDriver().findElements(By.xpath("/html/body/app-root/app-home-page/mat-drawer-container/mat-drawer-content/div/app-plans-list/mat-card/mat-card-content"));
        for ( WebElement allCallam :callam ){
             System.out.println("all Elements : "+ allCallam.getText().trim().concat("|"));
         }
    }
}
