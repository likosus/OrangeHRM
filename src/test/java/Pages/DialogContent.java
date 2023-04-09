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

    @FindBy(xpath = "//i[@class='oxd-icon bi-chevron-left']")
    public WebElement closebutton;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn;

    @FindBy(xpath = "//div[@class='oxd-select-text-input'])[1]")
    public WebElement userRole;

    @FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
    public WebElement status;
    @FindBy (xpath = "//input[@placeholder='Type for hints...']")
    public WebElement EmployeeName;


    @FindBy (xpath = "//input[@autocomplete='off']")
    public WebElement usernameRe;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement PasswordRe;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement RePasswordRe;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[text()='Group161']")
    public WebElement dogrulama1;

    @FindBy(xpath = "//div[text()='Group163']")
    public WebElement dogrulama2;

    @FindBy(xpath = "//span[text()='Required']")
    public WebElement dogrulama3;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn2;


}