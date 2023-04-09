package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _12_Steps extends Parent{

    public _12_Steps() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement username12;

    @FindBy (name = "password")
    public WebElement Passpord12;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement clicklogin12;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn12;

    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    public WebElement Adminclick12;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    public WebElement PasswordRe12;

    @FindBy(xpath = "//*[text()='Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password']")
    public WebElement dogrulama12;




}
