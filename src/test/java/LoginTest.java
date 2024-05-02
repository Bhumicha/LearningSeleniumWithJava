import PageObject.LoginPage;
import configuration.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {

    private WebDriver driver;
    private LoginPage lp;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().setSize(new Dimension(786, 816));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //driver = new DriverFactory().getDriver();
        lp= new LoginPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void verifythatusershouldbeabletologintothesystemusingcorrectusernameandpassword() {
        lp.loginToApplication("Admin", "admin123");
        String actualTextFromApp = driver.findElement(lp.dashboardText).getText();
        Assertions.assertEquals("Dashboard", actualTextFromApp);
        //lp.loginToApplication("Admin", "admin123");
        //Assertions.assertEquals(driver.findElement(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]")).getText(), "Dashboard");
        //Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(200));
        //wait.until(d -> driver.findElement(lp.dashboardText).isDisplayed());
    }

}
//    {
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//        Assertions.assertEquals(driver.findElement(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]")).getText(), "Dashboard");
//    }
//}
//    @Test
//    public void loginToApplication(String username, String password) {
//        //driver.findElement(By.xpath("input/[@name='username']")).sendKeys("Admin");
//        driver.findElement(By.name("username")).sendKeys(username);
//        driver.findElement(By.name("password")).sendKeys(password);
//        driver.findElement(By.cssSelector(".oxd-button")).click();
//    }
//    @Test
//    public void verifythatuserisabletologinusingcorrectusernameandpassword() {
//        loginToApplication(username:"", password:"");
//        Assertions.assertEquals(driver.findElements());
        //driver.findElement(By.xpath("input/[@name='username']")).sendKeys("Admin");
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.cssSelector(".oxd-button")).click();

        //Assertions.assertEquals(driver.findElement(By.cssSelector("oxd-alert-context-text")).getText(), actual:"Dashboard");
//    }
//    @Test
//    public void Verify{
//        //driver.findElement(By.xpath("input/[@name='username']")).sendKeys("Admin");
//        driver.findElement(By.name("username")).sendKeys("");
//        driver.findElement(By.name("password")).sendKeys("");
//        driver.findElement(By.cssSelector(".oxd-button")).click();
//    }

//}
