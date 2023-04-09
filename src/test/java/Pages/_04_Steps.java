package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _04_Steps extends Parent{

    public _04_Steps() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement username4;

    @FindBy (name = "password")
    public WebElement Passpord4;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement clicklogin4;

    @FindBy(xpath = "//i[@class='oxd-icon bi-chevron-left']")
    public WebElement closebutton4;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn4;

    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    public WebElement Adminclick4;

    @FindBy(xpath = "//*[text()='Passwords do not match']")
    public WebElement dogrulama4;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement PasswordRe4;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement RePasswordRe4;




}