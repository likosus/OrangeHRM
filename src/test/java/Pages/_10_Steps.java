package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _10_Steps extends Parent{

    public _10_Steps() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(name = "username")
    public WebElement username10;

    @FindBy (name = "password")
    public WebElement Passpord10;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement clicklogin10;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn10;

    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    public WebElement Adminclick10;

    @FindBy(xpath = "//*[text()='Add User']")
    public WebElement dogrulama10;
}
