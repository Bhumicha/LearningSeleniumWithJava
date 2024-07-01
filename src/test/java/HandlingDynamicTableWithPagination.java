import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingDynamicTableWithPagination {

    WebDriver driver;

    @BeforeEach
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();



    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();

    }
    @Test
    public void dynamicPagination()
    {
        WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
        username.clear();
        username.sendKeys("demo");

        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        password.clear();
        password.sendKeys("demo");
        driver.findElement(By.xpath("//button[normalize-space()='login']")).click();
        //close window if it is available
        if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed());
        {
            driver.findElement(By.xpath("//button[@class='btn-close']")).click();
        }

        driver.findElement(By.xpath("//a[@class='parent']")).click();
        driver.findElement(By.xpath("//a[@id='collapse-5']//a[contains(text(), 'Customers')]")).click();


    }
}
