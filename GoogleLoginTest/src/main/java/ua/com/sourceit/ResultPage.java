package ua.com.sourceit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by motoyarko on 03-Jul-15.
 */
public class ResultPage {

    private final WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstResultLink(WebDriver driver, String locator) {
        new Wait(driver).waitDelay(locator);
        return driver.findElement(By.cssSelector(locator)).getAttribute("href");
    }
}
