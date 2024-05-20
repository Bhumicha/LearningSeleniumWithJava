import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingDynamicTable {
    WebDriver driver;
    @BeforeEach
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }
    @Test
    public void dynamicTables()
    {
        //number of columns
        List<WebElement> col = driver.findElements(By.xpath(".//*[@id=\\\"leftcontainer\\\"]/table/thead/tr/th"));
        System.out.println("The number of columns are: " + col.size());

        //number of rows
        List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("No of rows are : " + rows.size());
    }
}
