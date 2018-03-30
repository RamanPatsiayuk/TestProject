package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends EbayPage {
    @FindBy(xpath = ".//*[@id='gh-ac']")
    private WebElement searchField;

    @FindBy(xpath = ".//*[@id='gh-btn']")
    private WebElement searchButton;

    @FindBy(xpath = ".//*[@id='ListViewInner']/li[1]/h3/a")
    private WebElement firstFoundProduct;

    @FindBy(xpath = ".//*[@id='gh-cart-i']")
    private WebElement shoppingCartIcon;


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage typeTextToSearchField(String searchRequest) {
        searchField.sendKeys(searchRequest);
        System.out.println(searchRequest + " is typed to [Search] field");
        return new SearchPage(driver);
    }

    public SearchPage clickOnSearchButton() {
        searchButton.click();
        return new SearchPage(driver);
    }

    public ProductDetailsPage openNewFoundProduct() {
        firstFoundProduct.click();
        return new ProductDetailsPage(driver);
    }

    public ShoppingCartPage openShoppingCartPage() {
        shoppingCartIcon.click();
        return new ShoppingCartPage(driver);
    }

}
