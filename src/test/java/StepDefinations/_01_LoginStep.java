package StepDefinations;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import io.cucumber.java.ht.Ak;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class _01_LoginStep {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();


    @Given("Navigate to site")
    public void navigateTosite() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Login as an Admin and navigate to Admin UserManagement Page")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPage() {
        dc.sendKeysFunction(dc.username, "Admin");
        dc.sendKeysFunction(dc.Passpord, "admin123");
        dc.waitUntilClickable(dc.clicklogin);
        dc.clickFunction(dc.clicklogin);

    }

    @Then("Click on Add Button")
    public void clickOnAddButton() {
        ln.waitUntilClickable(ln.Adminclick);
        ln.clickFunction(ln.Adminclick);
    }

    @When("Entering the required info to the all input boxes and Click Save Button")
    public void enteringTheRequiredInfoToTheAllInputBoxesAndClickSaveButton() throws AWTException {

        dc.jsClickFunction(dc.addBttn);

        dc.clickFunction(dc.closebutton);


        Robot rbt = new Robot();
        for (int i = 0; i < 14; i++) {

            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı.  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        // UserRole
        rbt.keyPress(KeyEvent.VK_DOWN);
        rbt.keyRelease(KeyEvent.VK_DOWN);
        rbt.keyPress(KeyEvent.VK_DOWN);
        rbt.keyRelease(KeyEvent.VK_DOWN);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        // EmployeName
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_DOWN);
        rbt.keyRelease(KeyEvent.VK_DOWN);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);



        Actions aksiyonlar = new Actions(GWD.getDriver());

        Action aksiyon = aksiyonlar.moveToElement(dc.EmployeeName)
                .click()
                .sendKeys("P")
                .build();
        aksiyon.perform();


        GWD.Bekle(1);
        aksiyon = aksiyonlar
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .click()
                .build();
        aksiyon.perform();

        GWD.Bekle(1);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        // Status

        rbt.keyPress(KeyEvent.VK_DOWN);
        rbt.keyRelease(KeyEvent.VK_DOWN);
        rbt.keyPress(KeyEvent.VK_DOWN);
        rbt.keyRelease(KeyEvent.VK_DOWN);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        Action aksiyon2 = aksiyonlar.moveToElement(dc.usernameRe)
                .click()
                .sendKeys("Group161")
                .build();
        aksiyon2.perform();

        GWD.Bekle(1);
        aksiyon2 = aksiyonlar
                .click()
                .build();
        aksiyon2.perform();

            GWD.Bekle(1);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        Action aksiyon3 = aksiyonlar.moveToElement(dc.PasswordRe)
                .click()
                .sendKeys("Admin123.")
                .build();
        aksiyon3.perform();

        GWD.Bekle(1);
        aksiyon3 = aksiyonlar
                .click()
                .build();
        aksiyon3.perform();

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        Action aksiyon4 = aksiyonlar.moveToElement(dc.RePasswordRe)
                .click()
                .sendKeys("Admin123.")
                .build();
        aksiyon4.perform();

        GWD.Bekle(1);
        aksiyon4 = aksiyonlar
                .click()
                .build();
        aksiyon4.perform();

        Action aksiyon5 = aksiyonlar.moveToElement(dc.saveButton)
                .click()
                .build();
        aksiyon5.perform();

        GWD.Bekle(1);
        aksiyon5 = aksiyonlar
                .click()
                .build();
        aksiyon5.perform();


        }

        @Then("Verify that ESS is added on the list")
    public void verifyThatESSIsAddedOnTheList() {

        dc.verifyContainsTextFunction(dc.dogrulama1, "Group161");
    }
}
