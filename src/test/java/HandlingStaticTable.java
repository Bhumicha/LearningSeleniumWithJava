import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingStaticTable {
    WebDriver driver;
    @BeforeEach
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }
    @Test
    public void h()
    {
        //finding total number of rows in a table
        //int rows=driver.findElement(By.xpath("//table[@name='BookTable']//tr")).size();
        //System.out.println(rows);
       // int rows1=driver.findElement(By.tagName("tr")).size();
    }

}
