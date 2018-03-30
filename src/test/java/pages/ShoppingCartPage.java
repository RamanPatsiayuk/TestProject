package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends EbayPage {

    @FindBy(xpath = ".//*[@id='PageTitle']/h1")
    private WebElement shoppingCartLabel;

    @FindBy(xpath = ".//*/div[2]/div/div/a[1]")
    private WebElement removeLinkForFirstProduct;

    @FindBy(xpath = ".//*/div[@class='tr']/a[@class='action']")
    private WebElement proceedToCheckout;

    @FindBy(xpath = ".//div[@class='fw-b']")
    private WebElement emptyText;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean shoppingCartLabelIsDisplayed() {
        if (shoppingCartLabel.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public ShoppingCartPage deleteProductFromShoppingCart() {
        removeLinkForFirstProduct.click();
        return new ShoppingCartPage(driver);
    }


    public LogInPage proceedToCheckout() {
        proceedToCheckout.click();
        return new LogInPage(driver);
    }

    public boolean isShoppingCartEmpty() {
        if (emptyText.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

}
