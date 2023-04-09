package StepDefinations;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages._03_Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _03_ClickSaveButton {

    _03_Steps st3 = new _03_Steps();
    LeftNav ln = new LeftNav();

    @When("Click on Add Button New")
    public void clickOnAddButtonNew() {

        st3.jsClickFunction(st3.addBttn3);

        st3.clickFunction(st3.closebutton3);

    }

    @When("Login as an Admin and navigate to Admin UserManagement Page New")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPageNew() {

        st3.sendKeysFunction(st3.username3, "Admin");
        st3.sendKeysFunction(st3.Passpord3, "admin123");
        st3.waitUntilClickable(st3.clicklogin3);
        st3.clickFunction(st3.clicklogin3);

        st3.waitUntilClickable(st3.Adminclick3);
        st3.clickFunction(st3.Adminclick3);
    }

    @And("click save button before entering mandatory fields")
    public void clickSaveButtonBeforeEnteringMandatoryFields() {

        st3.clickFunction(st3.saveButton3);

    }
    @Then("verify that notification messaged in red color displayed")
    public void verifyThatNotificationMessagedInRedColorDisplayed() {

        for (WebElement w : st3.HataMessages3) {
            Assert.assertTrue(w.isEnabled());
        }
    }
}