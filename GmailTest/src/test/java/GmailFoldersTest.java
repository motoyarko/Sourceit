import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by motoyarko on 06-Jul-15.
 */
public class GmailFoldersTest {
    
    WebDriver driver;
   public String username = "motoyarko@gmail.com";
    private String password = "*********";

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://gmail.com");
        WebDriverHolder.setDriver(driver);
    }

    @Test
    public void testGmailFolders() throws Exception {
        Gmail.login(username, password);
        assertTrue(Gmail.checkFolders());
    }

    @Test
    public void testGmailWrongLogin() throws Exception {
        Gmail.login(username, password.concat("+"));
        String result = WebDriverHolder.driver.findElement(By.cssSelector("#errormsg_0_Passwd")).getText();
        assertThat(result, equalTo("The email and password you entered don't match."));

    }

    @After
    public void tearDown() throws Exception {
    }
}
