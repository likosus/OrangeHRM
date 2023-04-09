package StepDefinations;

import Pages._12_Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _12_PasswordWithoutLower {

    _12_Steps st12=new _12_Steps();
    @When("Login as an Admin and navigate to Admin User Management PageTwelve")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPageTwelve() {
        st12.sendKeysFunction(st12.username12,"Admin");
        st12.sendKeysFunction(st12.Passpord12,"admin123");
        st12.waitUntilClickable(st12.clicklogin12);
        st12.clickFunction(st12.clicklogin12);

    }

    @Then("Click  admin and click to Add ButtonTwelve")
    public void clickAdminAndClickToAddButtonTwelve() {

        st12.clickFunction(st12.Adminclick12);
        st12.clickFunction(st12.addBttn12);
    }

    @And("enter passport without lower case character")
    public void enterPassportWithoutLowerCaseCharacter() {
        st12.sendKeysFunction(st12.PasswordRe12, "ADMİN1234.");
    }

    @Then("verify messages Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password”")
    public void verifyMessagesYourPasswordMustContainALowerCaseLetterAnUpperCaseLetterADigitAndASpecialCharacterTryADifferentPassword() {

        st12.verifyContainsTextFunction(st12.dogrulama12, "Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password");

    }
}