import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Screenshot {
    WebDriver driver;

    @BeforeEach
    public void steUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        JavascriptExecutor js= (JavascriptExecutor) driver;
    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }
    @Test//take full page screenshot
    public void fullPageScreenshot()
    {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourcfile=ts.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
        sourcfile.renameTo(targetfile);
    }
    @Test
    //capture the screenshot of specific section
    public void specificSectionSS()
    {
        WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourcfile=featuredProducts.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\featuredproduct.png");
        sourcfile.renameTo(targetfile);
    }
    @Test
    //capture the screenshot of web element
    public void WebElementSS()
    {
        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourcfile=logo.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
        sourcfile.renameTo(targetfile);
    }

}
