import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UploadingFiles {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void uploadFiles()
    {
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        // enter the file path onto the file selection input field
        uploadElement.sendKeys("E:\\sample.docx");
        //check the checkbox
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.name("send")).click();


    }
}
