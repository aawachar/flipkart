package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

    By searchBox = By.xpath("//input[@title='Search for products']");
    By searchButton = By.xpath("//button[@type='submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchButton).click();
    }

}
