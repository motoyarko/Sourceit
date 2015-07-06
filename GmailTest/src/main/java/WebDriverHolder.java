import org.openqa.selenium.WebDriver;

/**
 * Created by motoyarko on 06-Jul-15.
 */
public class WebDriverHolder {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        WebDriverHolder.driver = driver;
    }



}
