package dayMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
    public static void main(String[] args) {
//        mouse hover -- moveToElement
//        right click -- contextClick
//        double click -- doubleClick
//        drag and drop --

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement desktops = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
        Actions action = new Actions(driver);

        //mouse
        // build: create an action
        // perform: complete an action
//        action.moveToElement(mac).click().build().perform();

        action.moveToElement(mac).click().perform();

    }



}
