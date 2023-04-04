package StepDefinations;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginStep {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Login as an Admin and navigate to Admin UserManagement Page")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPage() {
      dc.sendKeysFunction(dc.username,"Admin");
      dc.sendKeysFunction(dc.Passpord,"admin123");
      dc.waitUntilClickable(dc.clicklogin);
      dc.clickFunction(dc.clicklogin);

    }

    @Then("Click on Add Button")
    public void clickOnAddButton() {
        ln.waitUntilClickable(ln.Adminclick);
        ln.clickFunction(ln.Adminclick);

    }

    @When("Entering the required info to the all input boxes and Click Save Button")
    public void enteringTheRequiredInfoToTheAllInputBoxesAndClickSaveButton() {

        dc.waitUntilClickable(dc.addBttn);
        dc.clickFunction(dc.addBttn);
        dc.waitUntilClickable(dc.userRole);
        dc.clickFunction(dc.userRole);
        dc.waitUntilClickable(dc.status);
        dc.clickFunction(dc.status);
        dc.waitUntilClickable(dc.EmployeeName);
        dc.sendKeysFunction(dc.EmployeeName, "Paul  Collings");
        dc.sendKeysFunction(dc.usernameRe,"Group16");
        dc.sendKeysFunction(dc.PasswordRe, "admin123");



    }

    @Then("Verify that ESS is added on the list")
    public void verifyThatESSIsAddedOnTheList() {

    }


}
