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

public class CalenderHandlingwithTime {
    WebDriver driver;


    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testautomationpractice.blogspot.com/");
        String requiredYear = "2023";
        String requiredMonth = "June";
        String requiredDay = "05";
        driver.switchTo().frame("frame-one796456169");
        driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }
    //select time along with date
    static Month convertMonth(String month) {
        HashMap<String, Month> monthMap = new HashMap<String, Month>();
        monthMap.put("January", Month.JANUARY);
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);
        Month vmonth = monthMap.get(month);
        if (vmonth == null) {
            System.out.println("Invalid Month....");
        }
        return vmonth;
    }

    static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDay)
    {
        //select year
        WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByVisibleText(requiredYear);

        while (true)
        {
            //select month
            String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            // convert required oth and display month in to month objects
            Month expectedMonth = convertMonth(requiredMonth);
            Month currentMonth = convertMonth(displayMonth);
            //comparing
            int result = expectedMonth.compareTo(currentMonth);
            if (result<0)
            {
                //past month
                driver.findElement(By.xpath("span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            } else if (result>0)
            {
                driver.findElement(By.xpath("span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            } else
            {
                break;
            }
        }
        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calender']"));
        for (WebElement dt:allDates)
        {
            if(dt.getText().equals(requiredDay))
            {
                dt.click();
                break;
            }
        }
    }
    @Test
    void test()
    {
        //selectDate(driver,requiredYear, requiredMonth, requiredDay);
    }

}
