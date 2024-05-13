import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;


public class HandlingDropdowns {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    //select dropdown methods
    public void selectionDropdown() throws InterruptedException {
        Select dropdown1 = new Select(driver.findElement(By.id("country")));
        dropdown1.selectByVisibleText("United Kingdom");
        Thread.sleep(5000);
        dropdown1.selectByValue("japan");
        Thread.sleep(5000);
        dropdown1.selectByIndex(0);
        Thread.sleep(5000);

        //capture the options from the dropdown
        List<WebElement> options = dropdown1.getOptions();
        System.out.println("Number of options: " + options.size());
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }

    }

    @Test
    //select dropdown
    public void BootstrapDropdownSelection() throws InterruptedException {
        driver.navigate().to("https://jquery-az.com/boots/demo.php?ex=63.0_2");

        //select single option
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
        driver.findElement(By.xpath("//input[@value='Java']")).click();
        Thread.sleep(5000);

        //capture all the options and find out size

        List<WebElement> options1 = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println("Number of options: " + options1.size());
        Thread.sleep(5000);

        // printing options from dropdown
        for(WebElement op:options1)
        {
            System.out.println(op.getText());
        }
        Thread.sleep(5000);

        //select multiple options
        for(WebElement op:options1)
        {
            if(op.getText().equals("Java") || op.getText().equals("Python"));
            {
                op.click();
            }
        }


    }


}
