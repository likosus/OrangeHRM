package StepDefinations;

import Pages.DialogContent;
import Pages._11_Steps;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _11_CharacterControl {
    _11_Steps st11=new _11_Steps();
   /* @Given("Navigate to sitee")
    public void navigateToSitee() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    } */

    @When("Login as an Admin and navigate to Admin User Management Page")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPage() {
        st11.sendKeysFunction(st11.username11,"Admin");
        st11.sendKeysFunction(st11.Passpord11,"admin123");
        st11.waitUntilClickable(st11.clicklogin11);
        st11.clickFunction(st11.clicklogin11);


    }

    @Then("Click  admin and click to Add Button")
    public void clickAdminAndClickToAddButton() {
        st11.waitUntilClickable(st11.Adminclick11);
        st11.clickFunction(st11.Adminclick11);
        st11.clickFunction(st11.addBttn11);
    }

    @When("Enter less than eight characters in Passport field")
    public void enterLessThanEightCharactersInPassportField() {
        st11.waitUntilClickable(st11.password11);
        st11.clickFunction(st11.password11);
        st11.sendKeysFunction(st11.password11,"admin1");

    }

    @Then("verify messages Should have at least eigth characters")
    public void verifyMessagesShouldHaveAtLeastEigthCharacters() {
        st11.verifyContainsTextFunction(st11.dogrulama8Character,"Should have at least 8 characters");

    }
}
