package handleKeyboardTagWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoardAction{
    public static void main(String[] args) {

//        WebDriver driver=new ChromeDriver();

//        driver.get("https://text-compare.com/");
//        driver.manage().window().maximize();
//        Actions act = new Actions(driver);
//
//        WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
//        input1.sendKeys("test");
//
//        // ctrl + A
//        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
//        // ctrl + C
//        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
//        // tab
//        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
//        // ctrl + V
//        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();


        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");
        Actions act = new Actions(driver);

        // Ctrl + A
        act.sendKeys(Keys.chord(Keys.CONTROL, "a")).perform();

        // Ctrl + C
        act.sendKeys(Keys.chord(Keys.CONTROL, "c")).perform();

        // Tab
        act.sendKeys(Keys.TAB).perform();

        // Ctrl + V
        act.sendKeys(Keys.chord(Keys.CONTROL, "v")).perform();

    }
}
