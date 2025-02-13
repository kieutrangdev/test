package dayCapture;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //1) full page screenshot

//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//        File targetFile = new File(System.getProperty("user.dir") + "/screenshots/fullpage.png");
//        FileUtils.copyFile(sourceFile, targetFile);
//        System.out.println("Screenshot saved to: " + targetFile.getAbsolutePath());


        //2) capture the screenshot of specific section
//		WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		File sourcefile=featuredProducts.getScreenshotAs(OutputType.FILE);
//        File targetfile=new File(System.getProperty("user.dir")+"/screenshots/featredproducts.png");
//		sourcefile.renameTo(targetfile);


        //3) capture the screenshot of webelement
        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourcefile=logo.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+"/screenshots/logo.png");
        sourcefile.renameTo(targetfile); // copy sourcefile to target file

        //driver.quit();

    }

}