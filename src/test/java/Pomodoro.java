import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class Pomodoro {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void HandlingBasicAuth() {
        driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        String Message = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
        Assertions.assertEquals(Message, "Congratulations! You must have the proper credentials.");
    }

    @Test
    public void HandlingCheckboxes() {
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total number of checkboxes are : " + checkboxes.size());
        for (int i = 0; i < checkboxes.size(); i++) {
            {
                checkboxes.get(i).click();
            }
            if (checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled() && checkboxes.get(i).isSelected()) {
                System.out.println("All checkboxes have been checked");
            }
        }
    }
}
