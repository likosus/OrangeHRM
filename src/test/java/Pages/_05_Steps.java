package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _05_Steps extends Parent{

    public _05_Steps() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement username5;

    @FindBy (name = "password")
    public WebElement Passpord5;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement clicklogin5;

    @FindBy(xpath = "//i[@class='oxd-icon bi-chevron-left']")
    public WebElement closebutton5;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn5;

    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    public WebElement Adminclick5;

    @FindBy (xpath = "//input[@placeholder='Type for hints...']")
    public WebElement EmployeeName5;


    @FindBy (xpath = "//[text()='Invalid']")
    public WebElement dogrulama5;

    @FindBy(xpath = "//[text()='No Records Found']")
    public WebElement noRecordsFound5;

    @FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message' and text()='Invalid']")
    public WebElement invalid5;

    @FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    public WebElement bosluk5;
}