package StepDefinations;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _02_CreatingEssUser {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("click save button before entering mandatory field")
    public void clickSaveButtonBeforeEnteringMandatoryField() {

       dc.clickFunction(dc.saveButton);

    }

    @Then("verify that notification messages in red color displayed")
    public void verifyThatNotificationMessagesInRedColorDisplayed() {
    }
}
