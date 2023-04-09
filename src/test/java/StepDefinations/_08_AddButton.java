package StepDefinations;

import Pages._08_Steps;
import io.cucumber.java.en.When;

public class _08_AddButton {
    _08_Steps st8=new _08_Steps();

    @When("Login as an Admin and navigate to Admin UserManagement PageEight")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPageEight() {

        st8.sendKeysFunction(st8.username8,"Admin");
        st8.sendKeysFunction(st8.Passpord8,"admin123");
        st8.waitUntilClickable(st8.clicklogin8);
        st8.clickFunction(st8.clicklogin8);
        st8.clickFunction(st8.Adminclick8);
    }

    @When("verify Add button displayed")
    public void verifyAddButtonDisplayed() {

        st8.verifyContainsTextFunction(st8.dogrulama8, "Add");

    }
}