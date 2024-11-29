package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {
    WebDriver driver;

    By productPrices = By.xpath("//div[@class='_1vC4OE']");
    By productTitles = By.xpath("//a[@class='_325-ji']");
    By totalPrice = By.xpath("//span[@class='_2-ut7f']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getProductsInCart() {
        return driver.findElements(productTitles);
    }

    public int getTotalPrice() {
        return Integer.parseInt(driver.findElement(totalPrice).getText().replace("₹", "").replace(",", ""));
    }
}
