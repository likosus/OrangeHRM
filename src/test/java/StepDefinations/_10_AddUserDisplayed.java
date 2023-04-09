package StepDefinations;

import Pages._10_Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _10_AddUserDisplayed {

    _10_Steps st10=new _10_Steps();
    @When("Login as an Admin and navigate to Admin UserManagement PageTen")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPageTen() {
        st10.sendKeysFunction(st10.username10, "Admin");
        st10.sendKeysFunction(st10.Passpord10, "admin123");
        st10.waitUntilClickable(st10.clicklogin10);
        st10.clickFunction(st10.clicklogin10);
    }

    @And("Click on Add ButtonTen")
    public void clickOnAddButtonTen() {
        st10.clickFunction(st10.Adminclick10);
        st10.clickFunction(st10.addBttn10);
    }

    @Then("verify add user heading displayed")
    public void verifyAddUserHeadingDisplayed() {

        st10.verifyContainsTextFunction(st10.dogrulama10, "Add User");

    }
}