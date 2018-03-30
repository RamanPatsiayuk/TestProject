package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends EbayPage {

    @FindBy(xpath = ".//a[@id='isCartBtn_btn']")
    private WebElement addToCartButton;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }


    public ShoppingCartPage addToCart() {
        addToCartButton.click();
        return new ShoppingCartPage(driver);
    }

    public boolean addToCartButtonIsDisplayed() {
        if (addToCartButton.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }
}

