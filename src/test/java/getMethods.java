import PageObject.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class getMethods {
    private WebDriver driver;


    @BeforeEach
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        //get url
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().setSize(new Dimension(786, 816));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test

    public void get() {
        //get page title
        System.out.println(driver.getTitle());

        //get current url
        System.out.println(driver.getCurrentUrl());

        //get window ID
        System.out.println(driver.getPageSource());
        String window = driver.getWindowHandle();
        System.out.println("WindowID:" + window);

        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        driver.quit();


    }
}
