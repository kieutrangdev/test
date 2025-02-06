package dayDatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignment {
    /* Test Case
     1) Open https://dummy-tickets.com/buyticket
     2) Click on Both
     3) Select round trip
     4) Under Flight,  select From, To, Departure, Return
     5) Under Hotel , select city, checkin, checkout
     6) Click on submit
 */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://dummy-tickets.com/buyticket");
        driver.findElement(By.xpath("//a[normalize-space()='Both']")).click();
        driver.findElement(By.xpath("//input[@value='roundtripfh']")).click();
        // from
        driver.findElement(By.xpath("(//input[@name='source[]'])[5]")).sendKeys("vietnam");
        WebElement fromOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='suggestions-list']")));
//        List<WebElement> fromListOption = wait.until("")

    }
}
