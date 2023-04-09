package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _03_Steps extends Parent{

    public _03_Steps() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(name = "username")
    public WebElement username3;

    @FindBy (name = "password")
    public WebElement Passpord3;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement clicklogin3;

    @FindBy(xpath = "//i[@class='oxd-icon bi-chevron-left']")
    public WebElement closebutton3;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBttn3;

    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    public WebElement Adminclick3;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public List<WebElement> HataMessages3;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton3;


}


