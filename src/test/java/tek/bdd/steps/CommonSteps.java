package tek.bdd.steps;

import org.openqa.selenium.By;
import tek.bdd.BaseSetup;

public class CommonSteps extends BaseSetup {
    public static final By PageTitle = By.xpath("//mat-toolbar/span[1]");
    public static final By ActualTitle = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-title[1]/strong");
    public static final By ButtonDisable = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/form/mat-card-actions/button[1]/span[1]");

     public static final By username = By.name("username");
     public static final By password = By.name("password");
     public static final  By loginButtom = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/form/mat-card-actions/button[1]");
     public static final  By TekInsuranceAppTitle = By.xpath("//mat-toolbar/span[1]");
     public static final  By SupervisorTitle = By.xpath("/html/body/app-root/app-home-page/div/app-toolbar/mat-toolbar/button[2]/span[1]");
     public static final  By LoginUserErorrMasage = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/app-banner/div");
    public static final  By LoginPasswordErorrMasage = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/app-banner/div");
}

