import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class HandleBrowserWindows {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(786, 816));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void HandleBrowserWindows() {
        driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).click();
        Set<String> windowIDs = driver.getWindowHandles();

        //Approach 1 for 2-3 browsers
        /*List<String> windowList = new ArrayList(windowIDs);
        String parentID = windowList.get(0);
        String childID = windowList.get(1);

        //switch to child window
        driver.switchTo().window(childID);
        System.out.println(driver.getTitle());
         */

        //Approach 2 for multiple browsers
        for (String winId:windowIDs)
             {
                 String title=driver.switchTo().window(winId).getTitle();
                 if (title.equals("OrangeHRM"))
                 {
                     System.out.println(driver.getCurrentUrl());
                     //some validation on the parent window
                 }
             }
        // to close specific nrowser window
        for (String winId:windowIDs) {
            String title = driver.switchTo().window(winId).getTitle();
            if (title.equals("OrangeHRM") || title.equals("some other titlie"))
            {
                driver.close();
            }
        }
        }
}