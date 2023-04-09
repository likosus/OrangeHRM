package StepDefinations;

import Pages.LeftNav;
import Pages._04_Steps;
import Pages._05_Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.val;

public class _05_InvalidAdminName {

    _05_Steps st5= new _05_Steps();
    LeftNav ln = new LeftNav();
    @When("Login as an Admin and navigate to Admin UserManagement PageFive")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPageFive() {


        st5.sendKeysFunction(st5.username5, "Admin");
        st5.sendKeysFunction(st5.Passpord5, "admin123");
        st5.waitUntilClickable(st5.clicklogin5);
        st5.clickFunction(st5.clicklogin5);
        st5.waitUntilClickable(st5.Adminclick5);
        st5.clickFunction(st5.Adminclick5);
    }

    @Then("Click on Add ButtonFive")
    public void clickOnAddButtonFive() {
        st5.jsClickFunction(st5.addBttn5);
        st5.clickFunction(st5.closebutton5);
    }

    @And("Enter verify name into the Employee name field")
    public void enterVerifyNameIntoTheEmployeeNameField() {
        st5.sendKeysFunction(st5.EmployeeName5, "Cemalettin");
    }

    @Then("verify messages no records found in red color")
    public void verifyMessagesNoRecordsFoundInRedColor() {
        st5.verifyContainsTextFunction(st5.noRecordsFound5,"No");
        st5.clickFunction(st5.bosluk5);
        st5.verifyContainsTextFunction(st5.invalid5,"Invalid");

    }
}


