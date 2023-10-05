package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import tek.bdd.utility.buttonUtility;
import tek.bdd.BaseSetup;

public class buttonEnable extends buttonUtility {

    @Then("Validate login button is {string}")
    public void validateLoginButtonIs(String disablebottom) {
        boolean disable = BaseSetup.getDriver().findElement(CommonSteps.ButtonDisable).isSelected();
        Assert.assertFalse(disable);
        System.out.println(disablebottom);

     /*boolean actualeCondatin = isElementEnable(CommonSteps.buttonEnable);
     if ( expectedCondatin.equalsIgnoreCase("enable") ) {
         Assert.assertTrue("login Buttom is enable", actualeCondatin);
     }else if (expectedCondatin.equalsIgnoreCase("disable")) {
         Assert.assertFalse("login buttom isdiable ", actualeCondatin);
     }*/
    }

    @When("Enter username as {string}")
    public void  enterUsernameAs(String username) {

        enterValue(CommonSteps.username, username);


    }

    @When("Enter password as {string}")
    public void enterPasswordAs(String password) {
        enterValue(CommonSteps.password, password);

    }


    @Then("Validate login button its {string}")
    public void validateLoginButtonIts(String enablebottom) {
        boolean enable = BaseSetup.getDriver().findElement(CommonSteps.ButtonDisable).isEnabled();
        Assert.assertTrue(enable);
        System.out.println(enablebottom);
    }

    @When("Click on login button")
    public void clickOnLoginButton() throws InterruptedException {
        BaseSetup.getDriver().findElement(CommonSteps.loginButtom).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
    }


    @When("Click on login buttons")
    public void clickOnLoginButtons() {
        BaseSetup.getDriver().findElement(By.id("loginButton")).sendKeys(Keys.RETURN);

    }

    @Then("Validate the header title  {string}")
    public void validateTheHeaderTitle(String firstTitle) {
        BaseSetup.getDriver().findElement(CommonSteps.TekInsuranceAppTitle).getText();
        System.out.println("First Title is: " + firstTitle);

    }

    @Then("Validate logged in username is {string}")
    public void validateLoggedInUsernameIs(String secondTitle) {
        BaseSetup.getDriver().findElement(CommonSteps.SupervisorTitle).getText();
        System.out.println("Second Title is: "+ secondTitle);
    }
}



