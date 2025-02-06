package dayDatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DateDemo1 {
    static void selectDate(WebDriver driver, String year, String month, String date, boolean isFuture) {
        while (true) {
            // Lấy tháng và năm hiện tại từ date picker
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            // Nếu tháng và năm hiện tại khớp với tháng và năm cần chọn, thoát vòng lặp
            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }

            // Xác định nút di chuyển (Next hoặc Previous) dựa trên hướng
            String arrowIcon = isFuture
                    ? "//span[@class='ui-icon ui-icon-circle-triangle-e']" // Next
                    : "//span[@class='ui-icon ui-icon-circle-triangle-w']"; // Previous
            driver.findElement(By.xpath(arrowIcon)).click();
        }

        // Tìm và chọn ngày
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            try {
                driver.get("https://jqueryui.com/datepicker/");
                driver.manage().window().maximize();

                // Chuyển vào frame chứa date picker
                driver.switchTo().frame(0);

                // Mở date picker
                driver.findElement(By.id("datepicker")).click();

                String year = "2025";
                String month = "May";
                String date = "10";

                // Chọn ngày trong quá khứ
//                selectDate(driver, year, month, date, false);

                // Hoặc chọn ngày trong tương lai
                 selectDate(driver, year, month, date, true);

            } finally {
                driver.quit(); // Đảm bảo driver được đóng sau khi chạy
            }
        }

    }

