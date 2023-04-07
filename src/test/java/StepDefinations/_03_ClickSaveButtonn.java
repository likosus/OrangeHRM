package StepDefinations;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ClickSaveButtonn {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("Click on Add newButton")
    public void clickOnAddNewButton() {
        dc.jsClickFunction(dc.addBttn);
    }

    @And("click save button before entering mandatory fields")
    public void clickSaveButtonBeforeEnteringMandatoryFields() {

        Actions aksiyonlar = new Actions(GWD.getDriver());
        Action aksiyon5 = aksiyonlar.moveToElement(dc.saveButton)
                .click()
                .build();
        aksiyon5.perform();

        GWD.Bekle(1);
        aksiyon5 = aksiyonlar
                .click()
                .build();
        aksiyon5.perform();




    }

    @Then("verify that notification messaged in red color displayed")
    public void verifyThatNotificationMessagedInRedColorDisplayed() {

        dc.verifyContainsTextFunction(dc.dogrulama3, "Required");




    }


}
