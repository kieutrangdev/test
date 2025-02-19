package dayPOM;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    static WebDriver driver;

    @BeforeClass
    public static void setup()
    {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin()
    {
        LoginPage2 lp=new LoginPage2(driver);
        lp.setUserName("Admin");
        lp.setPassword("admin123");
        lp.clickLogin();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }
}
