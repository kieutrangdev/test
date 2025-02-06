package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement inputSearch = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
        inputSearch.sendKeys("Java");
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']/following::input[1]"));
        searchButton.click();
        mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div/a")));
        List<WebElement> searchLinks = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div/a"));
        int countList = searchLinks.size();
        System.out.println("Size of list search " + countList);

        // open all links text
        for(WebElement link:searchLinks)
        {
            System.out.println(link.getText());
            link.click();
        }

        Set<String> windowIDs=driver.getWindowHandles();
        System.out.println("Window Handles:" );
        for (String windowID : windowIDs) {
            String title=driver.switchTo().window(windowID).getTitle();
            System.out.println(title);
            driver.switchTo().window(windowID);

        }
//        driver.close();


    }
}
