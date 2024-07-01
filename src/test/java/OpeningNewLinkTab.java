import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class OpeningNewLinkTab {
    WebDriver driver;

    @BeforeEach
    public void steUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterEach
    public void tearDown()
    {

    }
    @Test
    public void NewTabLink() {
        Actions act= new Actions(driver);
        WebElement newTab=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        //control+register link
        act.keyDown(Keys.CONTROL).click(newTab).keyDown(Keys.CONTROL).perform();
        //switching to registration page
        List<String> ids=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(ids.get(1));
        // if you have to get back to home page
        driver.switchTo().window(ids.get(0));
    }
}
