package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.SearchResultsPage;
import utils.WebDriverManager;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortFunctionalitySteps {
    WebDriver driver = WebDriverManager.initializeDriver();
    HomePage homePage = new HomePage(driver);
    SearchResultsPage resultsPage = new SearchResultsPage(driver);

    @Given("User opens Flipkart in Incognito mode")
    public void user_opens_flipkart() {
        driver.get("https://www.flipkart.com");
    }

    @When("User searches for {string} and applies sort {string}")
    public void user_searches_and_applies_sort(String product, String sortType) {
        homePage.searchProduct(product);
        resultsPage.applySort(sortType);
    }

    @Then("Validate all product prices are in ascending order on page limit {string}")
    public void validate_prices(String pageLimit) {
        for (int i = 1; i <= Integer.parseInt(pageLimit); i++) {
            List<Integer> prices = resultsPage.getProductPrices();
            Assert.assertEquals(prices, prices.stream().sorted().collect(Collectors.toList()));
            // Add pagination logic if needed
        }
    }
}
