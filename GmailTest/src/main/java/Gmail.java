import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by motoyarko on 06-Jul-15.
 */
public class Gmail {
    public static void login(String username, String password) {
        WebDriverHolder.driver.findElement(By.cssSelector(Selectors.username)).sendKeys(username);
        WaitTools.waitPage();
        WebDriverHolder.driver.findElement(By.cssSelector(Selectors.nextButton)).click();
        WebDriverHolder.driver.findElement(By.cssSelector(Selectors.password)).sendKeys(password);
        WebDriverHolder.driver.findElement(By.cssSelector(Selectors.signin)).click();
        WaitTools.waitPage();
    }

    public static Boolean checkFolders() {

        WebDriverHolder.driver.findElement(By.cssSelector(Selectors.inputMessages)).isDisplayed();
        WebDriverHolder.driver.findElement(By.cssSelector(Selectors.markedMessages)).isDisplayed();
        WebDriverHolder.driver.findElement(By.cssSelector(Selectors.importantMessages)).isDisplayed();
        WebDriverHolder.driver.findElement(By.cssSelector(Selectors.sendMessages)).isDisplayed();
        WebDriverHolder.driver.findElement(By.cssSelector(Selectors.draftMessages)).isDisplayed();
        return true;
    }
}
