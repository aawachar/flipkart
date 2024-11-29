package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.SearchResultsPage;
import utils.WebDriverManager;

public class AddToCartSteps {
    WebDriver driver = WebDriverManager.initializeDriver();
    HomePage homePage = new HomePage(driver);
    SearchResultsPage resultsPage = new SearchResultsPage(driver);
    CartPage cartPage = new CartPage(driver);

    @When("User adds second and third products to cart")
    public void user_adds_products_to_cart() {
        resultsPage.clickProduct(1);
        // Add to cart logic
        resultsPage.clickProduct(2);
        // Add to cart logic
    }

    @Then("Validate the correct products and total price in cart")
    public void validate_cart() {
        int totalPrice = cartPage.getTotalPrice();
        // Validation logic
    }
}
