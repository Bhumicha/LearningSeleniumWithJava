import PageObject.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropdown {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().setSize(new Dimension(786, 816));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void googleDropdown() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(50000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println(list.size());
        for (int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().equals("selenium"))
            {
                list.get(i).click();
                break;
            }
        }

    }
}
