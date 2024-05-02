import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTestWaitMethods {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //implicit wait
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().setSize(new Dimension(786, 816));
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void verifythatusershouldbeabletologintothesystemusingcorrectusernameandpassword() {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
    @Test
    public void verifythatusershouldnotbeabletologintothesystemusingcorrectusernameandpassword() {
        //driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        //using explicit wait
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
                txtusername.sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

}