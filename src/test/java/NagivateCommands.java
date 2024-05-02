import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
driver.get()- accepts URL in string format only
driver.navigate()  - acceps URL in string format as well as object format
 */
public class NagivateCommands {
    private WebDriver driver;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        /*or you can create object
        URL TinyURL= new URL("https://demo.nopcommerce.com/");
        driver.navigate().to(TinyURL);
         */
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void A() {
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());


        driver.navigate().refresh();
    }

    @Test
    public void HandleBrowserWindows()
    {
        driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).click();
        Set<String> windowIDs= driver.getWindowHandles();

        //Approach 1
        List<String> windowList=new ArrayList(windowIDs);
        String parentID = windowList.get(0);
        String childID = windowList.get(1);

        //switch to child window
        driver.switchTo().window(childID);
        System.out.println(driver.getTitle());

    }
}
