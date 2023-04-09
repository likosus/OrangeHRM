package StepDefinations;

import Pages.LeftNav;
import Pages._03_Steps;
import Pages._04_Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_AdminUserPassword {

    _04_Steps st4 = new _04_Steps();
    LeftNav ln = new LeftNav();
    @When("Login as an Admin and navigate to Admin UserManagement Page News")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPageNews() {

        st4.sendKeysFunction(st4.username4, "Admin");
        st4.sendKeysFunction(st4.Passpord4, "admin123");
        st4.waitUntilClickable(st4.clicklogin4);
        st4.clickFunction(st4.clicklogin4);
        st4.waitUntilClickable(st4.Adminclick4);
        st4.clickFunction(st4.Adminclick4);
    }

    @Then("Click on Add Buttons")
    public void clickOnAddButtons() {

        st4.jsClickFunction(st4.addBttn4);
        st4.clickFunction(st4.closebutton4);

    }
    @And("enter value in to the password field")
    public void enterValueInToThePasswordField() {

        st4.sendKeysFunction(st4.PasswordRe4, "Admin123.");
        st4.sendKeysFunction(st4.RePasswordRe4, "Admn123.");


    }


    @Then("verify notification messages Password do not Match")
    public void verifyNotificationMessagesPasswordDoNotMatch() {
        st4.verifyContainsTextFunction(st4.dogrulama4, "Passwords do not match");
    }
}


