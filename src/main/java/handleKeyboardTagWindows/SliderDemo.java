package handleKeyboardTagWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);

        WebElement min_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        System.out.println("Default location of the min slider :"+min_slider.getLocation()); //(59, 250)
        act.dragAndDropBy(min_slider, 100, 249).perform();
        System.out.println("Location of the min slider after moving:"+min_slider.getLocation()); //(162, 250)



    }
}
