import java.util.concurrent.TimeUnit;

/**
 * Created by motoyarko on 06-Jul-15.
 */
public class WaitTools {
    public static void waitPage() {
        WebDriverHolder.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }
}
