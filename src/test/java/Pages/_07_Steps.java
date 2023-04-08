package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _07_Steps extends Parent{

    public _07_Steps() {
        PageFactory.initElements(GWD.getDriver(),this);
    }



    @FindBy(name = "username")
    public WebElement username7;

    @FindBy (name = "password")
    public WebElement Passpord7;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement clicklogin7;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn7;

    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    public WebElement Adminclick7;

    @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement usernameRe7;

    @FindBy (xpath = "//span[text()='Already exists']")
    public WebElement dogrulama7;


}
