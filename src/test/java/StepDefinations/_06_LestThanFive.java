package StepDefinations;

import Pages._06_Steps;
import Pages._11_Steps;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class _06_LestThanFive {
    _06_Steps st6=new _06_Steps();

    @When("Login as an Admin and navigate to Admin UserManagement Page six")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPageSix() {
        st6.sendKeysFunction(st6.username6,"Admin");
        st6.sendKeysFunction(st6.Passpord6,"admin123");
        st6.waitUntilClickable(st6.clicklogin6);
        st6.clickFunction(st6.clicklogin6);

    }

    @Then("Click on Add Button six")
    public void clickOnAddButtonSix() {

        st6.waitUntilClickable(st6.Adminclick6);
        st6.jsClickFunction(st6.Adminclick6);
        st6.clickFunction(st6.addBttn6);
    }

    @And("create username less than five characters")
    public void createUsernameLessThanFiveCharacters() {
        st6.sendKeysFunction(st6.usernameRe6,"olur");
    }



    @Then("verify message Should be at least five characters")
    public void verifyMessageShouldBeAtLeastFiveCharacters() {
        st6.verifyContainsTextFunction(st6.dogrulama6, "Should be at least 5 characters");
    }
}
