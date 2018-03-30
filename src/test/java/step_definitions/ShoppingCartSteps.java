package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.LocalChromeDriver;
import org.junit.Assert;
import pages.LogInPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

import static org.junit.Assert.assertThat;

public class ShoppingCartSteps extends LocalChromeDriver {

    // Add Product To Cart

    @Given("^I navigate to product details page for \"([^\"]*)\"$")
    public void iNavigateToProductDetailsPageFor(String searchRequest) {
        driver.get("http://ebay.com");
        new SearchPage(driver).typeTextToSearchField(searchRequest).clickOnSearchButton().openNewFoundProduct();

    }

    @When("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ProductDetailsPage(driver).addToCart();
    }


    @Then("^Shopping cart page should be opened for the product")
    public void iShoppingCartPageShouldBeOpenedForTheProduct() {
        boolean shoppingCartLabelIsDisplayed = new ShoppingCartPage(driver).shoppingCartLabelIsDisplayed();
        Assert.assertTrue(shoppingCartLabelIsDisplayed);
    }


    // Add To Cart button visibility

    @Given("^I open ebay site")
    public void iOpenEbaySite() {
        driver.get("http://ebay.com");
    }

    @When("^I open product details page for \"([^\"]*)\"$")
    public void iOpenProductDetailsPageFor(String searchRequest) {
        new SearchPage(driver).typeTextToSearchField(searchRequest).clickOnSearchButton().openNewFoundProduct();
    }


    @Then("^Add to cart button should be displayed")
    public void iAddToCartButtonShouldBeDisplayed() {
        boolean addToCartButtonIsDisplayed = new ProductDetailsPage(driver).addToCartButtonIsDisplayed();
        Assert.assertTrue(addToCartButtonIsDisplayed);
    }


    // Proceed To Checkout

    @When("^I proceed to checkout")
    public void iProceedToCheckout() {
        new ShoppingCartPage(driver).proceedToCheckout();
    }

    @Then("^Log in page should be displayed")
    public void iLogInPageShouldBeDisplayed() {
        boolean signInButtonIsDisplayed = new LogInPage(driver).isSignInButtonDisplayed();
        Assert.assertTrue(signInButtonIsDisplayed);
    }

    // Remove From Cart

    @Given("^I navigate to shopping cart page")
    public void iNavigateToShoppingCartPage() {
        new SearchPage(driver).openShoppingCartPage();
    }

    @When("^I delete the first product from cart")
    public void iDeleteTheFirstProductFromCart() {
        new ShoppingCartPage(driver).deleteProductFromShoppingCart();
    }


    @Then("^Shopping cart should be empty")
    public void iShoppingCartShouldBeEmpty() {
        boolean shoppingCartIsEmpty = new ShoppingCartPage(driver).isShoppingCartEmpty();
        Assert.assertTrue(shoppingCartIsEmpty);
    }


}
