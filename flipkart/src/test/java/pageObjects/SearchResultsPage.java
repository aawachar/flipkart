package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage {
    WebDriver driver;

    By sortOption = By.xpath("//div[contains(text(),'Price -- Low to High')]");
    By productPrices = By.xpath("//div[@class='_30jeq3']"); // Adjust if needed
    By productList = By.xpath("//div[@class='_1AtVbE']");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void applySort(String sortType) {
        driver.findElement(sortOption).click();
    }

    public List<Integer> getProductPrices() {
        return driver.findElements(productPrices)
                     .stream()
                     .map(price -> Integer.parseInt(price.getText().replace("₹", "").replace(",", "")))
                     .collect(Collectors.toList());
    }

    public void clickProduct(int index) {
        driver.findElements(productList).get(index).click();
    }
}
