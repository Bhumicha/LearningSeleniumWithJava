import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLhandling {
    WebDriver driver;

    @BeforeEach
    public void steUp() {
        ChromeOptions options=new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(options);

        driver.get("https://expired.badssl.com/");
    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }
    @Test
    public void SSL()
    {
        System.out.println("Title of the page:"+driver.getTitle());
    }
}
