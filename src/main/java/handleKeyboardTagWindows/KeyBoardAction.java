package handleKeyboardTagWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction{
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        driver.get("https://text-compare.com/23423423423");
        driver.manage().window().maximize();

    }
}
