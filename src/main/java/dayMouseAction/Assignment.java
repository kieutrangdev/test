package dayMouseAction;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // cuộn chuột
        WebElement element = driver.findElement(By.xpath("//h2[text()='Double Click']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        // double click
        WebElement copyTextButton = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(copyTextButton).perform();
        WebElement copyInputText1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement copyInputText2 = driver.findElement(By.xpath("//input[@id='field2']"));
        Assert.assertEquals(copyInputText2.getAttribute("value"), copyInputText1.getAttribute("value"), "Chưa copy được chữ thành công");

        // drag and drop
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        actions.dragAndDrop(drag, drop).perform();
        WebElement textDrop = driver.findElement(By.xpath("//div[@id='droppable']//p"));
        Assert.assertEquals(textDrop.getText(),"Dropped!","Drag and drop failed!");

    }
}
