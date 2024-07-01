import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutor {
    WebDriver driver;

    @BeforeEach
    public void steUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        JavascriptExecutor js= (JavascriptExecutor) driver;
    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }
    @Test
    public void JSExecutor() {
        //passing value
        WebElement inputBox=driver.findElement(By.xpath("//input[@id='name']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', 'John')", inputBox);

        //clicking action
        WebElement radioButton=driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click",radioButton);
    }
    @Test
    //scrolling bar
    public void ScollingBar() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/");
        JavascriptExecutor js= (JavascriptExecutor) driver;

        //scroll down page by pixel number
        js.executeScript("window.scrollBy(0,3000)", "");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        //scroll the page till element is visible
        WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
        js.executeScript("arguments[0].scrollIntoView()", ele);
        System.out.println(js.executeScript("return window.pageYOffset;"));

        // scroll page till end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        //scrolling up to initial position
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(5000);

        //zoom in and zoom out
        js.executeScript("document.body.style.zoom='50%'");
    }
}
