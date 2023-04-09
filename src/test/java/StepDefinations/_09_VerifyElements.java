package StepDefinations;

import Pages._09_Steps;
import Pages._11_Steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _09_VerifyElements {

   _09_Steps st9=new _09_Steps();
    @When("Login as an Admin and navigate to Admin UserManagement Page nine")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPageNine() {
        st9.sendKeysFunction(st9.username9,"Admin");
        st9.sendKeysFunction(st9.Passpord9,"admin123");
        st9.waitUntilClickable(st9.clicklogin9);
        st9.clickFunction(st9.clicklogin9);
    }
    @Then("Click on Add Button nine")
    public void clickOnAddButtonNine() {
        st9.waitUntilClickable(st9.Adminclick9);
        st9.clickFunction(st9.Adminclick9);
        st9.clickFunction(st9.addBttn9);
    }

    @When("verify all elements are displayed")
    public void verifyAllElementsAreDisplayed() {
    st9.verifyContainsTextFunction(st9.dogrulama9, "Admin");
    }


}
