package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy (name = "username")
    public WebElement username;

    @FindBy (name = "password")
    public WebElement Passpord;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement clicklogin;
    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn;

    @FindBy (xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
    public WebElement userRole;

    @FindBy (xpath = "//div[text()='Enabled']")
    public WebElement status;

    @FindBy (xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
    public WebElement EmployeeName;

    @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement usernameRe;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    public WebElement PasswordRe;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
    public WebElement RePasswordRe;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement saveButton;

    @FindBy(xpath = "//i[@class='oxd-icon bi-chevron-left']")
    public WebElement closebutton;


}
