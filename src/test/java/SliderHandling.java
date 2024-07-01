import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderHandling {
    WebDriver driver;

    @BeforeEach
    public void steUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }
    @Test
    // moving slider using drag and drop
    public void slider()
    {
        Actions act=new Actions(driver);
        // min slider
        WebElement minimumSlider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        System.out.println("Location of min slider: "+minimumSlider.getLocation());
        act.dragAndDropBy(minimumSlider, 100, 249).perform();
        System.out.println("Latest location of min slider: "+minimumSlider.getLocation());
        //max slider
        WebElement maxSlider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
        System.out.println("Location of max slider: "+maxSlider.getLocation());
        act.dragAndDropBy(maxSlider, -100, 249).perform();
        System.out.println("Latest location of max slider: "+maxSlider.getLocation());
    }
}
