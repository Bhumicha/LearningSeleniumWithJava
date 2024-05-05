import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingChechBoxesAndAlerts {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    // select specific one checkbox
    public void selectspecificcheckbox() {
        driver.findElement(By.xpath("//input[@id='sunday']")).click();
    }

    //select all checkboxes
    @Test
    public void selectmultiplecheckboxes()
    {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
                for (int i=0; i< checkboxes.size(); i++)
                {
                    checkboxes.get(i).click();
                }
    }
    //select multiple checkboxes - conditional selecting last 3 checkboxes
    @Test
    public void selectconditionalcheckboxes()
    {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for (int i=4; i< checkboxes.size(); i++)
        {
            checkboxes.get(i).click();
        }
    }
    //select first three checkboxes
    @Test
    public void firstthreecheckboxes() throws InterruptedException {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for (int i=0; i< 3; i++)
        {
            checkboxes.get(i).click();
        }
        Thread.sleep(5000);
    }
}

