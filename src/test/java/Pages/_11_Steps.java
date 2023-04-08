package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _11_Steps extends Parent{
    public _11_Steps() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(name = "username")
    public WebElement username11;

    @FindBy (name = "password")
    public WebElement Passpord11;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement clicklogin11;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn11;

    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    public WebElement Adminclick11;

    @FindBy(xpath = " //input[@type='password'][@autocomplete='off']")
    public WebElement password11;


    @FindBy(xpath = "//span[text()='Should have at least 8 characters']")
    public WebElement dogrulama8Character;
}
