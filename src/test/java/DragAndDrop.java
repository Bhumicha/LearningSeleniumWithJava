import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    WebDriver driver;
     @BeforeEach
    public void setUp()
     {
         driver = new ChromeDriver();
         driver.get("http://demo.guru99.com/test/drag_drop.html");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

     }
     @AfterEach
    public void tearDown()
     {
         driver.quit();
     }
     @Test
    public void dragdrop()
     {
         //Element which needs to drag.
         WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));

         //Element on which need to drop.
         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));

         //Using Action class for drag and drop.
         Actions act=new Actions(driver);

         //Dragged and dropped.
         act.dragAndDrop(From, To).build().perform();
     }
}

