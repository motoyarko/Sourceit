package ua.com.sourceit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by motoyarko on 03-Jul-15.
 */
public class Wait {
    WebDriverWait wait;
    private WebDriver driver;

    public Wait(WebDriver driver) {
        this.driver = driver;
    }

    public void waitDelay( String locator) {

        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
    }


}
