import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {
    WebDriver driver;

    @BeforeEach
    public void steUp() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);

        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }
    @Test
    public void IncognitoMode()
    {
        WebElement ds=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        ds.isDisplayed();
    }
}
