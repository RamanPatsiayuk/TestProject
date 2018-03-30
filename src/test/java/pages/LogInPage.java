package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends EbayPage {

    @FindBy(xpath = ".//*[@id='sgnBt']")
    private WebElement signInButton;


    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSignInButtonDisplayed() {
        if (signInButton.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

}
