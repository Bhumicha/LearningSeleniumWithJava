import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class VerifyTooltip {
    WebDriver driver;
    String expectedTooltip = "What's new in 3.2";

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/social-icon.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void verifyTooltips()
    {
        //finding GitHub icon at the top right
        WebElement github = driver.findElement(By.xpath("//div[@class='socialbtns']//div//a[@title='Github']"));
        //get the value of the "title" attribute of the GitHub icon
        String actualTooltip = github.getAttribute("title");

        //Assert the tooltip's value is as expected
        System.out.println("Actual Title of Tool Tip Is: "+actualTooltip);
        if(actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test Case Passed");
        }
    }
}
