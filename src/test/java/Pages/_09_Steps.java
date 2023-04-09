package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _09_Steps extends Parent {


    public _09_Steps() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    _11_Steps st11=new _11_Steps();
    @FindBy(name = "username")
    public WebElement username9;

    @FindBy (name = "password")
    public WebElement Passpord9;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement clicklogin9;

    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    public WebElement Adminclick9;
    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn9;

    @FindBy(xpath = "//h6[text()='Admin']")
    public WebElement dogrulama9;

}
