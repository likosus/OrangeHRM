package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _06_Steps extends Parent{

    public _06_Steps() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement username6;

    @FindBy (name = "password")
    public WebElement Passpord6;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement clicklogin6;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn6;

    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    public WebElement Adminclick6;

    @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement usernameRe6;

    @FindBy (xpath = " //span[text()='Should be at least 5 characters']")
    public WebElement dogrulama6;




}