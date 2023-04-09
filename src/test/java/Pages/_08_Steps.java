
    package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class _08_Steps extends Parent{

        public _08_Steps() {
            PageFactory.initElements(GWD.getDriver(),this);
        }

        @FindBy(name = "username")
        public WebElement username8;

        @FindBy (name = "password")
        public WebElement Passpord8;

        @FindBy (xpath = "//button[@type='submit']")
        public WebElement clicklogin8;

        @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
        public WebElement Adminclick8;

        @FindBy(css = "div[class='orangehrm-header-container']>button")
        public WebElement dogrulama8;

    }



