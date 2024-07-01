import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Datepickers {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        //switch to frame
        driver.switchTo().frame(0);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    //using SendKeys
    public void datepicker1() {
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");

    }

    @Test
    //using method date picker
    public void datepicker() throws InterruptedException {
        String year = "2025";
        String month = "May";
        String day = "05";
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        // select month and year
        while (true) {
            String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (currentmonth.equals(month) && currentyear.equals(year)) {
                break;
            }
            // clicking on next button
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            //clicking on previous button
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            //select the date
            List<WebElement> allDates = driver.findElements(By.xpath("table[@class='ui-datepicker-calender']//tbody//tr/td//a"));
            for (WebElement dt : allDates) {
                if (dt.getText().equals(day)) {
                    dt.click();
                    break;
                }
            }
            Thread.sleep(5000);
        }
    }

}
