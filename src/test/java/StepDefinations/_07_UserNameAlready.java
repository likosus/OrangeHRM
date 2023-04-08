package StepDefinations;

import Pages._07_Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _07_UserNameAlready {
    _07_Steps st7=new _07_Steps();
    @When("Login as an Admin and navigate to Admin UserManagement Page seven")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPageSeven() {
        st7.sendKeysFunction(st7.username7,"Admin");
        st7.sendKeysFunction(st7.Passpord7,"admin123");
        st7.waitUntilClickable(st7.clicklogin7);
        st7.clickFunction(st7.clicklogin7);


    }

    @Then("Click on Add Button seven")
    public void clickOnAddButtonSeven() {
        st7.waitUntilClickable(st7.Adminclick7);
        st7.clickFunction(st7.Adminclick7);
        st7.clickFunction(st7.addBttn7);

    }

    @When("Create username already taken one seven")
    public void createUsernameAlreadyTakenOneSeven() {
        st7.waitUntilClickable(st7.usernameRe7);
        st7.sendKeysFunction(st7.usernameRe7,"Admin");


    }

    @Then("verify messages Already Exists seven")
    public void verifyMessagesAlreadyExistsSeven() {
        st7.verifyContainsTextFunction(st7.dogrulama7, "Already exists");

    }


}
