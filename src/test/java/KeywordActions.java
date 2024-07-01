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

public class KeywordActions {
    WebDriver driver;

    @BeforeEach
    public void steUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://text-compare.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterEach
    public void tearDown()
    {

    }
    @Test
    public void keywordActions()
    {
        Actions act=new Actions(driver);
        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");
        //ctrl+A
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        //ctrl+C
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        //TAB
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        //ctrl+V
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
        //printing the value
        WebElement pastedValue=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
        String textAgain = pastedValue.getAttribute("value");
        System.out.println("Value:"+ textAgain);
    }
}
