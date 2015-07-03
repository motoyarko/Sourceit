package ua.com.sourceit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * Created by motoyarko on 03-Jul-15.
 */
public class HomePage {

    private final WebDriver driver;
    private String locatorSearchField = new Locators().getLocatorSearchField();

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultPage search(String input) {
        new Wait(driver).waitDelay(locatorSearchField);
        driver.findElement(By.cssSelector(locatorSearchField)).sendKeys(input);
        driver.findElement(By.cssSelector(locatorSearchField)).sendKeys(Keys.ENTER);
        return new ResultPage(driver);
    }
}
