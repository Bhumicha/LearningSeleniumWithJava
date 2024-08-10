import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShadowDomElements {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void shadowDom() throws InterruptedException {
        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
        Thread.sleep(1000);
        SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome");
    }
    @Test
    public void NestedShadowElement() throws InterruptedException {
        driver.navigate().to("https://dev.automationtesting.in/shadow-dom");
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "#shadow-root";
        String cssSelectorForHost2 = "#inner-shadow-dom";
        Thread.sleep(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        shadow1.findElement(By.cssSelector("#nested-shadow-element"));
    }
    @Test
    public void MultiNestedShadowElement() throws InterruptedException {
        driver.navigate().to("https://dev.automationtesting.in/shadow-dom");
        //This Element is inside 3 nested shadow DOM.
        String cssSelectorForHost1 = "#shadow-root";
        String cssSelectorForHost2 = "#inner-shadow-dom";
        String cssSelectorForHost3 = "#nested-shadow-dom";
        Thread.sleep(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        shadow2.findElement(By.cssSelector("#multi-nested-shadow-element"));
    }

}
