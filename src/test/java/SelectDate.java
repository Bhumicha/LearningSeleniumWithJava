import PageObject.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SelectDate {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/");
        driver.manage().window().setSize(new Dimension(786, 816));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void datepicker()
    {
        WebElement datebox = driver.findElement(By.xpath("//form/input[@name='bdaytime']"));
        datebox.sendKeys("09252024");
        datebox.sendKeys(Keys.TAB);
        datebox.sendKeys("0245PM");
    }
}
